import feedparser
import os
import re

# 본인의 벨로그 아이디로 수정하세요!
VELOG_ID = "beam0331"
RSS_URL = f"https://v2.velog.io/rss/{VELOG_ID}"

TARGET_DIR = "velog_backup/posts"

def backup_velog():
    feed = feedparser.parse(RSS_URL)
    if not os.path.exists("posts"):
        os.makedirs("posts")

    for entry in feed.entries:
        # 파일명으로 사용할 수 없는 문자 제거
        clean_title = re.sub(r'[\\/*?:"<>|]', "", entry.title)
        file_path = os.path.join(TARGET_DIR, f"{clean_title}.md")
        
        # 이미 존재하는 파일은 건너뛰기
        if os.path.exists(file_path):
            continue

        with open(file_path, "w", encoding="utf-8") as f:
            f.write(f"# {entry.title}\n\n")
            f.write(f"작성일: {entry.published}\n")
            f.write(f"링크: {entry.link}\n\n")
            f.write("---\n\n")
            f.write(entry.description)
        print(f"Backed up: {entry.title}")

if __name__ == "__main__":
    backup_velog()

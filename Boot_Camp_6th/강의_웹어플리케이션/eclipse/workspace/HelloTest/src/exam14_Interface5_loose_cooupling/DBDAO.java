package exam14_Interface5_loose_cooupling;

public interface DBDAO {
	
	// DB 연동시 종류와 무관하게 연동할 수 있는 메서드
	public abstract void connectDB();

}

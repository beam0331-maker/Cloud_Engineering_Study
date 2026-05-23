package com.exam.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoDTO {

    @NotBlank(message = "적어도 한글자 이상 입력.")
    String userid;
    @Size(min = 5, message = "최소 5글자 이상 입력.")
    String description;
    @NotNull
    @FutureOrPresent(message = "현재 날짜 또는 미래 날짜를 입력.")
    LocalDate targetDate;

    public TodoDTO() {
    }

    public TodoDTO(String userid, String description, LocalDate targetDate) {
        this.userid = userid;
        this.description = description;
        this.targetDate = targetDate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "TodoDTO{" +
                "userid='" + userid + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                '}';
    }
}

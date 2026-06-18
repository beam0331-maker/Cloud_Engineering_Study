package com.exam.dto;

import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoDTO {

    String userid;

    String description;

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

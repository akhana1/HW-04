package com.Csc340.Assignment4.Goal;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;
@Entity
@Table(name="goal")

public class Goal {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    public int goalId;

    public int userId;

    public String title;

    @NotNull
    public String detail;

    @Nullable
    private Date targetDate;

    private String status;

    public Goal(){

    }


    public Goal(int goalId, int userId, String title, String detail, @NonNull Date targetDate, String status) {
        this.goalId = goalId;
        this.userId = userId;
        this.title = title;
        this.detail = detail;
        this.targetDate = targetDate;
        this.status = status;
    }

    public int getGoalId() {
        return goalId;
    }

    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @NonNull
    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(@NonNull Date targetDate) {
        this.targetDate = targetDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

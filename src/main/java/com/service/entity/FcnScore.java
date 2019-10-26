package com.service.entity;

import lombok.Data;

@Data
public class FcnScore {
    private Long id;

    private String staff;

    private Integer subjectId;

    private String score1;

    private String score2;

    private String score3;

    private String score4;

    private String score5;

    private String score6;

    private String score7;

    private String score8;

    private String score9;

    private String score10;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff == null ? null : staff.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getScore1() {
        return score1;
    }

    public void setScore1(String score1) {
        this.score1 = score1 == null ? null : score1.trim();
    }

    public String getScore2() {
        return score2;
    }

    public void setScore2(String score2) {
        this.score2 = score2 == null ? null : score2.trim();
    }

    public String getScore3() {
        return score3;
    }

    public void setScore3(String score3) {
        this.score3 = score3 == null ? null : score3.trim();
    }

    public String getScore4() {
        return score4;
    }

    public void setScore4(String score4) {
        this.score4 = score4 == null ? null : score4.trim();
    }

    public String getScore5() {
        return score5;
    }

    public void setScore5(String score5) {
        this.score5 = score5 == null ? null : score5.trim();
    }

    public String getScore6() {
        return score6;
    }

    public void setScore6(String score6) {
        this.score6 = score6 == null ? null : score6.trim();
    }

    public String getScore7() {
        return score7;
    }

    public void setScore7(String score7) {
        this.score7 = score7 == null ? null : score7.trim();
    }

    public String getScore8() {
        return score8;
    }

    public void setScore8(String score8) {
        this.score8 = score8 == null ? null : score8.trim();
    }

    public String getScore9() {
        return score9;
    }

    public void setScore9(String score9) {
        this.score9 = score9 == null ? null : score9.trim();
    }

    public String getScore10() {
        return score10;
    }

    public void setScore10(String score10) {
        this.score10 = score10 == null ? null : score10.trim();
    }
}
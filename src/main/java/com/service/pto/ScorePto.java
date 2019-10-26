package com.service.pto;

import lombok.Data;

import java.util.List;

@Data
public class ScorePto {

    private String subjectId;

    private List<String> answers;
}

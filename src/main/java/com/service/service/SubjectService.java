package com.service.service;

import com.service.entity.FcnScore;
import com.service.entity.FcnSubject;
import com.service.mapper.FcnScoreMapper;
import com.service.mapper.FcnSubjectMapper;
import com.service.pto.ScorePto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class SubjectService {
    @Autowired
    private FcnSubjectMapper fcnSubjectMapper;
    @Autowired
    private FcnScoreMapper fcnScoreMapper;

    @Cacheable(cacheNames = {"subject"})
    public FcnSubject findByValid(){
        FcnSubject fcnSubject=fcnSubjectMapper.selectByValid();
        if(fcnSubject==null){
            throw new RuntimeException("没有该主题的信息");
        }
        return fcnSubject;
    }

    @Transactional(readOnly = false)
    public void insertScore(String workNum, ScorePto pto){
        FcnScore score=new FcnScore();
        List<String> scores=pto.getAnswers();

        score.setStaff(workNum);
        score.setSubjectId(Integer.valueOf(pto.getSubjectId()));
        score.setScore1(scores.get(0));
        score.setScore2(scores.get(1));
        score.setScore3(scores.get(2));
        score.setScore4(scores.get(3));
        score.setScore5(scores.get(4));
        score.setScore6(scores.get(5));
        score.setScore7(scores.get(6));
        score.setScore8(scores.get(7));
        score.setScore9(scores.get(8));
        score.setScore10(scores.get(9));

        int s=fcnScoreMapper.insertSelective(score);

        System.out.println(s);

    }
}

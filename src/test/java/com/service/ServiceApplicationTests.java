package com.service;

import com.service.entity.FcnStaff;
import com.service.entity.FcnSubject;
import com.service.mapper.FcnStaffMapper;
import com.service.mapper.FcnSubjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {
    @Autowired
    private FcnStaffMapper fcnStaffMapper;
    @Autowired
    private FcnSubjectMapper fcnSubjectMapper;

    @Test
    public void contextLoads() {
        FcnStaff staff=new FcnStaff();
        staff.setWorkNumber("277679");
        staff.setName("sjj");
        staff.setDeptId(1);
        int t=fcnStaffMapper.insertSelective(staff);
        System.out.println(1);
    }

    @Test
    public void testSelectSubject(){
        FcnSubject subject=fcnSubjectMapper.selectByValid();
        System.out.println(subject.getTrainName());
    }

}

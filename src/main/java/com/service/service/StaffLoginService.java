package com.service.service;

import com.service.entity.FcnStaff;
import com.service.mapper.FcnDeptMapper;
import com.service.mapper.FcnStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class StaffLoginService {

    @Autowired
    private FcnStaffMapper fcnStaffMapper;
    @Autowired
    private FcnDeptMapper fcnDeptMapper;

    @Cacheable(cacheNames = {"staff"})
    public FcnStaff selectByNum(String num){
        FcnStaff staff=fcnStaffMapper.selectStaffByNum(num);
        return staff;
    }

}

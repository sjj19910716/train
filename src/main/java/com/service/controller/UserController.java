package com.service.controller;

import com.service.entity.FcnStaff;
import com.service.entity.FcnSubject;
import com.service.pto.ScorePto;
import com.service.result.ResponseResult;
import com.service.service.StaffLoginService;
import com.service.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

import java.util.List;

import static com.service.config.utils.ControllerUrls.USER;


@Controller
@RequestMapping(USER)
public class UserController {

    @Autowired
    private StaffLoginService staffLoginService;
    @Autowired
    private SubjectService subjectService;

   //跳转到登录页面
    @GetMapping("/login.html")
    public String loginView(){
        return "user_login";
    }

    //登录逻辑
    @GetMapping("/toLogin.do")
    @ResponseBody
    public ResponseResult<Void> toLogin(String num, HttpSession session){
        ResponseResult<Void> rr=new ResponseResult<Void>();
        FcnStaff staff=staffLoginService.selectByNum(num);
        if(staff!=null){
            session.setAttribute("staff",staff);
            rr.setState(1);
            rr.setMessage("登录成功");
        }else{
            rr.setState(0);
            rr.setMessage("没有此工号信息");
        }
        return rr;
    }

    @GetMapping("/subject.html")
    public String subjectView(Model model){
        FcnSubject subject=subjectService.findByValid();
        model.addAttribute("subject",subject);
        return "subject";
    }


    @GetMapping("/question.html")
    public String questionView(Model map){
        FcnSubject subject=subjectService.findByValid();
        try {
            if(subject==null){
                map.addAttribute("error","没有此主题的内容信息");
                return "error";
            }else{
                map.addAttribute("subject",subject);
                return "question";
            }
        }catch (RuntimeException e){
            map.addAttribute("error",e.getMessage());
            return "error";
        }
    }

    @ResponseBody
    @PostMapping("/submit.do")
    public ResponseResult<Void> toSubmit(@RequestBody ScorePto pto,HttpSession session){
        ResponseResult<Void> rr=new ResponseResult<Void>();
        FcnStaff staff=(FcnStaff)session.getAttribute("staff");
        String workNum=staff.getWorkNumber();
        try {
            subjectService.insertScore(workNum,pto);
            rr.setState(1);
            rr.setMessage("提交成功");
        }catch (RuntimeException e){
            rr.setState(0);
            rr.setMessage("提交失败");
        }

        return rr;
    }

    @GetMapping("/thanks.html")
    public String thanksView(){
        return "thanks";
    }
}

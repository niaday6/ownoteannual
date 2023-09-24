package com.project.ownote.emp.signUp.controller;

import com.project.ownote.emp.signUp.dto.SignUpDto;
import com.project.ownote.emp.signUp.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SignUpController {

    @Autowired
    SignUpService signUpService;

    private int currentEmpNum = 1000;

    @RequestMapping(value = "/emp/signUp", method = RequestMethod.GET)
    public String getSignUp() {
        return "/emp/signUpForm";
    }

    @RequestMapping(value = "/emp/logIn", method = RequestMethod.POST)
    public String postSignUp(@ModelAttribute SignUpDto signUpDto, RedirectAttributes redirectAttributes) {
        try {
            Integer empNum = signUpDto.getEmpNum();

            if (empNum == null){
                signUpDto.setEmpNum(currentEmpNum);
                currentEmpNum++;
            }
            if (!signUpDto.getEmpEmail().contains("@")) {
                signUpDto.setEmpEmail(signUpDto.getEmpEmail() + "@ownnote.com");
            } else {
                redirectAttributes.addFlashAttribute("error", "영문 숫자 조합만 입력이 가능합니다.");
            }
            signUpService.insertEmp(signUpDto);
            return "/emp/logIn";
        } catch (Exception e) {
            // 회원가입 실패 처리
            redirectAttributes.addFlashAttribute("error", "회원가입에 실패했습니다. 다시 시도해주세요.");
            return "redirect:/emp/signUp";
        }
    }
}

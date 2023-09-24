package com.project.ownote.emp.adress.controller;

import com.project.ownote.emp.adress.dto.EmpAdressDto;
import com.project.ownote.emp.adress.service.EmpAdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmpAdressController {

    @Autowired
    private EmpAdressService empAdressService;

    @RequestMapping(value = "/emp/adress", method = RequestMethod.GET)
    public String getEmpAddress(Model model) {
        List<EmpAdressDto> getEmpAddress = empAdressService.getEmpAddress();
        model.addAttribute("getEmpAddress", getEmpAddress);
        return "/emp/adress";
    }
}

package com.project.ownote.annualData.controller;

import com.project.ownote.annual.dao.AnnualDao;
import com.project.ownote.annual.dto.AnnualDto;
import com.project.ownote.annual.entity.Annual;
import com.project.ownote.annual.repository.AnnualEm;
import com.project.ownote.annualData.dto.AnnData;
import com.project.ownote.annualData.repository.AnnDT;
import com.project.ownote.annualData.repository.AnnualDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//@RequestMapping("/annual")

@Controller
public class AnnDataController {
    @Autowired
    AnnDT annDT;
@Autowired
    AnnualDao annualDao;
    @Autowired
    AnnualDataRepository annualDataRepository;
@Autowired
    AnnualEm annualEm;

//    @RequestMapping(value = "/anndata", method = RequestMethod.GET)
//    public String AnnualData(Model model){
//        List<AnnData> list = annDT.findAll();
//        model.addAttribute("list",list);
//        return "annual/AnnualData";
//    }

    @RequestMapping(value = "/anndata/{emp_id}", method = RequestMethod.GET)
    public String AnnualData(Model model, @PathVariable ("emp_id")Integer emp_id){
        List<AnnData> list = annDT.selectListAll(emp_id);
        model.addAttribute("list",list);
        List<AnnualDto>list1= annualDao.annualListByID(emp_id);
        model.addAttribute("list1",list1);
        return "annual/AnnualData";
    }




}

package com.nf147.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nf147.ssm.dao.RanMapper;
import com.nf147.ssm.entity.Ran;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RanController {

    @Autowired
    private RanMapper ranMapper;

//    @RequestMapping(value = "/list")
//    public String list(Model model, @RequestParam(defaultValue = "1") int page){
//        PageHelper.startPage(page,10);
//        List<Ran> rans = ranMapper.selectAll();
//        model.addAttribute("rans",rans);
//        model.addAttribute("pageInfo",new PageInfo<>(rans));
//        return "index";
//    }
}

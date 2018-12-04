package com.nf147.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nf147.ssm.dao.TScoreMapper;
import com.nf147.ssm.entity.Ran;
import com.nf147.ssm.entity.TScore;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

public class ScoreController {
    @Autowired
    private TScoreMapper tScoreMapper;

    @RequestMapping(value = "/score/list",method = RequestMethod.GET)
    public String list(Model model, @RequestParam(defaultValue = "1") int page){
        PageHelper.startPage(page,10);
        List<TScore> scores = tScoreMapper.selectAll();
        model.addAttribute("scores",scores);
        model.addAttribute("info",new PageInfo<>(scores));
        return "list";
    }

    @RequestMapping(value = "/score/delete",method = RequestMethod.GET)
    public String delete(@RequestParam("id") int id){
        tScoreMapper.deleteByPrimaryKey(id);
        return "redirect:list";
    }

    @RequestMapping(value = "/score/insert",method = RequestMethod.POST)
    public String insert(TScore score){
        tScoreMapper.insert(score);
        return "redirect:list";
    }
}

package com.nf147.ssm.controller;

import com.nf147.ssm.dao.AuthorMapper;
import com.nf147.ssm.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/xxx")
public class AuthorController {

    @Autowired
    private AuthorMapper authorMapper;

//    @RequestMapping(value = "/aaa")
//    public String list(RedirectAttributes redirectAttributes){
//        redirectAttributes.addFlashAttribute("aaa","aaa");
//        return "redirect:/bbb";
//    }
//
//    @RequestMapping(value = "/bbb")
//    public String bbb(){
//        return "home";
//    }
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model){
        List<Author> authors = authorMapper.selectAll();
        model.addAttribute("authors",authors);
        return "list3";
    }

    @RequestMapping(path = "authorId" ,method = RequestMethod.GET)
    public String select(Model model, @RequestParam("authorId") int id){
        Author author = authorMapper.selectByPrimaryKey(1);
        model.addAttribute("author",author);
        return "list4";
    }
}

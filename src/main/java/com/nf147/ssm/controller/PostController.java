package com.nf147.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nf147.ssm.dao.AuthorMapper;
import com.nf147.ssm.dao.PostMapper;
import com.nf147.ssm.dao.TScoreMapper;
import com.nf147.ssm.entity.Author;
import com.nf147.ssm.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PostController {

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private AuthorMapper authorMapper;

    @RequestMapping(value = "/post/list", method = RequestMethod.GET)
    public String list(Model model, @RequestParam(defaultValue = "1") int page) {
        PageHelper.startPage(page, 2);
        List<Post> posts = postMapper.selectAll();
        List<Author> authors = authorMapper.selectAll();
        model.addAttribute("posts", posts);
        model.addAttribute("PostInfo", new PageInfo<>(posts));
        model.addAttribute("authors", authors);
        model.addAttribute("AuthorInfo", new PageInfo<>(authors));
        return "list2";
    }

    @RequestMapping(value = "/post/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("id") int id) {
        postMapper.deleteByPrimaryKey(id);
        return "redirect:list";
    }

    @RequestMapping(value = "/post/insert", method = RequestMethod.POST)
    public String insert(Post post) {
        postMapper.insert(post);
        return "redirect:list";
    }
}

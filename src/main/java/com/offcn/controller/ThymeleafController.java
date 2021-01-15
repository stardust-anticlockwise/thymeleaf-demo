package com.offcn.controller;

import com.offcn.vo.UserVo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("thymeleafs")
public class ThymeleafController {

    //入门案例 -- 先了解一下thymeleaf模板引擎如何使用
    @GetMapping("first")
    public String first(Model model){
        model.addAttribute("name","张飞");
        return "index.html";
    }

    //实现实体类对象封装的数据的处理
    @GetMapping("second")
    public String second(Model model){
        UserVo user = new UserVo();
        user.setUid(1001);
        user.setUname("guanyu");
        user.setUsex("nan");
        model.addAttribute("user",user);
        return "index.html";
    }

    //处理列表
    @GetMapping("third")
    public String third(Model model){
        List<UserVo>list = new ArrayList<>();

        UserVo user1 = new UserVo();
        user1.setUid(1001);
        user1.setUname("guanyu1");
        user1.setUsex("nan");

        UserVo user2 = new UserVo();
        user2.setUid(1002);
        user2.setUname("guanyu2");
        user2.setUsex("nan");

        UserVo user3 = new UserVo();
        user3.setUid(1003);
        user3.setUname("guanyu2");
        user3.setUsex("nan");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("list",list);

        return "index.html";
    }

    //处理图片
    @GetMapping("forth")
    public String forth(Model model){
        model.addAttribute("image1","../1.jpg");
        return "index.html";
    }

    //处理字符串拼接功能 -- 不是后台的拼接，是在HTML模板界面中拼接
    @GetMapping("fifth")
    public String fifth(Model model){
        model.addAttribute("name","张飞");
        return "index.html";
    }

    //处理选择判断功能
    @GetMapping("sixth")
    public String sixth(Model model){
        model.addAttribute("bo","no");
        return "index.html";
    }

    //测试静态资源的加载实现
    @GetMapping("seventh")
    public String seventh(){
        return "index.html";
    }

    public String ggg(){
        return null;
    }
}

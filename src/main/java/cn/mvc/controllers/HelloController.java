package cn.mvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//把类标记成bean组件
@Controller
public class HelloController {


    //RequestMapping 将方法映射到url请求处理
    //springmvc 参数自动匹配请求的参数值
    @RequestMapping("/Hello")
    public String hello(String name){
        System.out.println("Hello springmvc"+name);

        //相应
        //redirect 重定向
        //forward 转发 默认
        return "index.jsp";
    }
}

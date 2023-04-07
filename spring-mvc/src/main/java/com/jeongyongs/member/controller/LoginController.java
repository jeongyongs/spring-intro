package com.jeongyongs.member.controller;

import com.jeongyongs.member.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request) {
        String id = request.getParameter("id");
        String pw = request.getParameter("pw");
        String result = loginService.login(id, pw);
        model.addAttribute("result", result);
        return "login-result";
    }
}

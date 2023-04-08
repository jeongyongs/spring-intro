package com.jeongyongs.member.controller;

import com.jeongyongs.member.domain.LoginForm;
import com.jeongyongs.member.service.LoginService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
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
    public String loginPost(Model model, LoginForm loginForm, HttpSession session, HttpServletResponse response,
                        @CookieValue(value = "color", required = false) Cookie cookie) {
//    public String login(Model model, @RequestParam("id") String id, @RequestParam("pw") String pw) {
//    public String login(HttpServletRequest request) {
//        String id = request.getParameter("id");
//        String pw = request.getParameter("pw");

        if (session.getAttribute("user") != null) {
            return "login-result";
        }

        boolean result = loginService.login(loginForm.getId(), loginForm.getPw());
        model.addAttribute("result", result);
        model.addAttribute("username", loginForm.getId());

        if (result) {
            session.setAttribute("user", loginForm.getId());
            if (cookie == null) {
                response.addCookie(new Cookie("color", "red"));
            }
        }

        return "login-result";
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.GET)
    public String loginGet(HttpSession session){
        if (session.getAttribute("user") != null) {
            return "login-result";
        }
        return "index";
    }
}

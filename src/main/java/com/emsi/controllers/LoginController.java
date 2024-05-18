/*
package com.emsi.controllers;

import com.emsi.models.Gestionnaire;
import com.emsi.repositories.GestionnaireRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private GestionnaireRepository gestionnaireRepository;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, HttpSession session) {
        Gestionnaire gestionnaire = gestionnaireRepository.findByUsername(username);
        if (gestionnaire != null && gestionnaire.getPassword().equals(password)) {
            session.setAttribute("user", gestionnaire);
            return "redirect:/home";
        }
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
*/
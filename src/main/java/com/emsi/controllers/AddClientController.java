package com.emsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.emsi.models.Client;
import com.emsi.repositories.*;

@Controller
public class AddClientController {
       @Autowired
        private AddClientRepository clientRepository;


    }


package com.jpa.learn.Spring.Data.Jpa.controller;

import com.jpa.learn.Spring.Data.Jpa.Service.jpaService;
import com.jpa.learn.Spring.Data.Jpa.jpaModals.Retrieval;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class jpaController {

    @Autowired
    jpaService service;

    @RequestMapping("/getlist")
        public List<Retrieval>  getdata(){

        return service.getlist();
         }


    @RequestMapping("/savedata")
    public void savedata(){

       // service.saveOrUpdate(list);
    }

    @RequestMapping("/native")
    public void savenative(){

        service.nativaequeryexample();
        // service.saveOrUpdate(list);
    }


    }




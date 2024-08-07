package com.heiyu.controller;

import com.heiyu.service.PokerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
public class PokerController {

    @Autowired
    private PokerService pokerService;

    @GetMapping("/shuffle")
    @ResponseBody
    public List<Map> showPork(int num) {
        return pokerService.shuffle(num);
    }

}

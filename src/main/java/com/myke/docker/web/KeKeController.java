package com.myke.docker.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user: zhangjianbin <br/>
 * date: 2018/7/1 15:40
 */
@RestController
public class KeKeController {

    @GetMapping("/keke")
    public String Keke() {
        return "keke i love you !!!";
    }
}

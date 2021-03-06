package com.atguigu.springcloud.service.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @RequestMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}

package com.xiao.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xiao.webSocket.WebSocketServer;

@RestController
public class SendMessageController {

    @RequestMapping("sendInfo")
    public String sendInfo(@RequestParam String msg) {
        try {
            WebSocketServer.sendInfo(msg);
        } catch (Exception e) {
            e.printStackTrace();
            return "信息发送异常!";
        }
        return "发送成功~";
    }
}

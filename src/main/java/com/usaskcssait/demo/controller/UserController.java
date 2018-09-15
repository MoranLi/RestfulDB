package com.usaskcssait.demo.controller;


import com.usaskcssait.demo.object.user;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class UserController {

    @RequestMapping(method=GET,value="/user")
    public user greeting(@RequestParam(value="id", defaultValue="0", required=true) String id,
                         @RequestParam(value="name", defaultValue="World", required=true) String name,
                         @RequestParam(value="wechatId", defaultValue="aaaaaa", required=true) String wechatId,
                         @RequestParam(value="name", defaultValue="male", required=true) String gender,
                         @RequestParam(value="wechatId", defaultValue="1.8", required=true) String height,
                         @RequestParam(value="name", defaultValue="18", required=true) String age) {
        try{
            return new user(Integer.parseInt(id),gender.equals("male")?true:false, Double.parseDouble(height),Integer.parseInt(age),name,wechatId);
        }catch(Exception e){
            return null;
        }
    }

}

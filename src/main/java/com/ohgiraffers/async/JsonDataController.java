package com.ohgiraffers.async;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class JsonDataController {

    @GetMapping("/json-data")
    public String showJsonData() {

        return "async/json-data";
    }

    /* @RequestBody : 요청 바디에 담긴 데이터를 java 객체에 매핑할 때 사용하는 어노테이션
    * Spring boot web 에는 Jackson-databind 라이브러리가 기본 포함 되어 JSON => Java Object parsing이 자동으로 처리 된다.
    * 1. String
    * {"nickname":"하이","age":"30","email":"qnfnsk45@naver.com","registDate":"2021-10-29"}
    * 2. Map
    * {nickname=하이, age=30, email=qnfnsk45@naver.com, registDate=2021-10-29}
    * 3. UserDTO
    * UserDTO{id='null', nickname='하이', age=30, email='qnfnsk45@naver.com', registDate=Tue Sep 29 09:00:00 KST 2020}
    * */
    @PostMapping("/jquery/json")
    public @ResponseBody String jqueryJsonTest(@RequestBody UserDTO requestBody) {

        System.out.println("requestBody : " + requestBody);

        return "success";
    }
}

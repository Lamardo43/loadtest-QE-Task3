package com.example.springapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

    @PostMapping("/post-message")
    public ResponseData processRequest(@RequestBody RequestData requestData) {
        // Извлечение данных из входящего запроса
        String inputSide = requestData.getMsg_id();


        // Создание ответа с данными из входящего запроса
        ResponseData responseData = new ResponseData();

        responseData.setMsg_id(inputSide);
        responseData.setTimestamp("timestamp");
        responseData.setMethod("method");
        responseData.setUrl("url");

        return responseData;
    }
}

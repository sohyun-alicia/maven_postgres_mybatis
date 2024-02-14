package com.example.maven_postgres_mybatis.controller;

import com.example.maven_postgres_mybatis.service.ClientService;
import com.example.maven_postgres_mybatis.vo.ClientVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/getList")
    public ResponseEntity<List<ClientVo>> getClientList() {
        List<ClientVo> allClient = clientService.getAllClient();
        return new ResponseEntity<>(allClient, HttpStatus.OK);
    }

}

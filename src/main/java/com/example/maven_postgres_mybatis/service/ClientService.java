package com.example.maven_postgres_mybatis.service;

import com.example.maven_postgres_mybatis.vo.ClientVo;

import java.util.List;

public interface ClientService {
    ClientVo insertClient();
    List<ClientVo> getAllClient();
}

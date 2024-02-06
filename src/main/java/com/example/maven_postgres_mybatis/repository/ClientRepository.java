package com.example.maven_postgres_mybatis.repository;

import com.example.maven_postgres_mybatis.vo.ClientVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientRepository {
    List<ClientVo> getAllClient();
}

package com.example.maven_postgres_mybatis.vo;


import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ClientVo")
public class ClientVo {
    Integer id;
    String name;
    String cellphone;

}

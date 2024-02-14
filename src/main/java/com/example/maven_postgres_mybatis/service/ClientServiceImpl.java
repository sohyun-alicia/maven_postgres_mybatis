package com.example.maven_postgres_mybatis.service;

import com.example.maven_postgres_mybatis.repository.ClientRepository;
import com.example.maven_postgres_mybatis.vo.ClientVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public ClientVo insertClient() {
        return null;
    }

    @Override
    public List<ClientVo> getAllClient() {
        return clientRepository.getAllClient();
    }
}

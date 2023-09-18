package com.senac.TesteCacheJava;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TesteCacheService {

    @Cacheable(value = "teste", key = "#key")
    public String getValor(String valor){
        return "";
    }
}

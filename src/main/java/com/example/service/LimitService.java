package com.example.service;

import com.example.entity.Limit;
import com.example.properties.Configuration;
import com.example.repository.LimitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LimitService {

    @Autowired
    private LimitRepository limitRepository;

    @Autowired
    private Configuration configuration;

    public void save(Limit limit) {
        limitRepository.save(limit);
    }

    public List<Limit> findAll() {
        return limitRepository.findAll();
    }

    public Limit getLimit() {
        return new Limit(configuration.getMaximum(), configuration.getMinimum());
    }
}

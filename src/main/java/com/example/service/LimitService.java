package com.example.service;

import com.example.entity.Limit;
import com.example.repository.LimitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LimitService {

    @Autowired
    private LimitRepository limitRepository;

    public void save(Limit limit) {
        limitRepository.save(limit);
    }

    public List<Limit> findAll() {
        return limitRepository.findAll();
    }
}

package com.example.learnspb.service;

import com.example.learnspb.bean.Demo;
import com.example.learnspb.dao.IDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("demoService")
public class DemoService {

    @Autowired
    private IDemoRepository demoRepository;

    @Transactional
    public void save(Demo demo) {
        demoRepository.save(demo);
    }

}

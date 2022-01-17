package com.example.learnspb.test;

import com.example.learnspb.bean.Demo;
import com.example.learnspb.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = { LearnspbApplication.class })
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TestDemoService {

    @Autowired
    private DemoService demoService;

    @Test
    public void testSave() {
         demoService.save(new Demo("yjnnnnnn"));
    }

}

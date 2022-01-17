package com.example.learnspb.dao;

import com.example.learnspb.bean.Demo;
import org.springframework.data.repository.CrudRepository;

public interface IDemoRepository extends CrudRepository<Demo, Integer> {

}

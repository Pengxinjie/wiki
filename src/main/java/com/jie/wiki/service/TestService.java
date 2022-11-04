package com.jie.wiki.service;

import com.jie.wiki.domain.Test;
import com.jie.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Pengxinjie
 * @DATE 2022/11/4 - 11:22
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
}

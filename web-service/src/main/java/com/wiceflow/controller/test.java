package com.wiceflow.controller;

import com.wiceflow.entity.dao.Active;
import com.wiceflow.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by BF on 2017/7/22.
 */
@Controller
public class test {
    /**
     * 加载依赖
     */
    @Autowired
    private ActiveService activeService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void query()
    {
        System.out.println("`111");
        List<Active> list = activeService.queryAll();
        for (Active active : list)
        {
            System.out.println(active.toString());
        }
    }

}

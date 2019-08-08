package com.principle.command;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 类描述:
 *
 * @author 陈恩惠
 * @since 2019年08月08日 16:31:00
 */
@RestController
public class TestAoPage {
    @Autowired
    private Cmapper cmapper;

    @RequestMapping("/test")
    @PageAnn
    public Object  success(@RequestBody Map<String,Object> objectMaps) {
        List<Map<String, Object>> list = cmapper.findList();
        return list;
    }
}

package com.gbloch.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <br>
 * Created on 27/02/2021
 *
 * @author gbloch
 * @version 1.0
 * @since 1.0
 */
@RestController
public class ExampleController {
    @RequestMapping("/")
    public Map<String, Object> getIndex() {
        Map<String, Object> result = new HashMap<>();
        result.put("hello", "world");
        return result;
    }
}

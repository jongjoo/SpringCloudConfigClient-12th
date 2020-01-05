package com.sample.Configclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class ConfigClientController {

    @Value("${jongjoo.profile}")
    private String identity;
    @Value("${jongjoo.said.first}")
    private String strOne;
    @Value("${jongjoo.said.second}")
    private String strTwo;


    @GetMapping("/test")
    public String test() {
        return identity;
    }

    @GetMapping("/testStr")
    public Map<String, String> testStr() {
        Map<String, String> keyword = new HashMap<>();
        keyword.put("first", strOne);
        keyword.put("second", strTwo);
        return keyword;
    }
}

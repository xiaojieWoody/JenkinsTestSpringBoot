package com.mylicense.test;

import com.mylicense.config.LicenseInfoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

//    @Value("${license.test}")
//    private String test;

//    @Autowired
//    private ExampleService exampleService;
//
//
    @Autowired
    private LicenseInfoProperties licenseInfoProperties;

    @RequestMapping("/test")
    public String getTest() {
        return licenseInfoProperties.getRemainTime();
    }
}

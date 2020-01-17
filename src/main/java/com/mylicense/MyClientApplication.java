package com.mylicense;

import com.mylicense.api.LicenseInit;
import com.mylicense.test.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyClientApplication.class, args);
		LicenseInit.init();
//		Test.init();
	}

}

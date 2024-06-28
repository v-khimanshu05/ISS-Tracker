package com.himanshu.isslocationservice;

import com.himanshu.isslocationservice.responsedto.IssLocationResponseDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class IssLocationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IssLocationServiceApplication.class, args);
//            IssLocationResponseDto issLocationResponseDto
//                    =new RestTemplate()
//                    .getForObject("http://api.open-notify.org/iss-now.json", IssLocationResponseDto.class);


    }
}

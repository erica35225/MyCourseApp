package com.courses.Services;

import com.courses.Dtos.UsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    public UsersDto getUsers() {
        UsersDto data = restTemplate.exchange(getUrl(), HttpMethod.GET, HttpEntity.EMPTY, UsersDto.class).getBody();
     //   userDto = restTemplate.getForObject("https://reqres.in/api/2",UsersDto.class);
       System.out.println("------------{}{}{} "+data);
        return  data;
    }

    private String getUrl() {
        return "https://reqres.in/api/2";
    }
}

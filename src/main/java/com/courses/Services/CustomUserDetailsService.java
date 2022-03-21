package com.courses.Services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       if(username.equalsIgnoreCase("erica")){
           return new User("erica","erica1234",new ArrayList<>());
       }
       else {
           throw new UsernameNotFoundException("username is not available");
       }
    }
}

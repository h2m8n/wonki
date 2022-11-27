package com.ssu.wonki.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssu.wonki.repository.UserRepository;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class CalenderController {
	private final UserRepository userRepository;
	SecurityContext context = SecurityContextHolder.getContext();
	Authentication authentication = context.getAuthentication();
	
    //daily 일정조회 
    @PostMapping("/calender/getDaily")
    public String getDaily(Authentication authentication) {
    	Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    	System.out.println(principal);
//    	UserDetails userDetails = (UserDetails) authentication.getPrincipal();    	
//    	System.out.println("test : " + userDetails.getUsername());
    	
    	return "S";
//        User member = userRepository.findById(userId)
//                .orElseThrow(() -> new IllegalArgumentException("가입되지 않은 E-MAIL 입니다."));
//        
//        return member.getEmail();
        
    }
}

package com.zeus.web;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testController {
	
	@GetMapping("/dataTest")
    public Map<String, Object> dataTest(){
     return Map.of( " Message", "dataTest");
 }
}

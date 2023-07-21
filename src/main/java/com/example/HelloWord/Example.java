package com.example.HelloWord;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController

public class Example {
	@GetMapping(value= "/getMathods")
	public String getReq() {
		return "hello.html";
	}// git checking

	@GetMapping(value= "/getM")
	public ResponseEntity<String>  getModel() {
		return new ResponseEntity<>("hello.html",HttpStatus.BAD_REQUEST);
	}
	// git checking anotherbranch
	
	
	@GetMapping(value= "/pathparam")
	public String Forparam(@PathParam("username") String username , @PathParam("pwd")String pwd) {
		if(username.equals("gana")&&pwd.equals("gana123")){
			return "login success";
		}
		else {
			return("invalid");
		}
	}
}


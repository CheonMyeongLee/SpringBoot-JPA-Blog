package com.lcm.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 // 스프링이 com.lcm.blog 패키지 이하를 스캔해서 
 // 특정 어노테이션이 붙어 있는 클래스 파일 스캔 후 스프링 컨테이너로 관리
@RestController
public class BlogControllerTest {

	//http://localhost:8080/test/hello
 @GetMapping("/test/hello")
 public String hello() {
	 return "<h1>hello spring boot</h1>";
 }	
}

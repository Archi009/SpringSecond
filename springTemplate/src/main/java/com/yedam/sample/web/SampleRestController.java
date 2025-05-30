package com.yedam.sample.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //@ResponseBody 포함 
public class SampleRestController {
		
	@GetMapping("/getSample")
	public SampleVO getSample() {
		return new SampleVO(10,"나래","이","1111");
	}
	
	@GetMapping("/getList")
	public List<SampleVO>  getList() {
		return IntStream.range(1,10).mapToObj(i -> new SampleVO(i, i+ "First",i+"Last",i+"Pass")).collect(Collectors.toList());
	}
	
	@GetMapping("/getMap")
	public Map<String,SampleVO> getMethodName() {
		Map<String,SampleVO> map = new HashMap<>();
		map.put("first",new SampleVO(10,"순신","이","PWD"));
		return map;
	}
	
}

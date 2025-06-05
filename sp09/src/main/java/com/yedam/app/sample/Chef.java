package com.yedam.app.sample;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component //@Controller, @Service 는 @Component를 상속받아 만들어진다. 따라서 scan에 걸림
public class Chef {

}

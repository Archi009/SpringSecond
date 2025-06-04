package com.company.user.service;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class MemberVO  {
// 일반 사용하는 VO지만 이를 security가 인식하게 하기 위해  CustomUser를 생성하여 사용자 입맛에 맛는 VO를 security에 사용가능하게 할 수 있다.
	private String userid;
	private String userpw;
	private String userName;
	private boolean enabled;

	private Date regDate;
	private Date updateDate;
	private List<AuthVO> authList;

}

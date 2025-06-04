package com.company.user.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.company.user.mapper.MemberMapper;
import com.company.user.service.CustomUser;
import com.company.user.service.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Setter(onMethod_ = { @Autowired })
	private MemberMapper mapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		MemberVO vo =  mapper.read(username);
		
		log.warn("Load User By UserName: " + username);
		/* 아래 stream을 사용한 방식과 같다
		 * List<SimpleGrantedAuthority> list = new ArrayList<>();
		 * vo.getAuthList().forEach(auth -> list.add(new
		 * SimpleGrantedAuthority((auth.getAuth()))));
		 */
		/*
		 * List<SimpleGrantedAuthority> list = vo.getAuthList().stream().map(auth -> new
		 * SimpleGrantedAuthority(auth.getAuth())).collect(Collectors.toList());
		 */
		// security가 사용하는 VO 를 반환
		return new CustomUser(vo);
	}
	
	
}

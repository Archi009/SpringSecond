package com.company.common.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2

public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication auth) throws IOException, ServletException {
		log.warn("Login Success");

		List<String> roleNames = new ArrayList<>();

		auth.getAuthorities().forEach(authority -> {

			roleNames.add(authority.getAuthority());

		});

		log.warn("ROLE NAMES: " + roleNames);
		///여러 권한이 있다면 최상위 가장 강력한 권한을 체크하는 if문을 가장 위로 올려 강력한 권한에 따른 실행을 진행한다.
		if (roleNames.contains("ROLE_ADMIN")) {

			response.sendRedirect("admin");
			return;
		}

		if (roleNames.contains("ROLE_MEMBER")) {

			response.sendRedirect("member");
			return;
		}

		response.sendRedirect("/");
	}

}

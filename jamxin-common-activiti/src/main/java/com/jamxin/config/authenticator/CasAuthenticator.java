package com.jamxin.config.authenticator;

import javax.servlet.http.HttpServletRequest;

import org.activiti.rest.common.filter.RestAuthenticator;
import org.springframework.web.client.ResourceAccessException;

public class CasAuthenticator implements RestAuthenticator {

	public boolean isRequestAuthorized(HttpServletRequest arg0) {
		
		// check sso token here
		try {
			
		} catch (Exception e) {
			throw new ResourceAccessException("SSO UNAUTHORIZED");
		}
		return false;
	}

	public boolean requestRequiresAuthentication(HttpServletRequest arg0) {
		return false;
	}

}

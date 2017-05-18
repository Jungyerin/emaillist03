package com.jx372.emaillist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jx372.emaillist.dao.EmailListDao;
import com.jx372.emaillist.vo.EmailListVo;
import com.jx372.web.action.Action;
import com.jx372.web.util.WebUtils;

public class InsertAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String firstName=request.getParameter("fn");
    	String lastName=request.getParameter("ln");
    	String email=request.getParameter("email");
		
		EmailListVo vo=new EmailListVo();
		vo.setFirstName(firstName);
		vo.setLastName(lastName);
		vo.setEmail(email);
		
		new EmailListDao().insert(vo);
		
		WebUtils.redirect("/emaillist03/el", request, response);

	}

}

package com.jx372.emaillist.action;

import com.jx372.emaillist.dao.EmailListDao;
import com.jx372.emaillist.vo.EmailListVo;
import com.jx372.web.action.Action;
import com.jx372.web.action.ActionFactory;
import com.jx372.web.util.WebUtils;

public class EmailListActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) { // 액션이름에 따라 각각의 액션을 던져줌
		Action action = null;

		if ("form".equals(actionName)) {
			action=new FormAction();

		} else if ("insert".equals(actionName)) {
			action=new InsertAction();

		} else { // default action(list)
			action=new ListAction();
		}

		return action;
	}

}

package org.test.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.dao.UserDAO;
import org.test.model.User;

/**
 * authername
 * 
 *
 * @author kkj9491
 *
 */

@Controller
public class TestController {
	
	/**
	 * user information
	 * 
	 *
	 * @param user_num
	 * @return user
	 *
	 */	
       
    @RequestMapping(value="/read")
    public String read() {
    	   	
    
    	return "read";
    }
   
    /**
	 * user list return
	 * 
	 *
	 * @param user_num
	 * @return user_list
	 *
	 */	    

	@RequestMapping(value="list")
    public String list() {
    	
	    	
    	return "list";
    }
}

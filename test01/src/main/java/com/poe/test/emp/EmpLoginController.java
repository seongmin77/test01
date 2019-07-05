/* Controller는  Service 호출한다.
 * 
 */
package com.poe.test.emp;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpLoginController {
	@Inject
	private EmpService service;
	
	@RequestMapping("/empcount")
	public String empCount(Model model,HttpServletRequest request) throws Exception {
		//서비스를 호출한다.
		
		model.addAttribute("cnt", service.printCount());
		return("home");
	}

}









/* test/main1.do
 * test/main2.do
 */
package com.poe.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value="/main1",method= RequestMethod.GET)
	public ModelAndView main1(HttpServletRequest request,HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","test : It go main1"); // mav에 데이터(객체) 저장한다.
		mav.setViewName("test/main");   // 이동할 뷰(*.jsp) 를 설정한다.
		return mav;
		
	}
	@RequestMapping(value="/main2",method= RequestMethod.GET)
	public ModelAndView main2(HttpServletRequest request,HttpServletResponse response) throws Exception{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","test : It go main22222222"); // mav에 데이터(객체) 저장한다.
		mav.setViewName("test/main");   // 이동할 뷰(*.jsp) 를 설정한다.
		return mav;
		
	}
}

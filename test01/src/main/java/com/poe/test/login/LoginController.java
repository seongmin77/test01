package com.poe.test.login;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller("LoginController")
public class LoginController {
	@RequestMapping(value="/test/loginForm",method={RequestMethod.GET,RequestMethod.POST})
	//ModelAndView 객체를 이용
	public ModelAndView loginForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test/loginForm");
		return mav;
	}
	
	@RequestMapping(value="/test/login",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test/result");
		String userID = request.getParameter("userID");
		String userName = request.getParameter("userName");
		mav.addObject("userID", userID);
		mav.addObject("userName", userName);
		
		return mav;
		
	}
	
	
	@RequestMapping(value="/test/login3",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login3(@RequestParam Map<String,String> info,HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		ModelAndView mav = new ModelAndView();
		
		// Map에 들어가있는지 확인
		String userid = info.get("userID");
		String username = info.get("userName");
		System.out.println("userID : " +userid);
		System.out.println("userName : " + username);
		// logger찍어보기
		
		mav.addObject("info", info);
		mav.setViewName("test/result");
		return mav;
	}
	
	// VO 로 요청한 데이터 처리하기
	@RequestMapping(value="test/login4",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login4(@ModelAttribute("info") LoginVO loginVO,HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("test/result");
		
		return mav;
	}

	@RequestMapping(value="/test/login5",method={RequestMethod.GET,RequestMethod.POST})
	public String login5(Model model,HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		//model에 키,값을 추가한다.
		model.addAttribute("userID", "HONG");
		model.addAttribute("userName", "홍길동");
		return "test/result";
	}

}









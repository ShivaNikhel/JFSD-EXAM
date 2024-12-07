package com.klef.springboot.controller;



	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;

	@Controller
	@RequestMapping("/")
	public class viewcontroller {
		
		
			@GetMapping("/")
			public ModelAndView customer()
			{
				ModelAndView mvc = new ModelAndView();
				mvc.setViewName("customer.jsp");
				return mvc;
			}
			

	}

}

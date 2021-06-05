package com.casestudy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.casestudy.model.User;
import com.casestudy.service.UserSer;
@Controller
public class MainController {
	@RequestMapping("/homePage")
	public String home() {

		return "homePage";
	}

	// UserRegistration Process
	@Controller
	
	public class UserRegistration {
		
		@Autowired
		private UserSer userSer;
		@RequestMapping("/registrationPage")
		public String ShowRegistrationForm() {
			return "registrationPage";
		}

		// Process to save data
		@RequestMapping(path = "/saveUser", method = RequestMethod.POST)
		public String saveUser(@ModelAttribute("user") User user, Model model) {
			this.userSer.saveUser(user);
			return "registrationPage";
		}
		

		
	}

	// UserLogin Process
	/**@RequestMapping("/authenticateUser")
	public ModelAndView authenticateUser(HttpServletRequest request, @ModelAttribute("user") User user) {
		return "homePage";
	}**/
@Controller
public class MyPets {

	@RequestMapping("/addPetPage")
	public String addPet() {

	return "addPetPage";
	}
}
//
//@Controller
//public class SavePet {
//	@RequestMapping("/myPetsPage")
//	public String index(Model model) {
//
//		return "myPetsPage";
//	}
//}
}
	
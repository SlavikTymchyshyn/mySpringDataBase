package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Adress;
import com.service.AdressService;

@Controller
public class AdressController {
	
	@Autowired
	private AdressService service;

		@RequestMapping(value = "/showAllAdresses")
		public String getAllAdresses(Model model) {
			List<Adress> adresses = service.getAllAdresses();
			model.addAttribute("allAdresses", adresses);
			return "adress-all";
		}
		
		@RequestMapping(value = "/createAdress") 
		public String createAdressPage() {
			return "adress-new";
		}
		
		@RequestMapping(value = "/showAllAdresses", method = RequestMethod.POST)
		public String createAdress(@RequestParam(value = "name") String name) {
			service.addAdress(name);
			return "redirect:/showAllAdresses";
		}
	
}

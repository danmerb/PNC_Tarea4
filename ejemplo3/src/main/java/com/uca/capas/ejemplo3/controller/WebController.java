package com.uca.capas.ejemplo3.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.uca.capas.ejemplo3.validatingforminput.ProductForm;


@Controller
public class WebController {
	

	@RequestMapping("/producto")
	public ModelAndView index11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("prod", new ProductForm());
		mav.setViewName("productoForm");
		return mav;
	}
	@RequestMapping("/response")
	public ModelAndView procesar2(@Valid @ModelAttribute ProductForm produc, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("productoForm");
		}
		else {
			mav.addObject("nombre", produc.getNombreProducto());
			mav.setViewName("respuesta");
		}
		return mav;
	}

}
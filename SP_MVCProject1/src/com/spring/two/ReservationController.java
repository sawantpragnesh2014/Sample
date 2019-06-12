package com.spring.two;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationController {

	@RequestMapping("/booking")
	public String bookingForm(Model m) {
		// TODO Auto-generated method stub
		Reservation res = new Reservation();
		m.addAttribute("reservation", res);
//		hr.in@ifastfinancial.com
		return "BookForm";
	}
	
	@RequestMapping("/submitForm")
	public String onSubmit(@ModelAttribute("reservation")Reservation res) {
		return "confirmation-form";
	}
}

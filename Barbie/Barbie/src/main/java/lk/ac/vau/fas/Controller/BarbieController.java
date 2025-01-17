package lk.ac.vau.fas.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lk.ac.vau.fas.Entity.Cart;
import lk.ac.vau.fas.Entity.Barbie;
import lk.ac.vau.fas.Service.BarbieService;
import lk.ac.vau.fas.Service.CartService;

@Controller
public class BarbieController {
	@Autowired
	private BarbieService service;
	
	@Autowired
	private CartService cService;
	
	@GetMapping("/home")
	public String index() {
		return "home";
	}	
	
	@GetMapping("/edit")
	public String edit() {
		return "Editt";
	}
	
	@GetMapping("/Register")
	public String Register() {
		return "Register";
	}
	
	@GetMapping("/Order")
	public String Order() {
		return "Order";
	}
	
	@GetMapping("/AboutUs")
	public String AboutUs() {
		return "AboutUs";
	}
	
	@GetMapping("/AvailableBarbies")
	public ModelAndView getAllBarbies() {
		List<Barbie> list=service.getAllBarbies();
		//ModelAndView m=new ModelAndView();
		//		m.setViewName("BarbieList");
		//		m.addObject("barbie",list);
		return new ModelAndView("AvailableBarbies","barbie",list);
	}
	
	@PostMapping("/save")
	public String adddBarbie(@ModelAttribute Barbie b) {
		service.saveBarbie(b);
		return "redirect:/AvailableBarbies";
	}
	
	@GetMapping("/Cart")
	public String saveCart(Model model) {
		List<Cart>list=cService.getBarbies();
		model.addAttribute("barbie",list);
		return "Cart";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Barbie b=service.getBarbieById(id);
		Cart mb=new Cart(b.getId(),b.getName(),b.getPrice(),b.getCategory());
		cService.saveCart(mb);
		return "redirect:/Cart";
		
	}
	
	@RequestMapping("/editBarbie/{id}")
	public String editBarbie(@PathVariable("id") int id,Model model) {
		Barbie b=service.getBarbieById(id);
		model.addAttribute("barbie",b);
		return "EditBarbie";
	}
	@RequestMapping("/deleteBarbie/{id}")
	public String deleteBarbie(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/AvailableBarbies";
	}
}

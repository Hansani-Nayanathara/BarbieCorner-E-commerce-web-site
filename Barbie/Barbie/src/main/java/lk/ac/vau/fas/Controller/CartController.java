package lk.ac.vau.fas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lk.ac.vau.fas.Service.CartService;

@Controller
public class CartController {
	@Autowired
	private CartService cService;
	
	@RequestMapping("/deleteList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		cService.deleteById(id);
		return "redirect:/Cart";
	}
}

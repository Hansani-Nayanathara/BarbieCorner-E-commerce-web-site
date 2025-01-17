package lk.ac.vau.fas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.fas.Entity.Cart;
import lk.ac.vau.fas.Repo.CartRepo;

@Service
public class CartService {
	@Autowired
	private CartRepo repo;
	
	public void saveCart(Cart barbie) {
		repo.save(barbie);
	}
	
	public List<Cart> getBarbies(){
		return repo.findAll();
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}

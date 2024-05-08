package lk.ac.vau.fas.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cart {
	
	@Id
	private int id;
	private String name;
	private int price;
	private String category;
	
	public Cart() {
        // Empty constructor required by JPA
    }
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Cart(int id, String name, int price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	
}

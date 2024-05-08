package lk.ac.vau.fas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.fas.Entity.Barbie;
import lk.ac.vau.fas.Repo.BarbieRepo;

@Service
public class BarbieService {
	
	@Autowired
	private BarbieRepo repo;
	public void saveBarbie(Barbie barbie) {
		repo.save(barbie);
	}
	
	public List<Barbie> getAllBarbies(){
		return repo.findAll();
	}
	
	public Barbie getBarbieById(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteById(int id) {
		repo.deleteById(id);
	}
}

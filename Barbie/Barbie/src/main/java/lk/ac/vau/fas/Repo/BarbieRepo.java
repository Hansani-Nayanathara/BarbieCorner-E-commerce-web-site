package lk.ac.vau.fas.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.fas.Entity.Barbie;

@Repository
public interface BarbieRepo extends JpaRepository<Barbie, Integer> {

}

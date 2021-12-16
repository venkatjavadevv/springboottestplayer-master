package com.idc.springboottestplayer.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idc.springboottestplayer.model.Player;

public interface PlayerRepository extends JpaRepository<Player,String> {
	
	List<Player>  findByCountry_Code(String code);
	
	List<Player>  findByCountry_Continent(String continent);
	
	List<Player>  findByRatingGreaterThanEqual(Integer rating);

}

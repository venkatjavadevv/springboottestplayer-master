package com.idc.springboottestplayer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idc.springboottestplayer.model.Player;
import com.idc.springboottestplayer.repositories.PlayerRepository;

@Service
public class PlayerServices {

    @Autowired
    private PlayerRepository pRepository;


    public List<Player> getPlayers() {
        return pRepository.findAll();
    }

    public List<Player> getPlayersByCountryCode(String countryCode) {
        return pRepository.findByCountry_Code(countryCode);
    }

    public List<Player> getPlayersByContinent(String continent) {
        return pRepository.findByCountry_Continent(continent);
    }

    public List<Player> getPlayersGreaterThanRating(Integer rating) {
        return pRepository.findByRatingGreaterThanEqual(rating);
    }
}

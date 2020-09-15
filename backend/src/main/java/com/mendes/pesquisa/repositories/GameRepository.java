package com.mendes.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendes.pesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}

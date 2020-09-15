package com.mendes.pesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mendes.pesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}

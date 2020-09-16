package com.mendes.pesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mendes.pesquisa.dto.RecordDTO;
import com.mendes.pesquisa.dto.RecordInsertDTO;
import com.mendes.pesquisa.entities.Game;
import com.mendes.pesquisa.entities.Record;
import com.mendes.pesquisa.repositories.GameRepository;
import com.mendes.pesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository repository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);

	entity =	repository.save(entity);
	return new RecordDTO(entity);

	}

}

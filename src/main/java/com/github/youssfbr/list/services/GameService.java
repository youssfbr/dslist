package com.github.youssfbr.list.services;

import com.github.youssfbr.list.dto.GameDTO;
import com.github.youssfbr.list.dto.GameMinDTO;
import com.github.youssfbr.list.entities.Game;
import com.github.youssfbr.list.repositories.IGameRepository;
import com.github.youssfbr.list.services.interfaces.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService implements IGameService {

    @Autowired
    private IGameRepository gameRepository;

    @Override
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        return gameRepository.findAll()
                .stream()
                .map(x -> new GameMinDTO(x)).toList();
    }

    @Override
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

}

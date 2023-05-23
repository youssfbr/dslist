package com.github.youssfbr.list.services;

import com.github.youssfbr.list.dto.GameListDTO;
import com.github.youssfbr.list.repositories.IGameListRepository;
import com.github.youssfbr.list.services.interfaces.IGameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService implements IGameListService {

    @Autowired
    private IGameListRepository gameListRepository;

    @Override
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        return gameListRepository.findAll()
                .stream()
                .map(x -> new GameListDTO(x)).toList();
    }



}

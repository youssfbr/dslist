package com.github.youssfbr.list.services.interfaces;

import com.github.youssfbr.list.dto.GameDTO;
import com.github.youssfbr.list.dto.GameMinDTO;
import com.github.youssfbr.list.entities.Game;

import java.util.List;

public interface IGameService {

    List<GameMinDTO> findAll();
    GameDTO findById(Long id);

}

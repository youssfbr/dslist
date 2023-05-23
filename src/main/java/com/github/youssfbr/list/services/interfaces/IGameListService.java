package com.github.youssfbr.list.services.interfaces;

import com.github.youssfbr.list.dto.GameDTO;
import com.github.youssfbr.list.dto.GameListDTO;
import com.github.youssfbr.list.dto.GameMinDTO;

import java.util.List;

public interface IGameListService {

    List<GameListDTO> findAll();


}

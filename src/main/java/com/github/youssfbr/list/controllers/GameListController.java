package com.github.youssfbr.list.controllers;

import com.github.youssfbr.list.dto.GameListDTO;
import com.github.youssfbr.list.dto.GameMinDTO;
import com.github.youssfbr.list.services.interfaces.IGameListService;
import com.github.youssfbr.list.services.interfaces.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private IGameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

}

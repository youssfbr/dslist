package com.github.youssfbr.list.controllers;

import com.github.youssfbr.list.dto.GameDTO;
import com.github.youssfbr.list.dto.GameMinDTO;
import com.github.youssfbr.list.entities.Game;
import com.github.youssfbr.list.services.interfaces.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private IGameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }

}

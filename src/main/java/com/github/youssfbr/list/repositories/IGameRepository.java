package com.github.youssfbr.list.repositories;

import com.github.youssfbr.list.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGameRepository extends JpaRepository<Game, Long> {
}

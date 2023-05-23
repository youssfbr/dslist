package com.github.youssfbr.list.repositories;

import com.github.youssfbr.list.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGameListRepository extends JpaRepository<GameList, Long> {
}

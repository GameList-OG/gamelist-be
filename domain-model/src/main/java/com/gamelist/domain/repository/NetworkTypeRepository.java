package com.gamelist.domain.repository;

import com.gamelist.domain.models.NetworkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkTypeRepository extends JpaRepository<NetworkType, Integer> {}

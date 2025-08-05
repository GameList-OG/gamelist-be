package com.gamelist.domain.repository;

import com.gamelist.domain.models.DateFormat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateFormatRepository extends JpaRepository<DateFormat, Integer> {}

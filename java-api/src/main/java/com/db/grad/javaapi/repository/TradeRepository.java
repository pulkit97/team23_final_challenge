package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Trade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TradeRepository extends JpaRepository<Trade, Integer> {
    @Query(value = "SELECT * FROM trades AS t WHERE t.security_id = :id", nativeQuery = true)
    List<Trade> getAllTransactionsByBoundId(@Param("id") int id);

}

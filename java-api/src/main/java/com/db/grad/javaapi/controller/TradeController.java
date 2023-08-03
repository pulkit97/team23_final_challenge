package com.db.grad.javaapi.controller;

import com.db.grad.javaapi.dto.TransactionDTO;
import com.db.grad.javaapi.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TradeController {
    @Autowired
    TradeService tradeService;

    @GetMapping("/transactions")
    public List<TransactionDTO> getTransactionsByBoundId(int id) {
       return tradeService.getTransactionByBondId(id);
    }
}

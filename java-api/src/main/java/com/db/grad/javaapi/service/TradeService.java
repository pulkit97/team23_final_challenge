package com.db.grad.javaapi.service;

import com.db.grad.javaapi.dto.TransactionDTO;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TradeService {
    @Autowired
    TradeRepository tradeRepository;

    public List<TransactionDTO> getTransactionByBondId(int id) {
        List<Trade> trades = tradeRepository.getAllTransactionsByBoundId(id);
        List<TransactionDTO> dtos = new ArrayList<>();

        for (Trade trade : trades) {
            TransactionDTO transactionDTO = new TransactionDTO();
            transactionDTO.setBuySell(trade.getBuySell());
            transactionDTO.setCurrency(trade.getCurrency());
            transactionDTO.setQuantity(trade.getQuantity());
            transactionDTO.setTradeDate(trade.getTradeDate());
            transactionDTO.setStatus(trade.getStatus());
            transactionDTO.setSettlementDate(trade.getSettlementDate());
            transactionDTO.setUnitPrice(trade.getUnitPrice());
            //TODO: add the other setters after merging relationships pr

            dtos.add(transactionDTO);
        }
        return dtos;
    }
}

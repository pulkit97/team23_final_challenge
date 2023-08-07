package com.db.grad.javaapi.service;

import com.db.grad.javaapi.dto.BondTransactionDTO;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.SecurityRepository;
import com.db.grad.javaapi.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.db.grad.javaapi.repository.BookRepository;

import java.util.*;

import java.util.List;

@Service
public class SecurityService {
    @Autowired
    private SecurityRepository securityRepository;

    @Autowired
    private TradeRepository tradeRepository;

    @Autowired
    public SecurityService(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public SecurityService(SecurityRepository securityRepository, TradeRepository tradeRepository) {
        this.securityRepository = securityRepository;
        this.tradeRepository = tradeRepository;
    }

    public SecurityRepository getSecurityRepository() {
        return securityRepository;
    }

    public void setSecurityRepository(SecurityRepository securityRepository) {
        this.securityRepository = securityRepository;
    }

    public List<Security> getAllSecuritiesForUserBooks(String userMail) {
        return securityRepository.findSecuritiesForUserBooks(userMail);
    }

    public List<Security> getBonds() {
        return securityRepository.getActiveBonds();
    }

    public List<Security> getBondsForNextFiveDays() {
        return securityRepository.getBondsForNextFiveDays();
    }

    public List<Security> getBondsForPreviousFiveDays() {
        return securityRepository.getBondsForPreviousFiveDays();
    }

    public ArrayList<BondTransactionDTO> getActiveBondsTransactions() {

        List<Trade> transactions = tradeRepository.getAllTransactions();
        List<Security> securities = securityRepository.getActiveBonds();
        ArrayList<BondTransactionDTO> bondTransactionAll = new ArrayList<>();

        for (Security security : securities) {
            BondTransactionDTO btdo = new BondTransactionDTO();
            btdo.setSecurity(security);
            ArrayList<Trade> currentTransactions = new ArrayList<Trade>();

            for (Trade transaction : transactions) {
                if (transaction.getSecurity_id() == security.getId()) {
                    currentTransactions.add(transaction);
                }
            }
            btdo.setTransactions(currentTransactions);
            bondTransactionAll.add(btdo);
        }
        return bondTransactionAll;

    }
}

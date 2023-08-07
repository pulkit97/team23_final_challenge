package com.db.grad.javaapi.service;
import com.db.grad.javaapi.dto.BondTransactionDTO;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.SecurityRepositoryStub;
import com.db.grad.javaapi.repository.TradeRepositoryStub;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecurityServiceTransactionTest {

    private SecurityRepositoryStub securityRepo = new SecurityRepositoryStub();
    private TradeRepositoryStub tradesRepo = new TradeRepositoryStub();

    @BeforeEach
    public void emptyAllRepos(){
        securityRepo.emptyAllData();
        tradesRepo.emptyAllData();
    }

    @Test
    public void oneSecurityOneTradeNoMatch(){

        Security security1 = new Security(1,"USN0280EAR64","123456780","Airbus 3.15% USD", LocalDateTime.of(2021,8,5,0,0,0),3,"CORP",900,"USD","active");
        Trade trade1 = new Trade(1, "USD", "open", 90, 50, "buy", LocalDateTime.of(2021, 8, 4, 0, 0, 0), LocalDateTime.of(2021, 5, 13, 0, 0, 0), 1, 2, 1);

        securityRepo.addSecurity(security1);
        tradesRepo.addTrade(trade1);

        SecurityService secService = new SecurityService(securityRepo, tradesRepo);

        ArrayList< BondTransactionDTO > resulDto = secService.getActiveBondsTransactions();

        assertEquals(resulDto.get(0).getTransactions().isEmpty(), true);
        assertEquals(resulDto.get(0).getSecurity(), security1);

    }

    @Test
    public void twoSecurityOneTradeOneMatch(){

        Security security1 = new Security(1,"USN0280EAR64","123456780","Airbus 3.15% USD", LocalDateTime.of(2021,8,5,0,0,0),3,"CORP",900,"USD","active");
        Security security2 = new Security(2,"USN0280EAGA64","54321","Security 2", LocalDateTime.of(2021,8,5,0,0,0),3,"CORP",400,"GBP","active");
        Trade trade1 = new Trade(1, "USD", "open", 90, 50, "buy", LocalDateTime.of(2021, 8, 4, 0, 0, 0), LocalDateTime.of(2021, 5, 13, 0, 0, 0), 1, 2, 1);

        securityRepo.addSecurity(security1);
        securityRepo.addSecurity(security2);
        tradesRepo.addTrade(trade1);

        SecurityService secService = new SecurityService(securityRepo, tradesRepo);

        ArrayList< BondTransactionDTO > resulDto = secService.getActiveBondsTransactions();

        assertEquals(resulDto.get(1).getTransactions().size(), 1);
        assertEquals(resulDto.get(0).getTransactions().size(), 0);
        assertEquals(resulDto.size(), 2);

    }

    @Test
    public void threeSecurityThreeTradeManyMatch(){

        Security security1 = new Security(1,"USN0280EAR64","123456780","Airbus 3.15% USD", LocalDateTime.of(2021,8,5,0,0,0),3,"CORP",900,"USD","active");
        Security security2 = new Security(2,"USN0280EAGA64","54321","Security 2", LocalDateTime.of(2021,8,5,0,0,0),3,"CORP",400,"GBP","active");
        Security security3 = new Security(3,"USN02","5424","Security 3", LocalDateTime.of(2021,8,5,0,0,0),3,"GOV",200,"USD","active");
        Trade trade1 = new Trade(1, "USD", "open", 90, 100, "buy", LocalDateTime.of(2021, 8, 4, 0, 0, 0), LocalDateTime.of(2021, 5, 13, 0, 0, 0), 1, 1, 1);
        Trade trade2 = new Trade(2, "GBP", "open", 80, 50, "sell", LocalDateTime.of(2021, 8, 4, 0, 0, 0), LocalDateTime.of(2021, 5, 13, 0, 0, 0), 1, 1, 4);
        Trade trade3 = new Trade(3, "USD", "open", 60, 20, "buy", LocalDateTime.of(2021, 8, 4, 0, 0, 0), LocalDateTime.of(2021, 5, 13, 0, 0, 0), 1, 2, 2);


        securityRepo.addSecurity(security1);
        securityRepo.addSecurity(security2);
        securityRepo.addSecurity(security3);
        tradesRepo.addTrade(trade1);
        tradesRepo.addTrade(trade2);
        tradesRepo.addTrade(trade3);

        SecurityService secService = new SecurityService(securityRepo, tradesRepo);

        ArrayList< BondTransactionDTO > resulDto = secService.getActiveBondsTransactions();

        assertEquals(resulDto.get(1).getTransactions().size(), 1);
        assertEquals(resulDto.get(1).getSecurity(), security2);
        assertEquals(resulDto.get(0).getTransactions().size(), 2);
        assertEquals(resulDto.get(0).getSecurity(), security1);
        assertEquals(resulDto.get(2).getTransactions().size(), 0);
        assertEquals(resulDto.get(2).getSecurity(), security3);

    }

}


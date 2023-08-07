package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Security;

import java.util.List;

public class SecurityRepositoryStub implements SecurityRepository {

    @Override
    public List<Security> findSecuritiesForUserBooks(String userMail) {
        return null;
    }

    @Override
    public List<Security> getActiveBonds() {
        return null;
    }

    @Override
    public List<Security> getBondsForNextFiveDays() {
        return null;
    }

    @Override
    public List<Security> getBondsForPreviousFiveDays() {
        return null;
    }
}

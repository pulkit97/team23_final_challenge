package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Book;
import com.db.grad.javaapi.model.CounterParty;
import com.db.grad.javaapi.model.Security;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import java.util.List;

@Repository
public interface SecurityRepository extends JpaRepository<Security, Integer> {
    @Query(value =
            "SELECT * \n" +
                    "from security as s\n" +
                    "left join book_users as bu \n" +
                    "on s.trading_book_id = bu.trading_book_id\n" +
                    "left join users as u\n" +
                    "on u.id = bu.user_id\n" +
                    "where u.mail =:userMail", nativeQuery = true)
    List<Security> findSecuritiesForUserBooks(@Param("userMail") String userMail);
    @Query("SELECT s FROM Security s WHERE s.status = 'active'")
    List<Security> getActiveBonds();


    @Query(value = "SELECT * FROM security AS s WHERE s.maturity_date BETWEEN '0005-08-21' AND '0005-08-25'", nativeQuery = true)
    List<Security> getBondsForNextFiveDays();

    @Query(value = "SELECT * FROM security AS s WHERE s.maturity_date BETWEEN '0030-07-21' AND '0030-07-25'", nativeQuery = true)
    List<Security> getBondsForPreviousFiveDays();
}

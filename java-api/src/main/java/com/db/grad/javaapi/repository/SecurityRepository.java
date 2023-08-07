package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Book;
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

    @Query(value = "SELECT * FROM security AS s WHERE s.maturity_date BETWEEN '2021-08-05' AND '2021-08-09'", nativeQuery = true)
    List<Security> getBondsForNextFiveDays();

    @Query(value = "SELECT * FROM security AS s WHERE s.maturity_date BETWEEN '2021-08-01' AND '2021-08-05'", nativeQuery = true)
    List<Security> getBondsForPreviousFiveDays();
}

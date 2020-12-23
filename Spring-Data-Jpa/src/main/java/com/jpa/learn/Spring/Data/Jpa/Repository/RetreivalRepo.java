package com.jpa.learn.Spring.Data.Jpa.Repository;

import com.jpa.learn.Spring.Data.Jpa.jpaModals.Retrieval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface RetreivalRepo extends JpaRepository<Retrieval,Long> {
  @Transactional
  @Modifying
    @Query("UPDATE Retrieval e set e.status='error2ss' where e.id>0")
   public int  updatedata();
}

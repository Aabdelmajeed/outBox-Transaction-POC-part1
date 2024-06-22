package com.outbox.MsArchitecture.repository;

import com.outbox.MsArchitecture.entity.Outbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OutboxRepository extends JpaRepository<Outbox, Long> {
    List<Outbox> findTop10ByIsDelivered(boolean status);

}
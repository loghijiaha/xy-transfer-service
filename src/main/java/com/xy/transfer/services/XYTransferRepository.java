package com.xy.transfer.services;

import com.xy.transfer.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface XYTransferRepository extends JpaRepository<Record, UUID> {}

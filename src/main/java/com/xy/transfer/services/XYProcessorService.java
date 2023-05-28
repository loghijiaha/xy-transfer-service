package com.xy.transfer.services;

import com.xy.transfer.model.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XYProcessorService {

    private XYTransferRepository xyTransferRepository;

    @Autowired
    public void setXyTransferDaoService(XYTransferRepository xyTransferRepository) {
        this.xyTransferRepository = xyTransferRepository;
    }

    public void saveRecord(Record record){
        xyTransferRepository.save(record);
    }

}

package com.xy.transfer.controller;

import com.xy.transfer.model.Record;
import com.xy.transfer.services.XYProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("add")
public class XYController {

    @Autowired
    private XYProcessorService xyProcessor;
    @PostMapping("/record")
    public ResponseEntity<HttpStatus> addRecord(@RequestBody Record record){
        // save the record to postgres db
        xyProcessor.saveRecord(record);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}

//package com.xy.transfer.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.xy.transfer.model.Record;
//import com.xy.transfer.model.RecordType;
//import com.xy.transfer.services.XYProcessor;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Profile;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.ArrayList;
//import java.util.UUID;
//
//import static org.mockito.Mockito.doNothing;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//class InsertControllerTest {
//
//    @Autowired
//    MockMvc mockMvc;
//
//    @Mock
//    XYProcessor xyProcessor;
//
//    // test to check the post request hit the endpoint and return 200
//    @Test
//    public void shouldReturn200() throws Exception {
//        Record record = new Record(UUID.randomUUID(), RecordType.CLICK, new ArrayList<>());
//
//        doNothing().when(xyProcessor).saveRecord(record);
//        Assertions.assertTrue(mockMvc.perform(post("/add/record").content(generateJsonString(record))).andExpect(status().isOk()).andReturn().getResponse().getContentAsString().contains("OK"));
//
//    }
//
//    // write a util method to generate json string from record class
//    public String generateJsonString(Record record) {
//        try {
//            return new ObjectMapper().writeValueAsString(record);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//
//}
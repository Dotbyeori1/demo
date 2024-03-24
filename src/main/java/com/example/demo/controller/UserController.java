package com.example.demo.controller;

import com.example.demo.dto.SEUserDTO;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j2
@RestController
@RequiredArgsConstructor
@RequestMapping("seUser")
public class UserController {

    private final UserService userService;

    @GetMapping("searchList")
    public ResponseEntity<?> loadSearchList() throws Exception {
        ArrayList<HashMap<String, Object>> searchList = userService.loadList(null);

        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("searchList", searchList);
        return ResponseEntity.ok(dataMap);
    }

    @PostMapping("insertData")
    public  ResponseEntity<?> insertData(@RequestBody List<SEUserDTO> insertDatas) throws Exception {
        if(!userService.insertData(insertDatas)){
            return ResponseEntity.internalServerError().body("저장 실패");
        }
        return ResponseEntity.ok("저장 성공");
    }

    @PostMapping("updateData")
    public  ResponseEntity<?> updateData(@RequestBody List<SEUserDTO> updateDatas) throws Exception {
        if(!userService.updateData(updateDatas)){
            return ResponseEntity.internalServerError().body("업데이트 실패");
        }
        return ResponseEntity.ok("업데이트 성공");
    }

    @PostMapping("deleteData")
    public  ResponseEntity<?> deleteData(@RequestBody List<SEUserDTO> updateDatas) throws Exception {
        if(!userService.deleteData(updateDatas)){
            return ResponseEntity.internalServerError().body("삭제 실패");
        }
        return ResponseEntity.ok("삭제 성공");
    }

    @PostMapping("duplicateTest")
    public ResponseEntity<?> duplicatedTest(@RequestBody List<SEUserDTO> duplicatedDatas) throws Exception {
        if (!userService.duplicatedData(duplicatedDatas)) {
            return ResponseEntity.internalServerError().body("업데이트 실패");
        }
        return ResponseEntity.ok("업데이트 성공");
    }

}

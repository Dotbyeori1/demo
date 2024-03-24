package com.example.demo.mapper;

import com.example.demo.dto.SEUserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {
    ArrayList<HashMap<String, Object>> loadUserSearchList(HashMap<String, Object> param) throws Exception;

    boolean insertData(List<SEUserDTO> insertLists);

    boolean updateData(List<SEUserDTO> updateDatas);

    void deleteData(@Param("seq") Long seq);

    boolean duplicateTest(List<SEUserDTO> duplicateData);
}

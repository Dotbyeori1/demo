package com.example.demo.service;

import com.example.demo.dto.SEUserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface UserService {

    ArrayList<HashMap<String, Object>> loadList(HashMap<String, Object> param) throws Exception;

    boolean insertData(List<SEUserDTO> insertData) throws Exception;

    boolean updateData(List<SEUserDTO> updateData) throws Exception;

    boolean deleteData(List<SEUserDTO> deleteData) throws  Exception;

    boolean  duplicatedData(List<SEUserDTO> duplicatedData) throws Exception;
}

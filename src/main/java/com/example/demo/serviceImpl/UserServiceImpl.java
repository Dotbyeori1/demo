package com.example.demo.serviceImpl;

import com.example.demo.dto.SEUserDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public ArrayList<HashMap<String, Object>> loadList(HashMap<String, Object> param) throws Exception {

        return userMapper.loadUserSearchList(param);
    }

    @Override
    public boolean insertData(List<SEUserDTO> insertData) throws Exception {

        return userMapper.insertData(insertData);
    }

    @Override
    public boolean updateData(List<SEUserDTO> updateData) throws Exception {

        return userMapper.updateData(updateData);
    }

    @Override
    public boolean deleteData(List<SEUserDTO> deleteData) {
        for (SEUserDTO data : deleteData) {
            userMapper.deleteData(data.getSeq());
        }
        return true;
    }

    @Override
    public boolean duplicatedData(List<SEUserDTO> duplicatedData) throws Exception{
        return userMapper.duplicateTest(duplicatedData);
    }

}

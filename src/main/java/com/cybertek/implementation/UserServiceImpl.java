package com.cybertek.implementation;

import com.cybertek.dto.UserDTO;
import com.cybertek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractMapService<UserDTO, String> implements UserService {
    @Override
    public List<UserDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(UserDTO object) {
        super.delete(object);
    }

    @Override
    public UserDTO save(UserDTO object) {
        return super.save(object.getUserName(), object);
    }

    @Override
    public void deleteByID(String id) {
        super.deleteById(id);
    }

    @Override
    public UserDTO findByID(String id) {
        return super.findByID(id);
    }
}

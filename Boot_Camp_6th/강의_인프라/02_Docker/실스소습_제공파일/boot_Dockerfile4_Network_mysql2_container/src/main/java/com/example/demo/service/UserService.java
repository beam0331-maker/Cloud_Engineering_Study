// UserService.java
package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.UserDTO;


public interface UserService {
  UserDTO findById(Long id);
    List<UserDTO> findAll();
    UserDTO create(UserDTO dto);
    UserDTO update(Long id, UserDTO dto);
    void deleteById(Long id);
}

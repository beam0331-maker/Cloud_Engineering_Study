// UserServiceImpl.java
package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    /** 단건 조회 */
    @Override
    public UserDTO findById(Long id) {
        return userRepository.findById(id)
                .map(this::toDTO)
                .orElse(null);
    }

    /** 전체 조회 */
    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(this::toDTO)
                .toList();
    }

    /** 생성 */
    @Override
    @Transactional
    public UserDTO create(UserDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setRole(dto.getRole());

        User saved = userRepository.save(user);
        return toDTO(saved);
    }

    /** 수정 */
    @Override
    @Transactional
    public UserDTO update(Long id, UserDTO dto) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(dto.getName());
                    user.setEmail(dto.getEmail());
                    user.setRole(dto.getRole());
                    return toDTO(userRepository.save(user));
                })
                .orElse(null);
    }

    /** 삭제 */
    @Override
    @Transactional
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    /** Entity → DTO 변환 */
    private UserDTO toDTO(User u) {
        return UserDTO.builder()
                .id(u.getId())
                .name(u.getName())
                .email(u.getEmail())
                .role(u.getRole())
                .createdAt(u.getCreatedAt())
                .updatedAt(u.getUpdatedAt())
                .build();
    }
}
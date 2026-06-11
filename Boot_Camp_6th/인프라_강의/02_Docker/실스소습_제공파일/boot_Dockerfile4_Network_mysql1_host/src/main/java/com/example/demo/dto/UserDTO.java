// UserDTO.java
package com.example.demo.dto;

import java.time.LocalDateTime;
import lombok.*;

@Getter @Setter
@NoArgsConstructor 
@AllArgsConstructor 
@Builder
public class UserDTO {
        Long id;
        String name;
        String email;
        String role;
        LocalDateTime createdAt;
        LocalDateTime updatedAt;

}
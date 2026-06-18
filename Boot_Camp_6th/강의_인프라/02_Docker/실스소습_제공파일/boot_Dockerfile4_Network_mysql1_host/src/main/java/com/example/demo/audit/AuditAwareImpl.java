package com.example.demo.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("로그인계정명"); // SpringSecurity 적용후에는 SecurityContextHolder로 로그인 사용자 ID 설정함
    }
}

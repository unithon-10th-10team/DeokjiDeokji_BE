package com.example.deokjideokji.member.infrastructure;


import com.example.deokjideokji.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findById(String id);
}

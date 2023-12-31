package com.ll.mb.domain.member.member.repository;

import com.ll.mb.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.jar.JarEntry;

public interface MemberRepository extends JpaRepository< Member, Long> {
    Optional<Member> findByUsername(String username);
}

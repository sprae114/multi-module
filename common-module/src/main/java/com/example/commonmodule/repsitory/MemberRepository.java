package com.example.commonmodule.repsitory;

import com.example.commonmodule.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

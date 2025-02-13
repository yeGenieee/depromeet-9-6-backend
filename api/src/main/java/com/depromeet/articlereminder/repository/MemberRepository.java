package com.depromeet.articlereminder.repository;

import com.depromeet.articlereminder.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // select m form Member m where m.name = ?
    List<Member> findByName(String name);
}

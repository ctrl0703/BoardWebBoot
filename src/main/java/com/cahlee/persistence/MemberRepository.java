package com.cahlee.persistence;

import org.springframework.data.repository.CrudRepository;

import com.cahlee.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {

}

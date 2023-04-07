package com.jeongyongs.member.repository;

import com.jeongyongs.member.domain.Member;

import java.util.ArrayList;

public interface MemberRepository {
    // save data
    void save(Member member);

    // find data by username
    Member findByUsername(String username);

    // find data by id
    Member findById(Long id);

    // find all data
    ArrayList<Member> findAll();

    // delete data by id
    void deleteById(Long id);

    // delete all data
    void deleteAll();

    // get db size
    int count();
}

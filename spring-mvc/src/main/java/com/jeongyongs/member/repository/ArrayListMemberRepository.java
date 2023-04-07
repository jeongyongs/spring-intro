package com.jeongyongs.member.repository;

import com.jeongyongs.member.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public class ArrayListMemberRepository implements MemberRepository {
    private final ArrayList<Member> db = new ArrayList<>();

    public ArrayListMemberRepository() {
        db.add(new Member(123, "scott", "tiger", "Jeongyongs"));
    }

    @Override
    public void save(Member member) {
        db.add(member);
    }

    @Override
    public Member findByUsername(String username) {
        Optional<Member> foundMember = db.stream()
                .filter(member -> member.getUsername().equals(username))
                .findFirst();
        return foundMember.orElse(null);
    }

    @Override
    public Member findById(Long id) {
        Optional<Member> foundMember = db
                .stream()
                .filter(member -> member.getId() == id)
                .findFirst();
        return foundMember.orElse(null);
    }

    @Override
    public ArrayList<Member> findAll() {
        return db;
    }

    @Override
    public void deleteById(Long id) {
        db.removeIf(member -> member.getId() == id);
    }

    @Override
    public void deleteAll() {
        db.clear();
    }

    @Override
    public int count() {
        return db.size();
    }
}

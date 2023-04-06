package com.jeongyongs.member.repository;

import com.jeongyongs.member.domain.Member;

import java.util.ArrayList;
import java.util.Optional;

public class MemberDao implements IDao {
    private ArrayList<Member> db = new ArrayList<>();

    @Override
    public void save(Member member) {
        db.add(member);
    }

    @Override
    public Member findById(Long id) {
        Optional<Member> foundMember = db
                .stream()
                .filter(member -> member.getId().equals(id))
                .findFirst();
        return foundMember.orElse(null);
    }

    @Override
    public ArrayList<Member> findAll() {
        return db;
    }

    @Override
    public void deleteById(Long id) {
        db.removeIf(member -> member.getId().equals(id));
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

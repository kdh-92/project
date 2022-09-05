package com.inflearn.basicproject.member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long memberId);
}

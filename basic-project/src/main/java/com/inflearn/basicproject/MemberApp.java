package com.inflearn.basicproject;

import com.inflearn.basicproject.member.Grade;
import com.inflearn.basicproject.member.Member;
import com.inflearn.basicproject.member.MemberService;
import com.inflearn.basicproject.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("findMember = " + findMember);
        System.out.println("member = " + member);
    }
}

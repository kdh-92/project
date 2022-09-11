package com.inflearn.basicproject;

import com.inflearn.basicproject.member.Grade;
import com.inflearn.basicproject.member.Member;
import com.inflearn.basicproject.member.MemberService;
import com.inflearn.basicproject.member.MemberServiceImpl;
import com.inflearn.basicproject.order.Order;
import com.inflearn.basicproject.order.OrderService;
import com.inflearn.basicproject.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}

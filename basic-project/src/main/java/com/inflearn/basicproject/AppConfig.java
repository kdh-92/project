package com.inflearn.basicproject;

import com.inflearn.basicproject.discount.RateDiscountPolicy;
import com.inflearn.basicproject.member.MemberService;
import com.inflearn.basicproject.member.MemberServiceImpl;
import com.inflearn.basicproject.member.MemoryMemberRepository;
import com.inflearn.basicproject.order.OrderService;
import com.inflearn.basicproject.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(getMemberRepository());
    }

    @Bean
    public MemoryMemberRepository getMemberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(getMemberRepository(), getDiscountPolicy());
    }

    @Bean
    public RateDiscountPolicy getDiscountPolicy() {
        return new RateDiscountPolicy();
    }
}

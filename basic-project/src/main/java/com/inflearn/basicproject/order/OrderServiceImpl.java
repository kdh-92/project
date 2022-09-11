package com.inflearn.basicproject.order;

import com.inflearn.basicproject.discount.DiscountPolicy;
import com.inflearn.basicproject.discount.FixDiscountPolicy;
import com.inflearn.basicproject.discount.RateDiscountPolicy;
import com.inflearn.basicproject.member.Member;
import com.inflearn.basicproject.member.MemberRepository;
import com.inflearn.basicproject.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}

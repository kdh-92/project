package com.inflearn.basicproject.discount;

import com.inflearn.basicproject.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}

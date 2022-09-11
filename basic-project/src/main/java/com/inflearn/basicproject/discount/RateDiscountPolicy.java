package com.inflearn.basicproject.discount;

import com.inflearn.basicproject.member.Grade;
import com.inflearn.basicproject.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPrice = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) return price * discountPrice / 100;
        else return 0;
    }
}

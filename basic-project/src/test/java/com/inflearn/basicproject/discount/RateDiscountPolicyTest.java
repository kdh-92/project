package com.inflearn.basicproject.discount;

import com.inflearn.basicproject.member.Grade;
import com.inflearn.basicproject.member.Member;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    void vip_discount() {
        Member member = new Member(1L, "VIPMember", Grade.VIP);
        int discount = discountPolicy.discount(member, 10000);
        assertThat(discount).isEqualTo(1000);
    }
}
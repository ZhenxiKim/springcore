package com.example.springcore.discount;

import com.example.springcore.member.Grade;
import com.example.springcore.member.Member;

/**
 * @author jhkim
 * @since 2022-10-20
 *
 */
public class FixDiscountPolicy implements DiscountPlicy{

	private int discountFixAmount = 1000;

	@Override
	public int discount(Member member, int price) {
		if(member.getGrade() == Grade.VIP) {
			return discountFixAmount;
		} else {
			return 0;
		}
	}
}

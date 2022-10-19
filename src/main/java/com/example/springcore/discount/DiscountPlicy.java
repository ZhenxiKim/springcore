package com.example.springcore.discount;

import com.example.springcore.member.Member;

/**
 * @author jhkim
 * @since 2022-10-20
 *
 */
public interface DiscountPlicy {
	/*
	 * 	@return 할인 대상 금액
	 */
	int discount(Member member, int price);
}

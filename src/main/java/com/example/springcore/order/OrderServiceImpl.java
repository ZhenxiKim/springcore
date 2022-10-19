package com.example.springcore.order;

import com.example.springcore.discount.DiscountPlicy;
import com.example.springcore.discount.FixDiscountPolicy;
import com.example.springcore.member.Member;
import com.example.springcore.member.MemberRepository;
import com.example.springcore.member.MemoryMemberRepository;

/**
 * @author jhkim
 * @since 2022-10-20
 *
 */
public class OrderServiceImpl implements OrderService {
	private final MemberRepository memberRepository = new MemoryMemberRepository();
	private final DiscountPlicy discountPlicy = new FixDiscountPolicy();

	@Override
	public Order createOrder(Long memberId, String itemName, int itemPrice) {
		Member member = memberRepository.findById(memberId);
		int discountPrice = discountPlicy.discount(member, itemPrice);
		return new Order(memberId, itemName, itemPrice, discountPrice);
	}
}

package com.example.springcore.member;

/**
 * @author jhkim
 * @since 2022-10-20
 *
 */
public class MemberApp {
	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);

		//Member findMember
	}
}

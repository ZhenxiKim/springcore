package com.example.springcore.member;

/**
 * 역할과 구현을 분리, 다양한 구현체로 객체 조립 가능
 * @author jhkim
 * @since 2022-10-20
 *
 */
public interface MemberService {
	void join(Member member);
	Member findMember(Long memberId);
}

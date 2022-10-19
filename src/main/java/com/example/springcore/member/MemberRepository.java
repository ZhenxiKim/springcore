package com.example.springcore.member;

/**
 * @author jhkim
 * @since 2022-10-20
 *
 */
public interface MemberRepository {
	void save(Member member);
	Member findById(Long memberId);
}

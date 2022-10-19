package com.example.springcore.member;

/**
 * @author jhkim
 * @since 2022-10-20
 *
 */
public class MemberServiceImpl implements MemberService {
	//인터페이스 뿐만 아니라 구현체까지 의존범위 확장됨
	private MemberRepository memberRepository = new MemoryMemberRepository();

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Long memberId) {
		return memberRepository.findById(memberId);
	}
}

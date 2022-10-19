package com.example.springcore;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springcore.member.Grade;
import com.example.springcore.member.Member;
import com.example.springcore.member.MemberService;
import com.example.springcore.member.MemberServiceImpl;

@SpringBootTest
class SpringcoreApplicationTests {

	MemberService memberService = new MemberServiceImpl();

	@Test
	void contextLoads() {
		Member member = new Member(1L, "memberA", Grade.VIP);
		memberService.join(member);
		Member findMember = memberService.findMember(1L);
		Assertions.assertThat(member).isEqualTo(findMember);
	}

}

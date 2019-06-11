package exam.member.service;

import exam.member.vo.MemberVo;

public class MemberPrinterServiceImpl implements MemberPrinterService {

	@Override
	public void print(MemberVo member) {
		System.out.println("회원정보: 아이디=" + member.getId() + ", 이메일=" + member.getEmail() + ", 이름=" + member.getName()
		+"등록일"+member.getRegisterDate()+"비번"+member.getPassword());
	}
}
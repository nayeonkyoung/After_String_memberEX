package exam.member.service;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

public class MemberChangeServiceImp1 implements MemberChangeService{

	private MemberDao memberdao;
	public MemberChangeServiceImp1(MemberDao memberDao) {
		// TODO Auto-generated constructor stub
		this.memberdao = memberDao;
	}
	@Override
	public void changePassword(String email, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		MemberVo member = memberdao.selectByEmail(email);
	}

}

package exam.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
@Component
public class MemberChangeServiceImp1 implements MemberChangeService{

	private MemberDao memberDao;
	
	@Autowired
	public MemberChangeServiceImp1(MemberDao memberDao) {
		// TODO Auto-generated constructor stub
		this.memberDao = memberDao;
	}
	@Override
	public void changePassword(String email, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		MemberVo member = memberDao.selectByEmail(email);

	member.changePassword(oldPassword, newPassword);
	memberDao.update(member);
	
	}
}

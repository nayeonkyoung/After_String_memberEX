package exam.member.service;

import java.util.Date;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
import exam.member.vo.RegisterRequest;

public class MemberRegisterServiceImp1 implements MemberRegisterService{

	private MemberDao memberDao;
	public MemberRegisterServiceImp1(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	@Override
	public void regist(RegisterRequest req) {
		// TODO Auto-generated method stub
		//1. 기존에 같은 이메일 있는지 만약 있으면 x, 없으면 memberDao.
		MemberVo member = memberDao.selectByEmail(req.getEmail());
		
		if(member != null) {
			// 이미 가입되어 있는 이메일이 있는 상황
		}
		
		MemberVo newMember = new MemberVo(req.getEmail(),req.getPassword(), req.getName(), new Date());
		memberDao.insert(newMember);
	}

}

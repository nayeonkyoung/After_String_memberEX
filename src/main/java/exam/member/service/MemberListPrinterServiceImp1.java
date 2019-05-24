package exam.member.service;

import java.util.Collection;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

public class MemberListPrinterServiceImp1 implements MemberListPrinService{
	
	//DAO 클래스 선언
	private MemberDao memberDao;
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		Collection<MemberVo> members=memberDao.selectAll();
		for(MemberVo member : members) {
			// print..
		}
	}

}

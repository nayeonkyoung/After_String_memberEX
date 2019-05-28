package exam.member.service;

import java.util.Collection;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;

public class MemberListPrinterServiceImp1 implements MemberListPrinterService{
	
	//DAO 클래스 선언
	private MemberDao memberDao;
	private MemberPrinterService memberPrinter;
	
	public MemberListPrinterServiceImp1(MemberDao memberDao, MemberPrinterService memberPrinter) {
		this.memberDao = memberDao;
		this.memberPrinter=memberPrinter;
	}
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		Collection<MemberVo> members=memberDao.selectAll();
		for(MemberVo member : members) {
			memberPrinter.print(member);
		}
	}

}

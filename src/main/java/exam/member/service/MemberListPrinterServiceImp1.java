package exam.member.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
@Component
public class MemberListPrinterServiceImp1 implements MemberListPrinterService{
	
	//DAO 클래스 선언
	private MemberDao memberDao;
	private MemberPrinterService memberPrinter;
	
	@Autowired
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

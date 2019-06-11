import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import exam.member.dao.MemberDao;
import exam.member.dao.MemberDaoImp1;
import exam.member.service.MemberChangeService;
import exam.member.service.MemberChangeServiceImp1;
import exam.member.service.MemberListPrinterService;
import exam.member.service.MemberListPrinterServiceImp1;
import exam.member.service.MemberPrinterService;
import exam.member.service.MemberPrinterServiceImpl;
import exam.member.service.MemberRegisterService;
import exam.member.service.MemberRegisterServiceImp1;
import exam.member.ui.MemberUI;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		MemberDao memberDao = new MemberDaoImp1();
//		MemberRegisterService memberRegisterService = 	new MemberRegisterServiceImp1(memberDao);
//		MemberUI memberUI = new MemberUI();
//		memberUI.setMemberRegisterService(memberRegisterService);
//		
//		MemberPrinterService memberPrinterService =	new MemberPrinterServiceImpl();
//		MemberListPrinterService memberListPrinterService =	new MemberListPrinterServiceImp1(memberDao, memberPrinterService);
//		
//		MemberChangeService memberChangeService =new MemberChangeServiceImp1(memberDao);
//		memberUI.setMemberListPrinterService(memberListPrinterService);
//		
//		memberUI.showMenu();
		
		ApplicationContext ctx = new GenericXmlApplicationContext("member.xml");
		MemberUI memberUI = ctx.getBean("memberUI", MemberUI.class);
		memberUI.showMenu();
	}

}

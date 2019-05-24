package exam.member.ui;

import java.util.Scanner;

import exam.member.service.MemberRegisterService;
import exam.member.vo.RegisterRequest;

public class MemberUI {
	MemberRegisterService memberRegisterService;
	public MemberUI() {}
	
	public void setMemberRegisterService
			(MemberRegisterService memberRegisterService) {
		this.memberRegisterService = memberRegisterService;
	}
	
	public void showMenu() {
		Scanner scan = new Scanner(System.in);
		String command=":";
		while(true) {
			System.out.print("명령어를 입력하세요 : ");
			command = scan.nextLine();
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("시스템을 종료");
				break;
			}
			else if(command.toLowerCase().startsWith("new")) {
				processNewCommand(command.split(" "));
				continue;
			}
			else if(command.toLowerCase().startsWith("change ")) {
				
			}
			else if(command.equalsIgnoreCase("list")) {
				processListCommand();
				continue;
			}
		}
	}

	

	public void processNewCommand(String[] args) {
		if(args.length != 5) {
			return;
		}
		RegisterRequest req = new RegisterRequest();
		req.setEmail(args[1]);
		req.setName(args[2]);
		req.setPassword(args[3]);
		req.setConfirmPassword(args[4]);
		
		memberRegisterService.regist(req);
		
	}
	
	public void processListCommand() {
		memberRegisterService.printAll();
		
	}
}

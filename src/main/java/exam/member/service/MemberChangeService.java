package exam.member.service;

public interface MemberChangeService {
	public void changePassword(String email, String oldPassword, String newPassword);
}

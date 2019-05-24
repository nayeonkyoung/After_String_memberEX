package exam.member.dao;

import java.util.Collection;

import exam.member.vo.MemberVo;

public interface MemberDao {
	public void insert(MemberVo member);
	public void update(MemberVo member);
	public Collection<MemberVo> selectAll();
	public MemberVo selectByEmail(String email);
}

package member;

public class MemberService {
	
	private final MemberDao dao = new MemberDao();
	
	public int join(MemberVo vo) throws Exception {
		if(vo.getId().length() < 4) {
			throw new Exception("아이디는 4글자 이상");
		}
		
		return dao.join(vo);
	}
	
}

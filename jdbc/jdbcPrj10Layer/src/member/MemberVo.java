package member;

public class MemberVo {
	
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MemberVo(String no, String id, String pw, String nick, String createdAt, String delYn) {
		super();
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.createdAt = createdAt;
		this.delYn = delYn;
	}

	private String no;
	private String id;
	private String pw;
	private String nick;
	private String createdAt;
	private String delYn;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pw=" + pw + ", nick=" + nick + ", createdAt=" + createdAt
				+ ", delYn=" + delYn + "]";
	}
	
}

package board;

import static db.JDBCTemplate.close;
import static db.JDBCTemplate.commit;
import static db.JDBCTemplate.getConn;
import static db.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

public class BoardService {

	private final BoardDao dao = new BoardDao();
	private final String[] banWordArr = new String[] {"18", "28"};

	public int insert(BoardVo vo) throws Exception {
		
		checkWord(vo);
		
		Connection conn = getConn();
		int result = dao.insert(conn, vo);
		
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	private void checkWord(BoardVo vo) {
		String title = vo.getTitle();
		String content = vo.getContent();
		
		for(String s : banWordArr) {
			if(title != null && title.contains(s)) {
				throw new IllegalArgumentException("[BOARD-10001");
			}
			if(content != null && content.contains(s)) {
				throw new IllegalArgumentException("[BOARD-10002");
			}
			
		}
	}

	public int updateTitleByNo(BoardVo vo) throws Exception {
		checkWord(vo);
		
		Connection conn = getConn();
		
		int result = dao.updateTitleByNo(conn, vo);
				
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	public int updateContentByNo(BoardVo vo) throws Exception {
		checkWord(vo);
		
		Connection conn = getConn();
		
		int result = dao.updateContentByNo(conn, vo);
				
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	public int updateBoardByNo(BoardVo vo) throws Exception {
		checkWord(vo);
		
		Connection conn = getConn();
		
		int result = dao.updateBoardByNo(conn, vo);
				
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	public int deleteBoardByNo(BoardVo vo) throws Exception {
		Connection conn = getConn();
		
		int result = dao.deleteBoardByNo(conn, vo);
				
		if(result == 1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result;
	}

	public List<BoardVo> selectAll() throws Exception {
		
		Connection conn = getConn();
		
		List<BoardVo> voList = dao.selectAll(conn);
				
		close(conn);
		
		return voList;
		
	}

	public BoardVo selectOneByNo(String no) throws Exception {
		Connection conn = getConn();
		
		int result = dao.increaseHit(conn, no);
		if(result != 1) {
			throw new IllegalStateException("[BOARD-2001] 상세조회 중 조회수 증가 실패");
		}
		BoardVo vo = dao.selectOneByNo(conn, no);
		
		commit(conn);
		close(conn);
		
		return vo;
		
	}

	public List<BoardVo> searchByWriterNick(String writerNick) throws Exception {
		Connection conn = getConn();
		
		List<BoardVo> voList = dao.searchByWriterNick(conn, writerNick);
		
		close(conn);
		
		return voList;
	}

	
}

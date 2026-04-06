package com.kh.app.board;

import com.kh.app.util.PageVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
public class BoardService {

    private final BoardMapper boardMapper;

    @Transactional
    public int insert(BoardVo vo) {
        checkValid(vo);
        return boardMapper.insert(vo);
    }

    private void checkValid(BoardVo vo) {
        //title , content
        //issue ? exception
    }

    public List<BoardVo> selectList(PageVo pvo) {
        return boardMapper.selectList(pvo);
    }

    @Transactional
    public BoardVo selectOne(String no) {
        int result = boardMapper.increaseHit(no);
        if(result != 1){
            String errMsg = "[B-321] increase hit fail ...";
            log.error(errMsg);
            throw new IllegalStateException(errMsg);
        }
        return boardMapper.selectOne(no);
    }

    @Transactional
    public int updateByNo(BoardVo vo) {
        System.out.println("service vo = " + vo);
        return boardMapper.updateByNo(vo);
    }

    @Transactional
    public int deleteByNo(BoardVo vo) {
        return boardMapper.deleteByNo(vo);
    }

    public int selectCount() {
        return boardMapper.selectCount();
    }

    @Transactional
    public boolean like(Map<String, Object> map) {
        int result = boardMapper.existLike(map);

        if(result == 1){
            boardMapper.deleteLike(map);
            return false;
        }else{
            boardMapper.insertLike(map);
            return true;
        }
    }

    public int getLikeStatus(String memberNo, String boardNo) {
        return boardMapper.existLike2(memberNo , boardNo);
    }

    public int selectLikeCount(String no) {
        return boardMapper.selectLikeCount(no);
    }
}//class
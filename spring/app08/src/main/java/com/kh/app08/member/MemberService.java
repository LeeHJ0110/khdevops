package com.kh.app08.member;

import com.kh.app08.util.FileUploader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberMapper memberMapper;

    public int join(MemberVo vo, MultipartFile f) throws IOException {
        if(!f.isEmpty()){
            String fileName = FileUploader.saveFile(f, "member");
            vo.setProfile(fileName);
            vo.setOriginName(f.getOriginalFilename());
        }

        return memberMapper.join(vo);
    }


    public MemberVo login(MemberVo vo) {
        return memberMapper.login(vo);
    }
}

package syscom.lingan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import syscom.lingan.dao.LoginVarifyMapper;
import syscom.lingan.entity.UserFile;
import syscom.lingan.service.LoginVarifyService;
import org.apache.commons.codec.binary.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.util.List;

@Service
public class LoginVarifyServiceImpl implements LoginVarifyService {
    @Autowired
    private LoginVarifyMapper loginVarifyMapper;

    //增加
    public int addUser(UserFile userFile) {
        return loginVarifyMapper.addUser(userFile);
    }
    //刪除
    public int deleteUserById(String id) {
        return loginVarifyMapper.deleteUserById(id);
    }
    //更新
    public int updateUser(UserFile userFile) {
        return loginVarifyMapper.updateUser(userFile);
    }
    //使用者資訊查詢
    public List<UserFile> checkUserFile(UserFile userFile) {
        return loginVarifyMapper.checkUserFile(userFile);
    }
}

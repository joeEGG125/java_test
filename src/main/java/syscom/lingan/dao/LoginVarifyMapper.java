package syscom.lingan.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import syscom.lingan.entity.UserFile;

import java.util.List;

@Mapper
public interface LoginVarifyMapper {
    List<UserFile> checkUserFile(UserFile userFile);
    //增加
    int addUser(UserFile userFile);
    //刪除
    int deleteUserById(@Param("id") String id);
    //更新
    int updateUser(UserFile userFile);
    //使用者資訊查詢
    List<UserFile> checkUserFileFront(UserFile userFile);

}

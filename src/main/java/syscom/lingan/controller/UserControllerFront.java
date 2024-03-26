package syscom.lingan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import syscom.lingan.entity.UserFile;
import syscom.lingan.service.LoginVarifyService;

import java.util.List;

@Controller
public class UserControllerFront {
    @Autowired
    private LoginVarifyService loginVarifyService;
    //跳轉頁面
    @RequestMapping("loginPage")
    public String login(){
        return "loginPage";
    }
    //增加
    @ResponseBody
    @RequestMapping("/loginPage/addUser")
    public int addUser(@RequestBody UserFile userFile) {
        return loginVarifyService.addUser(userFile);
    }
    //刪除
    @ResponseBody
    @RequestMapping("/loginPage/delete")
    public int deleteUser(@RequestParam("id") String id) {
        return loginVarifyService.deleteUserById(id);
    }
    //更新
    @ResponseBody
    @RequestMapping("/loginPage/update")
    public int updateUser(@RequestBody UserFile userFile){
        return loginVarifyService.updateUser(userFile);
    }
    //使用者資訊查詢
    @ResponseBody
    @RequestMapping("/loginPage/loginVerifyFront")
    public List<UserFile> loginVerificationFront(@RequestBody UserFile userFile){
        return loginVarifyService.checkUserFile(userFile);
    }

}

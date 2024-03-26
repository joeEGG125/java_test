package syscom.lingan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import syscom.lingan.entity.UserFile;
import syscom.lingan.service.LoginVarifyService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private LoginVarifyService loginVarifyService;


    @RequestMapping("loginVerify")
    public List<UserFile> loginVerification(@RequestBody UserFile userFile){
        return loginVarifyService.checkUserFile(userFile);
    }
}

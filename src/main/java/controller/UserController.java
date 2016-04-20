package controller;

import com.sun.org.apache.xalan.internal.utils.XMLSecurityPropertyManager;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.UserService;

import javax.annotation.Resource;

/**
 * Created by ENVY HP on 2016/4/19.
 */

@Controller
@Scope (value="prototype" )
@RequestMapping (/user)
public class UserController {
    @Resource
    private UserService userService ;

    @RequestMapping (value="/login",method= RequestMethod.POST )
    public String login(User user,Model model )throws Exception {
        user=userService .checkLogin(user.getUsername(),user.getPassword() );
        if(user!=null){
            model.addAttribute(user);
            return "welcome";
        }
        return "fail";
    }
}

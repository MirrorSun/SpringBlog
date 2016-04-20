package service;

import org.springframework.stereotype.Service;

/**
 * Created by ENVY HP on 2016/4/19.
 */
@Service ("userService")
public class UserServiceImpl implements UserService  {
   private UserDao userDao ;

    public User checkLogin(String username,String password){
        User user= userDao.findUserByName(username);
        if(user!=null && user.getPassword().equals(password ) ){
            return user;
        }
        return null;
    }

}

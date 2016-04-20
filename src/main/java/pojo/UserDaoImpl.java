package pojo;

import mapper.UserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by ENVY HP on 2016/4/20.
 */
@Repository ("pojo.UserDao")
public class UserDaoImpl implements UserDao {
    @Resource (name = "userMapper")
    private UserMapper userMapper;

    @Override
    public User findUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}

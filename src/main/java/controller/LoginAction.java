package controller; /**
 * Created by ENVY HP on 2016/4/17.
 */

import pojo.UserDao;

public class LoginAction {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public getPassword() {
        return password;
    }

    public void setPassword(String password ) {
        this.password = password;
    }

    public String login()throws Exception {
       UserDao userdao = new UserDao;
        System.out.println("username:"+username);
        User user = null;
        user=userdao.query("name".username);

        Map session=ActionContext.getContext().getSession();
        User sessionUser=(User)session.get("username");
        if(sessionUser!=null){
            return SUCCESS;
        }
        session.put("username",user);
        if(null==user)
            return ERROR;
        return SUCCESS;
    }
}

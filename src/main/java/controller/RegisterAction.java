package controller; /**
 * Created by ENVY HP on 2016/4/18.
 */

import pojo.UserDao;
public class RegisterAction {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String register() throws Exception{
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        if(username==null || password==null)
            return ERROR;

        UserDao userdao = new UserDao();
        boolean in = userdao.insert(username, password);
        if(in){
            Map session = ActionContext.getContext().getSession();
            User user = new User(username, password);
            session.put("username", user);
            return SUCCESS;
        }else{
        return ERROR;}
    }
}

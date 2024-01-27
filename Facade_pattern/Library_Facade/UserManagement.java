package project.com;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

    private List<User> userList = new ArrayList<>();

    public User getUserByUsername(String username) {
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getUsername().equals(username)){
                return userList.get(i);
            }
        }
        return null;

    }
    public void addUser(User user){
        userList.add(user);
    }
}

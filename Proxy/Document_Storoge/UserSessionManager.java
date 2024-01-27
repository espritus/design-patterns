package project.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserSessionManager {
    private Map<String, UserSession> sessions = new HashMap();
    private UserSession session;
    private List<User> userList = new ArrayList();

    public UserSessionManager() {
    }

    public void startSession(User user) {
        String sessionId = "190700777";
        this.session = new UserSession(user, sessionId);
        this.sessions.put(sessionId, this.session);
    }

    public User getCurrentUser() {
        return this.session.getUser();
    }

    public List<User> userList() {
        this.userList.add(new User("Max", "12345679"));
        this.userList.add(new User("Alisa", "987654321"));
        return this.userList;
    }

    public User searchByUserName(String username) {
        this.userList();

        for(int i = 0; this.userList.iterator().hasNext(); ++i) {
            if (((User)this.userList.get(i)).getUsername().equals(username)) {
                return (User)this.userList.get(i);
            }
        }

        return null;
    }
}
class UserSession {
    private User user;
    private String sessionId;

    public UserSession(User user, String sessionId) {
        this.user = user;
        this.sessionId = sessionId;
    }

    public User getUser() {
        return this.user;
    }
}
class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }
}


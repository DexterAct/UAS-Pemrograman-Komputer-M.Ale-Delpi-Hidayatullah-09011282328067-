import java.util.HashMap;
import java.util.Map;

public class UserManager {
    private Map<String, User> users;

    public UserManager() {
        users = new HashMap<>();
    }

    public void addUser(String username, String password) {
        users.put(username, new User(username, password, true));
    }

    public void deleteUser(String username) {
        users.remove(username);
    }

    public void activateUser(String username) {
        if (users.containsKey(username)) {
            users.get(username).setActive(true);
        }
    }

    public void deactivateUser(String username) {
        if (users.containsKey(username)) {
            users.get(username).setActive(false);
        }
    }

    public boolean checkCredentials(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            return user.getPassword().equals(password) && user.isActive();
        }
        return false;
    }

    public class User {
        private String username;
        private String password;
        private boolean active;

        public User(String username, String password, boolean active) {
            this.username = username;
            this.password = password;
            this.active = active;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }
    }
}
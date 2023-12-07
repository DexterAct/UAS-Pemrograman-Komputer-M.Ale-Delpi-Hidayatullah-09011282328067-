public class soalNo8 {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.addUser("ale", "password123");
        userManager.addUser("ais", "password456");

        System.out.println(userManager.checkCredentials("ale", "password123"));
        System.out.println(userManager.checkCredentials("ais", "wrongpassword"));

        userManager.deactivateUser("ale");
        System.out.println(userManager.checkCredentials("ale", "password123")); 

        userManager.activateUser("ale");
        System.out.println(userManager.checkCredentials("", "password123")); 
    }
}
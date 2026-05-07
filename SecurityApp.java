package Day5;

public class SecurityApp {
    public static void main(String[] args) {
        SecurityModule security = new SecurityModule();
        security.encryptData("SensitiveInfo123");
    }
}

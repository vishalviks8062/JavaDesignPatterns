package BehaviouralDesignPatterns.StateDesignPAttern3;

public class Client {
    public static void main(String[] args) {
        Program program = new Program();
        program.f_runSoftware();
        program.f_installPackage();
        program.f_grantPermissions();
        program.f_installPackage();
        program.f_grantPermissions();
        program.f_runPackage();
        program.f_grantPermissions();
        program.f_runPackage();
        program.f_grantPermissions();
        program.f_runSoftware();
    }
    
}

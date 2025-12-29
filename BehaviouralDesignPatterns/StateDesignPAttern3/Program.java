package BehaviouralDesignPatterns.StateDesignPAttern3;

public class Program {
    InstallPackage installPackage = new InstallPackage(this);
    RunPackage runPackage = new RunPackage(this);
    GrantPermissions grantPermissions = new GrantPermissions(this);
    RunSoftware runSoftware = new RunSoftware(this);

    Installation installation;

    Program(){
        installation = installPackage;
    }

    Installation getInstallation(){
        return this.installation;
    }

    void f_installPackage(){
        installation.installPackage();
    }

    void f_runPackage(){
        installation.runPackage();
    }

    void f_grantPermissions(){
        installation.grantPermissions();
    }

    void f_runSoftware(){
        installation.runSoftware();
    }

    void changeState(Installation install){
        installation = install;
    }
    
}

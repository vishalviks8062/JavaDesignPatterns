package BehaviouralDesignPatterns.StateDesignPAttern3;

public class InstallPackage implements Installation{
    Program program;

    InstallPackage(Program program){
        this.program = program;
    }

    @Override
    public void installPackage() {
        System.out.println("Package is installed successfully!");
        program.changeState(program.runPackage);
    }

    @Override
    public void runPackage() {
        System.out.println("First Install the package");
    }

    @Override
    public void grantPermissions() {
        System.out.println("First Install the package");
    }

    @Override
    public void runSoftware() {
        System.out.println("First install the package");
    }
    
}

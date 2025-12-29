package BehaviouralDesignPatterns.StateDesignPAttern3;

public class RunSoftware implements Installation{
    Program program;

    RunSoftware(Program program){
        this.program = program;
    }

    @Override
    public void installPackage() {
        System.out.println("Package is already installed.");
    }

    @Override
    public void runPackage() {
        System.out.println("Package has ran successfully.");
    }

    @Override
    public void grantPermissions() {
        System.out.println("Permission has been granted!");
    }

    @Override
    public void runSoftware() {
        System.out.println("Run the software!");
    }
    
}

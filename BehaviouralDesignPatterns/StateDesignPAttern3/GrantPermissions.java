package BehaviouralDesignPatterns.StateDesignPAttern3;

public class GrantPermissions implements Installation{
    Program program;

    GrantPermissions(Program program){
        this.program = program;
    }

    @Override
    public void installPackage() {
        System.out.println("Package is already installed.");
    }

    @Override
    public void runPackage() {
        System.out.println("Package has ran successfully");
    }

    @Override
    public void grantPermissions() {
        System.out.println("Granting p[ermission for necessary files");
        program.changeState(program.runSoftware);
    }

    @Override
    public void runSoftware() {
        System.out.println("Please grant necessary permissions first");
    }
    
}

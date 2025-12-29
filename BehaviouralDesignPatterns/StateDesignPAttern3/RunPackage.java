package BehaviouralDesignPatterns.StateDesignPAttern3;

public class RunPackage implements Installation{
    Program program;

    RunPackage(Program program){
        this.program = program;
    }

    @Override
    public void installPackage() {
        System.out.println("Package is already installed");
        
    }

    @Override
    public void runPackage() {
        System.out.println("Running the package, extracting the files.");
        program.changeState(program.grantPermissions);
    }

    @Override
    public void grantPermissions() {
        System.out.println("Run the isntaller!");
        
    }

    @Override
    public void runSoftware() {
        System.out.println("Run the isntaller!");
    }
    
}

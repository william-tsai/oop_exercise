import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects = new ArrayList<Project>();
    
    public Portfolio() {}
    
    public void addProject(Project newProject) {
        this.projects.add(newProject);
    }

    public Project getProject() {
        int lastIndex = this.projects.size() - 1;
        return this.projects.get(lastIndex);
    }

    public Project getProject(int index) {
        return this.projects.get(index);
    }

    public double getPortfolioCost() {
        double cost = 0;
        for (Project project: this.projects) {
            cost += project.getInitialCost();
        }
        return cost;
    }

    public void showPortfolio() {
        for (Project project: this.projects) {
            System.out.println(project.elevatorPitch());
        }
        System.out.println("Total cost: " + this.getPortfolioCost());
    }
}
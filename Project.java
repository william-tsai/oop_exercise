public class Project {
    private String name;
    private String description;
    private double initialCost;
    // Constructor
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Project(String name) {
        this.name = name;
    }
    public Project() {
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setInitialCost(double cost) {
        this.initialCost = cost;
    }
    // Getters
    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }
    public double getInitialCost() {
        return this.initialCost;
    }
    // Methods
    public String elevatorPitch() {
        return this.getName() + " (" + this.getInitialCost() + "): " + this.getDescription();
    }
}
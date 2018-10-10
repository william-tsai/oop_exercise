public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Project #2");
        Project project3 = new Project("Project #3", "This is a description of Project #3.");
        System.out.println(project3.elevatorPitch());
        project1.setName("Project #1");
        project1.setDescription("Description #1");
        project2.setDescription("Description #2");
        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        Portfolio portfolio = new Portfolio();
        portfolio.addProject(project1);
        portfolio.addProject(project2);
        portfolio.addProject(project3);
        System.out.println(portfolio.getProject().getName());
        System.out.println(portfolio.getProject(0).getName());
        System.out.println(portfolio.getPortfolioCost());
        portfolio.showPortfolio();
    }
}
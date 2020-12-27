import java.util.Arrays;

public class projectTest {
    public static void main(String[] args) {
        Project Science = new Project();
        Project Math = new Project("Algebra");
        Project History = new Project("US Government", "The History of the United States of America.");
        Science.setName("Physics");
        Science.setDescription("Describe the known laws of the physical world.");
        Math.setDescription("finding the unknown or putting real life variables into equations");

        System.out.println("Your first assignment is in " + Science.getName() +" to " + Science.getDescription());
        System.out.println("Your second assignment is in " + Math.getName() + " to " + Math.getDescription());
        System.out.println("Your last assignment is in " + History.getName() + " to " + History.getDescription());
    }
}

package CoreJavaPractices.src;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public final class ImmutableEmployee {

  private final int id;
  private final String name;
  private final List<String> skills;

  public ImmutableEmployee(int id, String name, List<String> skills) {
    this.id = id;
    this.name = name;
    this.skills = new ArrayList<>(skills);
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<String> getSkills() {
    return Collections.unmodifiableList(skills);
  }

  // ✅ Returns a new object with an added skill (Immutable principle)
  public ImmutableEmployee withAddedSkill(String newSkill) {
    List<String> newSkills = new ArrayList<>(this.skills); // Copy current skills
    newSkills.add(newSkill); // Add new skill
    return new ImmutableEmployee(this.id, this.name, newSkills); // Return new object
  }

  @Override
  public String toString() {
    return "ImmutableEmployee{id=" + id + ", name='" + name + "', skills=" + skills + "}";
  }

  public static void main(String[] args) {
    List<String> skills = new ArrayList<>();
    skills.add("Java");
    skills.add("Spring Boot");

    ImmutableEmployee emp = new ImmutableEmployee(101, "John Doe", skills);
    System.out.println("Original Employee: " + emp);

    // Adding a new skill (Java 8 Streams)
    ImmutableEmployee updatedEmp = emp.withAddedSkill("Java 8 Streams");
    System.out.println("Updated Employee: " + updatedEmp);

    // Checking if original object is modified
    System.out.println("Original Employee after modification attempt: " + emp);

    // Attempt to modify the list via getSkills() (this should fail)
    List<String> empSkills = emp.getSkills();
    // empSkills.add("Microservices"); // This line would throw an UnsupportedOperationException

    System.out.println("Employee skills via getter: " + empSkills);
  }
}

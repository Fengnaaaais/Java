public class Main {
  public static void main(String[] args) {

    Person pshon = new Person("Alecsandr", "Gleb");
    Student pshon_student = new Student(
      pshon.first_name, 
      pshon.last_name, 
      4.5
    );
    Fermer fermer = new Fermer("Bob", "Last", 34);
    fermer.showInfo();

    System.out.println(pshon_student.getName());
    System.out.println(pshon_student.gpa);
  }
}


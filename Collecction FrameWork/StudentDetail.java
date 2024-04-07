import java.util.HashSet;
import java.util.Set;

class Student {
    String name;
    int roll;

    public Student(String name, int roll){
        this.name=name;
        this.roll=roll;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll=" + roll + "] \n";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roll;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (roll != other.roll)
            return false;
        return true;
    }

    

}

class StudentDetail{
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Ramesh", 3));
        studentSet.add(new Student("Suresh", 2));
        studentSet.add(new Student("Mahesh", 5));
        studentSet.add(new Student("Ganesh", 1));

        // this is the problem in heshset. it can't compare two simsilar object becoz same object created by new keyword.
        // studentSet.add(new Student("Golu", 2));

        // This problem can resolve by implementing hashcode & equals methods in Student calss.
        studentSet.add(new Student("Golu", 2));  // same roll-no can't assigne to two student.
         

        System.out.println(studentSet);
        
    }
}
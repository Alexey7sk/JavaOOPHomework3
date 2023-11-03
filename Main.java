import java.time.LocalDate;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    User User1 = new User("Ivan", "Ivanov", "Ivanovich", LocalDate.now());
    User User2 = new User("Petr", "Petrov", "Petrovich", LocalDate.now());
    User User3 = new User("Semen", "Semenov", "Semenovich", LocalDate.now());

    TreeSet treeSet = new TreeSet(new UserComparator());
    treeSet.add(User1);
    treeSet.add(User2);
    treeSet.add(User3);


    System.out.println(treeSet);
  }
}

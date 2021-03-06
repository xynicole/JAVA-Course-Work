package assignment03;
import java.util.List;
import java.util.ArrayList;

public class ClassRoomTester{
	public static void main(String[] args){
		ClassRoom classRoom = new ClassRoom();

		classRoom.addStudent(new Student("100001", "Miller", "Gina"));
		classRoom.addStudent(new Student("100002", "Swift", "Tyler"));
		classRoom.addStudent(new Student("100003", "Jones", "Arnold"));
		classRoom.addStudent(new Student("100004", "Wang", "Jessica"));
		classRoom.addStudent(new Student("100005", "William", "Richard"));
		
		
		System.out.println("**************Original Class Roster**********");
		System.out.println(classRoom);

		classRoom.dropStudent("100002");

		System.out.println("\n*******Dropped Tyler from the Roster**********");
		System.out.println(classRoom);

		classRoom.sortById();

		System.out.println("\n*******Roster after sorting by Id's**********");
		System.out.println(classRoom);
		for(Student s : classRoom.getRoster()){
			System.out.println("Name: " + s.getName() + "\tId: " + s.getBnumber());
		}
		
		classRoom.sortByName();

		System.out.println("\n*******Roster after sorting by Names**********");
		System.out.println(classRoom);
		
		
		for(Student s : classRoom.getRoster()){
			System.out.println("Name: " + s.getName() + "\tId: " + s.getBnumber());
		}

	}
}
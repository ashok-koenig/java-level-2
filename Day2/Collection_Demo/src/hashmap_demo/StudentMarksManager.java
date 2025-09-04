package hashmap_demo;

import java.util.HashMap;

public class StudentMarksManager {
    HashMap<String, Integer> studentMarks = new HashMap<>();

    public void addMark(String name, int mark){
        studentMarks.put(name, mark);
    }

    public void getStudentMark(String name){
        Integer mark = studentMarks.get(name);
        if(mark != null){
            System.out.println(name + " has scored "+ mark + " marks");
        }else{
            System.out.println(name + " is not found in records");
        }
    }

    public static void main(String[] args) {
        StudentMarksManager marksManager = new StudentMarksManager();
        marksManager.addMark("John", 89);
        marksManager.addMark("Peter", 78);

        marksManager.addMark("John", 95);

        marksManager.getStudentMark("John");

        marksManager.getStudentMark("Smith");
    }
}

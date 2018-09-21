import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public static void main(String[] ags){
        Student s1 = new Student(12,"dravid",23);
        Student s2 = new Student(13,"smith",24);
        Student s3 = new Student(13,"alice",23);
        List<Student> list = new ArrayList<Student>();

        list.add(s1);
        list.add(s2);
        list.add(s3);

        Collections.sort(list,new StudentSort());
        System.out.println(list.toString());

    }




}
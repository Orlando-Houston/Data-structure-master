package SortJavaCoursess;

import java.util.Comparator;

public class NameSorting implements Comparator<Student> {
    public int compare(Student st1, Student st2){
        return st1.name.compareTo (st2.name);
    }

}

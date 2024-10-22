package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Student s1 = new Student("1001","홍길동");
        Student s2 = new Student("1002","빅문수");
        Student s3 = new Student("1003","임꺽정");

        HashSet<Student> hs = new HashSet<>();
        //Set<String> hs1= new HashSet<>();

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        System.out.println(hs);

        for(Student data : hs){
            System.out.println(data);
        }

        //Iterator
        Iterator<Student> it = hs.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

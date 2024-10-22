package collection;

import java.sql.Struct;
import java.util.Collection;
import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        Student s1 = new Student("1001","박문수");
        Student s2 = new Student("1002","홍길동");
        Student s3 = new Student("1003","임껏정");

        HashMap<String,Student> hm = new HashMap<>();

        hm.put("a",s1);
        hm.put("b",s2);
        hm.put("c",s3);

        System.out.println(hm);

        System.out.println(hm.keySet());

        Collection<Student> c = hm.values();
        for(Student s : c){
            System.out.println(s);
        }
    }
}

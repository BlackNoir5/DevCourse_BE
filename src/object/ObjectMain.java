package object;

public class ObjectMain {
    public static void main(String[] args){

        //Object 클래스 생성
        Object obj = new Object();
        System.out.println(obj);
        //java.lang.Object(자료형) @3872598(해쉬코드)

        //자료형만 분리
        System.out.println(obj.toString());
        System.out.println(obj.getClass().getName());

        //10->16진수
        System.out.println(obj.hashCode());
        System.out.printf("%x\n",obj.hashCode());

        Person person = new Person(10, "이순신", 40);
        System.out.println(person.viewData());

        //Object안에 toString
        System.out.println(person.toString());

        //Object - toString
        // => overriding
        //Stirng - toString
    }
}

package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        //비제네릭 코드 내부 데이터 규정 X
        List list = new ArrayList();
        list.add("A");
        list.add(1);
        list.add(Integer.valueOf(2));

        String str = (String) list.get(0);


        List<String> list2 = new ArrayList();
        list2.add("A");
        //list2.add(1);
        str = list2.get(0);


        //List
        //타입 안정성이 없음
        Box1 b1 = new Box1();
        b1.setObject(new String("홍길동")); // 문자열
        String name = (String) b1.getObject();
        System.out.println(name);

        b1.setObject(Integer.valueOf(10));     // 정수
        int data = (int) b1.getObject();
        System.out.println(data);

        //타입을 강제함으로써 안정성이 생김 (별도 박싱 언박싱 처리 불필요 -> auto : true)
        Box2<String> b2 = new Box2<>();
        b2.setT("홍길동");
        String name1 = b2.getT();
        System.out.println(name1);

        Box2<Integer> b3 = new Box2<>();
        b3.setT(10);
        int data1 = b3.getT();
        System.out.println(data1);

        // 제네릭의 원리.
        Product<Tv,String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");

        Tv tv = product1.getKind();
        String model = product1.getModel();
        System.out.println(model + ":" + tv);

        Product<Car,String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("디젤");

        Car car = product2.getKind();
        model = product2.getModel();
        System.out.println(model + " : " + car);
    }
}

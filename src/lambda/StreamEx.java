package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
//        String[] nameArr = {"IronMan","Captain","SpiderMan", "Thor"};
//
//        Arrays.sort(nameArr);
//
//        for(String name : nameArr){
//            System.out.println(name);
//        }
//
//        //Stream
//        //Stream 생성
//        Stream<String> nameStream = Arrays.stream(nameArr);
//        //Stream 처리
//        //Stream 출력
//        nameStream
//                .sorted()
//                .forEach(System.out::println);

        // 스트림 생성
        // List/Set/Map -> 스트림 변경가능
        // 문자열
        // 배열
        // 특정 범위 정수
        // 난수
        // 람다
        // 빈스트림

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();

        //for문을 통한 출력
        intStream.forEach(System.out::print);
        System.out.println();

        Stream<String> strStream = Stream.of("a","b","c");
        strStream.forEach(System.out::print);
        System.out.println();

        Stream<Integer> emptyStream = Stream.empty();
        System.out.println("출력");
        emptyStream.forEach(System.out::print);
        System.out.println();

        IntStream test1 = IntStream.rangeClosed(1,10);
        //test1.forEach(System.out::print);
        System.out.println();

        test1.filter(i -> i%2==0).forEach(System.out::print);
        System.out.println();

        IntStream test2 = IntStream.of(1, 2, 3, 3, 2, 5, 7, 6, 9);
        test2.distinct().forEach(System.out::print);
        System.out.println();

        Stream<String> str1Stream = Stream.of("b","cc","D","C","AA","F");
        //str1Stream.sorted().forEach(System.out::println);
        //System.out.println();

        //str1Stream.sorted((s1,s2)->s1.compareTo(s2)).forEach(System.out::print);
        //str1Stream.sorted((s2,s1)->s1.compareTo(s2)).forEach(System.out::print);
        str1Stream.sorted( String.CASE_INSENSITIVE_ORDER).forEach(System.out::print);
        System.out.println();
    }
}

package inner;

public class InnerEx {
    private int y = 200; // 외부 클래스의 인스턴스 변수

    public void doInner() {
        int x = 100; // 지역 변수

        System.out.println("외부 this = " + this); // 외부 클래스의 this 출력

        // 익명 내부 클래스 정의와 동시에 viewInner 메서드 구현
        new InterA() {
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출 ");

                // 내부 클래스의 this (익명 내부 클래스의 인스턴스 참조)
                System.out.println("내부 this = " + this);

                // 외부 클래스의 인스턴스를 가리키는 참조
                System.out.println("외부 this = " + InnerEx.this);

                // 외부 클래스의 인스턴스 변수 y 출력
                System.out.println("y = " + InnerEx.this.y);

                // System.out.println("y = " + this.y); // 컴파일 오류 발생
                // 오류 이유: 익명 내부 클래스에서 `this`는 익명 클래스 자신을 가리키므로 외부 클래스의 변수 y에 접근할 수 없음.
                // `this`를 사용해 외부 클래스 변수에 접근하려면 `OuterClassName.this` 형식을 사용해야 함 (InnerEx02.this.y)
            }
        }.viewInner(); // 익명 내부 클래스의 viewInner 메서드 호출
    }

    public static void main(String[] args) {
        // InnerEx02 클래스의 인스턴스 생성 후 doInner 메서드 호출
        InnerEx ie = new InnerEx();
        ie.doInner();
    }

//    public static void main(String[] args) {
//
//
////        // 익명 이너 클래스 사용 (참조 변수 없음)
////        // 인스턴스화와 동시에 인터페이스의 추상 메서드를 오버라이드하여 구현
////        new InterA() {
////            @Override
////            public void viewInner() {
////                System.out.println("viewInner 호출");
////            }
////        }.viewInner(); // 익명 객체로 viewInner 호출
////
////        // 익명 이너 클래스 사용 (참조 변수 ia 사용)
////        // 인터페이스 구현과 동시에 메서드 오버라이드
////        InterA ia = new InterA() {
////            @Override
////            public void viewInner() {
////                System.out.println("viewInner 호출");
////            }
////        };
////
////        // 참조 변수를 통해 viewInner 호출
////        ia.viewInner();
//
//
//
////        // Outer 클래스의 객체 생성
////        Outer outer = new Outer();
////
////        // Outer 클래스의 public 멤버 변수 접근 및 출력
////        System.out.println(outer.x2);
////
////        // Outer 클래스의 Inner 인스턴스 멤버 클래스 객체 생성
////        Outer.Inner inner = new Outer.Inner();
////
////        // Inner 클래스의 public 멤버 변수 접근 및 출력
////        System.out.println(inner.y2);
////
////        // Inner 클래스의 메서드 호출하여 내부 정보 출력
////        inner.viewInner();
//    }
}

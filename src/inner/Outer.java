package inner;

class Outer {
    private int x1 = 100; // private 접근 제어자 사용 - 외부 클래스에서 접근 불가
    public int x2 = 100;  // public 접근 제어자 사용 - 외부 클래스에서 접근 가능

    // 내부 클래스 Inner 정의
    static class Inner {
        private int y1 = 200; // private 접근 제어자 사용 - 외부 클래스에서 접근 불가
        public int y2 = 200;  // public 접근 제어자 사용 - 외부 클래스에서 접근 가능

        public Inner() {
            // Inner 객체가 생성되었을 때 메시지 출력
            System.out.println("Inner : " + this);
        }

        void viewInner() {
            // 내부 클래스의 메서드 - 내부와 외부 클래스의 멤버 변수 출력
            System.out.println("Instance Member Class");
//            System.out.println("x1 = " + x1); // 외부 클래스의 private 멤버 변수에 접근 가능
//            System.out.println("x2 = " + x2); // 외부 클래스의 public 멤버 변수에 접근 가능
            System.out.println("y1 = " + y1); // 내부 클래스의 private 멤버 변수
            System.out.println("y2 = " + y2); // 내부 클래스의 public 멤버 변수
        }
    }
}
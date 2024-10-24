package stream;

import java.io.Serializable;

// Serializable - 데이터를 뽑을 수 있게 해줘라 (file 입출력)
public class Person implements Serializable {
    private String name;
    private String phone;
    private int age;
    transient private String address;

    public Person(String name, String phone, int age, String address) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}

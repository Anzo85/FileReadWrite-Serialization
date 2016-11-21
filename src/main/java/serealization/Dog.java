package serealization;

import java.io.Serializable;

/**
 * Created by anzo0316 on 11/21/2016.
 */
public class Dog implements Serializable {

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

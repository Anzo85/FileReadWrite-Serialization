package serealization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Objects;


public class Smain {

    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("Snoop", 31);


        FileOutputStream fileOutputStream = new FileOutputStream("C://Users/anzo0316/Documents/ser.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(dog);


        // ####################################################

        FileInputStream in = new FileInputStream("C://Users/anzo0316/Documents/ser.ser");
        ObjectInputStream inputStream = new ObjectInputStream(in);

        Dog dog1 = (Dog) inputStream.readObject();

        System.out.println(dog1);

    }
}

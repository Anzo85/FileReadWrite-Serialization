package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyRead {


    public static void main(String[] args) throws Exception {


        String value = "TEST66";
        String path = "C://Users/anzo0316/Documents/ffff2.txt";
        String outPath = "C://Users/anzo0316/Documents/mapTest.txt";
        fileRead(path, outPath);


    }


    public static void startRead(String path) {

        try (FileReader reader = new FileReader(path)) {

            int symbol;
            String result = "";

            while ((symbol = reader.read()) != -1) {

                result += (char) symbol;
            }
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void startWrite(String outPath, String value) {

        try (FileWriter writer = new FileWriter(outPath)) {

            writer.write(value);

            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static void fileRead(String path, String outPath) throws Exception {


        FileReader reader = new FileReader(path);
        BufferedReader bread = new BufferedReader(reader);

        String line;
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        while ((line = bread.readLine()) != null) {

            String[] words = line.split(" ");
            for (String word : words) {
                if (map.containsKey(word)) {
                    Integer value = map.get(word);
                    value++;
                    map.put(word, value);
                } else map.put(word, 1);
            }


        }

        String s = " " + map;
        FileWriter fileWriter = new FileWriter(outPath);
        fileWriter.write(s);
        fileWriter.flush();
        fileWriter.close();


    }

}

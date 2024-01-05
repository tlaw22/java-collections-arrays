package myapp;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <String> words = new ArrayList<String>();
        words.add("hello there");
        words.add("Jimmy");
        String item1 = words.get(0);
        String item2 = words.get(1);
        System.out.println(item1 + item2);

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(5); 
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.removeLast();
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}

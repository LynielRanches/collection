package edu.lynielranches;

import java.util.*;
public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        List<String> names = new ArrayList<>();
        names.add("lyniel");
        names.add("Rabino");
        names.add("ryel");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }

        for (String n : names) {
            System.out.println(n);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i).toString());
        }

        var animals = new ArrayList<Animal>();
        var e = new Animal();
        e.color = "Brown";
        e.name = "Chris";
        animals.add(e);
        animals.add(new Animal("Black", "Marcel"));

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i); 
            System.out.println(animal.name);
        }

        for (Animal animal : animals) {
            System.out.println(animal.name);
        }

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Rabino", 67);
        scores.put("Rico", 89);

        for (Map.Entry<String, Integer> score : scores.entrySet()) {
            System.out.println(score.getKey() + ":" + score.getValue());
        }

        var myname = new Box<String>();
        var myage = new Box<Integer>();
        myname.set("Ranches");
        myage.set(18);
        System.out.println(myname.get());
        System.out.println(myage.get());
        double sum = MyMath.add(5, 10);
        double sum2 = MyMath.add(5.5, 10.5);
        System.out.println(sum);
        System.out.println(sum2);

    }

    static class MyMath {
        public static <T extends Number> double add(T a, T b) {
            return a.doubleValue() + b.doubleValue();
        }
    }

    static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }
    }

    static class Animal {
        public String color;
        public String name;

        public Animal() {
        }

        public Animal(String color, String name) {
            this.color = color;
            this.name = name;
        }
    }
}
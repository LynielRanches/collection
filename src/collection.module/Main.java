package edu.lynielranches;
import java.util.*;

public class Main { 
    public static void main(String args[]) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Mark");
        names.add("Ana"); // duplicates allowed

        Iterator<String> it = names.iterartor();
        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }

        for (String n: names){
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
        animals.add(new Animal("Black", "Ne"));

        for(int i=0; i < animals.size(); i++) {
            System.out.println(animals.get(i).name);
        }
        for(Animal animal : animals) {
            System.out.println(animal.name);
        }

         Map<String, Integer> scores = new HashMap();
        scores.put("Chico", 98);
        scores.put("Andrick", 100);
        for(Map.Entry<String, Integer> score : scores.entrySet()) {
            System.out.println(score.getKey() + ":" + score.getValue());
        }
    }

    class Animal {
        public String color;
        public String name;
        public Animal(){}
        public Animal(String color, String name) {
            this.color = color;
            this.name = name;
        }
    }
}
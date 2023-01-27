package HomeWork2_10;

import test2_10.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Ilia", 17);
        Person person2 = new Person("Ivan", 11);
        Person person3 = new Person("Chip", 60);
        Person person4 = new Person("Maria", 19);
        Person person5 = new Person("Inna", 45);

        List<Person> family = new ArrayList<Person>();
        family.add(person1);
        family.add(person2);
        family.add(person3);
        family.add(person4);
        family.add(person5);

//  task 1

        Predicate<Person> predicate = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                if (person.getAge() > 0) {
                    return true;
                }
                return false;
            }
        };
        Predicate<Person> predicate1 = person -> person.getAge() > 0;

        for (Person person : family) {
            System.out.println(predicate1.test(person));
        }

//  task 2

        Consumer<Person> consumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("Привет! Меня зовут " + person.getName() + ", мне " + person.getAge());
            }
        };
        Consumer<Person> consumer1 = person -> System.out.println("Привет! Меня зовут " + person.getName() + ", мне " + person.getAge());

        for (Person person : family) {
            consumer1.accept(person);
        }

//  task 3

        double number = 5.6;
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double number) {
                return Math.round(number);
            }
        };
        Function<Double, Long> function1 = v -> Math.round(v);

        System.out.println(function1.apply(number));

//  task 4

        Supplier<Long> randomNumber = new Supplier<Long>() {
            @Override
            public Long get() {
                Long randNumber1 = (long) (Math.random() * 101);
                return randNumber1;
            }
        };

        Supplier<Long> randomNumber1 = () -> {
            Long randNumber1 = (long) (Math.random() * 101);
            return randNumber1;
        };
        System.out.println(randomNumber1.get());

//  task 5
        Integer numb = 4;

        Predicate<Integer> task5Predicate = integer -> {
            if (numb >= 0) {
                return true;
            }
            return false;
        };
        Function<Integer, Integer> ifTrue = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer numb) {
                numb = numb * 10;
                return numb;
            }
        };


        Function<Integer, Integer> ifFalse = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer numb) {
                numb = numb * -10;
                return numb;
            }
        };

        System.out.println(Task5.ternaryOperator(task5Predicate, ifTrue, ifFalse));
    }
}




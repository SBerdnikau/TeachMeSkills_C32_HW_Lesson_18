package com.teachmeskills.lesson_18.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Задача 2
 * Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
 * С помощью Stream'ов:
 * 	- Выбрать все имена, начинающиеся на любую букву, введенную с консоли (вне зависимости от верхнего/нижнего регистра букв)
 * 	- Отсортировать и вернуть первый элемент коллекции
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Dmitriy"));
        students.add(new Student("Ilya"));
        students.add(new Student("Bogdan"));
        students.add(new Student("Igor"));
        students.add(new Student("Marina"));
        students.add(new Student("Daniil"));
        students.add(new Student("Sultan"));
        students.add(new Student("Georgi"));
        students.add(new Student("Kirill"));
        students.add(new Student("Kate"));
        students.add(new Student("Dmitry"));
        students.add(new Student("Rita"));
        students.add(new Student("Vlad"));
        students.add(new Student("Sergio"));
        students.add(new Student("Oleg"));

        System.out.print("Enter a letter to search for student names:");
        try(Scanner scanner = new Scanner(System.in)) {
           String inputNameStudent = scanner.next().toLowerCase().trim();

           if (inputNameStudent.isEmpty()){
               System.out.println("You have entered an empty string. Please enter a letter.");
               return;
           }

           List<Student> result = students.stream()
                                        .filter(student -> student.getName().toLowerCase().startsWith(inputNameStudent))
                                        .sorted()
                                        .findFirst()
                                        .stream().toList();

            System.out.println(result);
        }catch (Exception e){
            System.out.println("General exception input: " + e.getMessage());
        }
    }
}

package com.teachmeskills.lesson_18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Задача 1
 * Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
 * С помощью Stream'ов:
 * 	- Удалить дубликаты
 * 	- Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 * 	- Каждый элемент умножить на 2
 * 	- Отсортировать и вывести на экран первых 4 элемента
 * 	- Вывести количество элементов в стриме
 * 	- Вывести среднее арифметическое всех чисел в стриме
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++){
            list.add( (int) (Math.random() * 100));
        }

        System.out.println("List before:");
        for (Integer item : list){
            System.out.print(item + " ");
        }

        List<Integer> distinctNumbers = list.stream()
                .distinct()
                .toList();

        List<Integer> evenInRange = distinctNumbers.stream()
                .filter(n -> n % 2 == 0 && n >= 7 && n <= 17)
                .toList();
        System.out.println("\nEven elements in the range from 7 to 17: " + evenInRange);

        List<Integer> multipliedByTwo = evenInRange.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("Elements multiplied by 2: " + multipliedByTwo);

        long count = multipliedByTwo.stream().count();
        System.out.println("Number of elements in the stream: " + count);

        double average = multipliedByTwo.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Arithmetic mean: " + average);
    }
}

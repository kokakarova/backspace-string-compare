package org.aoc2024;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String fileName = "puzzle.txt";
//        solution.getSolution(fileName, 1);
//        System.out.println("PART_1 result: " + solution.getSumOfMultiples());
//        solution.setSumOfMultiples(0);
        solution.getSolution(fileName, 2);
        System.out.println("PART_2 result: " + solution.getSumOfMultiples());
    }
}
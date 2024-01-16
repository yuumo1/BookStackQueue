/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookstackqueue;

/**
 *
 * @author Erika
 */
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;


public class BookStackQueue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        System.out.println("Enter four book titles.");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Book " + i + ": ");
            String bookTitle = scanner.nextLine();
            stack.push(bookTitle);
        }

        // Pop elements from stack and add to queue
        while (!stack.isEmpty()) {
            String bookTitle = stack.pop();
            queue.add(bookTitle);
        }

        // Print the content
        System.out.println("New order of books: " + queue);
    }
}

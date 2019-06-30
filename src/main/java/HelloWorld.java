package main.java;

import java.io.PrintStream;

public class HelloWorld {
    public static void print(PrintStream out) {
        out.print("Hello World");
    }
    public static void main(String[] args) {
        print(System.out);
    }
}

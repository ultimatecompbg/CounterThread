package org.ultimatecompbg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Runnable runnable = new Counter();
        Thread thread = new Thread(runnable);
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        thread.interrupt();
    }

}

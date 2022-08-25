package org.ultimatecompbg;

import java.util.Scanner;

public class Main extends Thread {
    public static int number = 0;
    public static void main(String[] args){
        Main thread = new Main();
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        thread.interrupt();
        System.out.println(number);
    }
    public void run() {
            while(number < 1000){
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e) {
                    break;
                }
                number++;
            }
    }
}

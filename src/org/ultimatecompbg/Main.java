package org.ultimatecompbg;

import java.util.Scanner;
//DA: Do it in separate class. Use Runnable
public class Main extends Thread {
    private int number = 0;
    public static void main(String[] args){
        Main thread = new Main();
        thread.start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        thread.interrupt();
    }
    public void run() {
            while(number < 1000){
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e) {
                    System.out.println(number);
                    break;
                }
                number++;
            }
    }
}

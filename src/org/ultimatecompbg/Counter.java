package org.ultimatecompbg;

public class Counter implements Runnable {
    private int number = 0;
    public void run(){
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

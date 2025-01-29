package org.example;
// static makes
public class Time {
    public static void main(String[] args) {
        System.out.println("In only seconds that is: "+ toSeconds(2, 46, 39));
        /*int hours = 2;
        int minutes = 46;
        int seconds = 39;
        hours = hours*60*60;
        minutes = minutes*60;
        System.out.println(hours+minutes+seconds);*/
    }
    public  static int toSeconds(int hours, int minutes, int seconds) {
        hours = hours*60*60;
        minutes = minutes*60;
        return hours + minutes + seconds;
    }
}

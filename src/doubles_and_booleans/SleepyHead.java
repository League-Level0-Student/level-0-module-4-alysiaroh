package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday=false, isVacation=false;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
              JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int a = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",JOptionPane.YES_NO_OPTION);
        int b = JOptionPane.showConfirmDialog(null, "Is it vacation?","Sleepy Head",JOptionPane.YES_NO_OPTION);
        System.out.println(b);
        if(a==0) {
        	isWeekday=true;
        }
        if(a==1) {
        	isWeekday=false;
        }
        if(b==1) {
        	isVacation=false;
        }
        if(b==0)  {
        	isVacation=true;
        }
 
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
        if(isWeekday) {
        	if(isVacation) {
        		System.out.println("sleep in?");
        	}
        	else {
        		System.out.println("get up lazybones!");
        	}
        	
        }
        else {
        	System.out.println("sleep in?");
        }
    }
}

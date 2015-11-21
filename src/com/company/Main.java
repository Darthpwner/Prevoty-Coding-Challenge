package com.company;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<Process> pStack = new Stack<Process>();

        String x = "start,Start,10667692814595116481\n" +
                "start,SID,10887999980799835056\n" +
                "start,FELIPA,11029975320746904540\n" +
                "stop,11183464898197635685\n" +
                "start,ROYAL,11661287678243100846\n" +
                "stop,11920616918690070960\n" +
                "start,BRITTNY,12068997936167808161\n" +
                "stop,12369447262822116671\n" +
                "start,LORETTA,12861104570811461037\n" +
                "stop,13136490188063910496\n" +
                "stop,13624369881796551277\n" +
                "start,MARQUITTA,13824531268558281121\n" +
                "start,YAEL,13867808694691558088\n" +
                "stop,14069861458045120743\n" +
                "stop,14293342400885145858\n" +
                "start,KIRK,14798994293498715394\n" +
                "start,MAGALY,14801237725419530472\n" +
                "stop,14881630370243960606\n" +
                "start,NAOMI,15195538922953335103\n" +
                "start,CAMILLA,15403353912411476864\n" +
                "stop,15924572007385403096\n" +
                "stop,16076492030239276909\n" +
                "start,LEAH,16088216053861957341\n" +
                "stop,16416812716114828354\n" +
                "stop,16647558276747466818\n" +
                "start,SHERLY,16820970894872813343\n" +
                "start,JEANENE,17277969188513390049\n" +
                "start,VON,17412311996399067662\n" +
                "stop,17587484155956235706\n" +
                "stop,18064864302924763378\n" +
                "stop,18140678284770636291\n" +
                "stop,18446744073709551615\n" +
                "\n";

        getOutput(x);
    }

    public static void getOutput(String x) {
        Stack<Process> pStack = new Stack<Process>();
        ArrayList<Process> printResults = new ArrayList<>();

        String arr1[] = Process.parseText(x);    //Breaks each newline into a group

        //Parse through each line and interpret the result
        for(int i = 0; i < arr1.length; i++) {
            String arr2[] = Process.parseLine(arr1[i]);  //Breaks down each line based on keyword

            if(arr2[0].equals("start")) {
                Process p = new Process(arr2[1], arr2[2]);  //PRoblem
                printResults.add(p);
                pStack.add(p);
            } else if(arr2[0].equals("stop")) {
                //Pop off the stack, add to the output, and obtain the timestamp difference
                Process p = pStack.pop();

                p.setM_stop_timestamp(arr2[1]);
                //Calculate difference when pritned
            }
        }

        for(int i = 0; i < printResults.size(); i++) {
            System.out.println(printResults.get(i).getM_name() + ": " + printResults.get(i).timestampDifference());
        }
    }
}

package com.company;

import java.math.BigInteger;
import java.util.Stack;

/**
 * Created by Darthpwner on 11/20/15.
 */
public class Process {
    //BigInteger(String s)
    private String m_start_timestamp;
    private String m_stop_timestamp;
    private String m_name;
    private int m_tabs;

    Process(String name, String  startTimestamp) {
        m_name = name;
        m_start_timestamp = startTimestamp;
    }

    //Getters
    public String getM_start_timestamp() {
        return m_start_timestamp;
    }

    public String getM_stop_timestamp() {
        return m_stop_timestamp;
    }

    public String getM_name() {
        return m_name;
    }

    //Setters
    public void setM_start_timestamp(String timestamp) {
        m_start_timestamp = timestamp;
    }

    public void setM_stop_timestamp(String timestamp) {
        m_stop_timestamp = timestamp;
    }

    public void setM_name(String name) {
        m_name = name;
    }

    public BigInteger timestampDifference() {
        BigInteger stop = new BigInteger(m_stop_timestamp);
        BigInteger start = new BigInteger(m_start_timestamp);

        return stop.subtract(start);
    }

    //Parses each line in the receipt
    public static String[] parseText(String text) {
        String[] arr = text.split("\n");

        return arr;
    }

    //Parses each word in a line
    public static String[] parseLine(String text) {
        String[] arr = text.split(",");

        return arr;
    }

    public void start(Process p) {

    }

    public void stop() {

    }



}

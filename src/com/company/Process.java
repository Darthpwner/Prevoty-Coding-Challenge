package com.company;

import java.math.BigInteger;
import java.util.Stack;

/**
 * Created by Darthpwner on 11/20/15.
 */
public class Process {
    private String m_start_timestamp;
    private String m_stop_timestamp;
    private String m_name;

    Process(String name, String  startTimestamp) {
        m_name = name;
        m_start_timestamp = startTimestamp;
    }

    //Getters
    public String getM_name() {
        return m_name;
    }

    //Setters
    public void setM_stop_timestamp(String timestamp) {
        m_stop_timestamp = timestamp;
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
}

package com.company;

import java.math.BigInteger;
import java.util.Stack;

/**
 * Created by Darthpwner on 11/20/15.
 */
public class Process {
    //BigInteger(String s)
    private long m_start_timestamp;
    private long m_stop_timestamp;
    private String m_name;


    Process(String name, long startTimestamp) {
        m_name = name;
        m_start_timestamp = startTimestamp;
    }

    //Getters
    public long getM_start_timestamp() {
        return m_start_timestamp;
    }

    public long getM_stop_timestamp() {
        return m_stop_timestamp;
    }

    public String getM_name() {
        return m_name;
    }

    //Setters
    public void setM_start_timestamp(long timestamp) {
        m_start_timestamp = timestamp;
    }

    public void setM_stop_timestamp(long timestamp) {
        m_stop_timestamp = timestamp;
    }

    public void setM_name(String name) {
        m_name = name;
    }

    //public

    public long timestampDifference() {
        return m_stop_timestamp - m_start_timestamp;
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

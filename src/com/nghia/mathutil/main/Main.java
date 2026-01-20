/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghia.mathutil.main;

import com.nghia.mathutil.core.MathUtil;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        // -5 = ?
        // 0 = ?
        // 20 = ?
        // 21 = ?
        // Test case
        // Test case là 1 tình huống sử dụng APP(Hàm) mà nó bao hàm data đầu vào cụt hể nào đó
        // output đầu ra ứng với xử lí của hàm.chức năng của APP, dĩ nhiên dùng đầu vào để xử lí 
        // so sánh EXPECTED VALUE với ACTUAL VALUE
        long expected = 120; // EXPECTED : 120
        int n = 5; //input
        long actual = MathUtil.getFactoria(n);
        System.out.println("5! = " + expected + " expexted ");
        System.out.println("5! = " + actual + " actual");

    }
}

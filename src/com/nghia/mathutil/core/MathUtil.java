/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghia.mathutil.core;

/**
 *
 * @author PC
 */
public class MathUtil {

    // hàm tính giai thừa
    // n! = 1.2.3.4...n
    // ko có giai thừa cho sso âm 
    // 0!=1 = 1 là 1 quy ước
    // giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    // 20 giai thừa 18 sô 0 vừa đủ cho kiểu long của Java
    // 21 giai thừa sẽ tràn kiểu long
    public static long getFactoria(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long product = 1; // tích nhân , thuật toán heo đất
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

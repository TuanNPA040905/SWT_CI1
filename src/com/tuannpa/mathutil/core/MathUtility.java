/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuannpa.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {
    // trong class nayf cung caaps cho ta raats nhieuf ham
    //clone class Math của JDK
    //hàm thư viện xài chung cho ai đó, mà ko cần lưu lại trạng thái/giá trị
    //chọn thiết kế là hàm static
    
    //Hàm tính giai thừa
    //n!  =   1.2.3.4...n
    //ko có giai thừa cho số âm
    //0! = 1! - 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng 0..20
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0..20");
        }
        if(n == 0 || n == 1)
            return 1;
        return n*getFactorial(n - 1);
    }
}

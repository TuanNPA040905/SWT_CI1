/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuannpa.mathutil.main;

import com.tuannpa.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        //đưa ra các tình huống sử dụng trong thực thế
        //ví dụ: -5, 0, 20, 21
        //Test case: một tình huống/ tính năng đc đưa vào sử dụng giả lập hvi xài của ai đó!
        
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP HAY XÀI HÀM MÀ NÓ BAO GỒM:
        //INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐỐ
        //OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ
        //KÌ VỌNG: MONG HÀM SE TRẢ VỀ VALUE NÀO ĐỐ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KO
        long expected = 120; //tao kì vọng hàm ói về
        int n = 5;
        long actual = MathUtility.getFactorial(n);
        System.out.println("Expected value: " + expected);
        System.out.println("Actual value: " + actual);
    }
}

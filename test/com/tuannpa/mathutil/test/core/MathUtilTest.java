/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template

 */

package com.tuannpa.mathutil.test.core;



import com.tuannpa.mathutil.core.MathUtility;

import org.junit.Test;

import org.junit.Assert;



/**

 *

 * @author Admin

 */

public class MathUtilTest {

    //Đây là class sẽ sử dụng các hàm của thư viện/framework JUnit

    //Để kiểm thử/kiểm tra code chính - hàm tinhsGiaiThua() bên

    //class core.MathUtil

    //Viết code để test code chính bên kia!!!



    //Có nhiều quy tắc đặt tên hàm kiểm thử

    //Nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử

    //tình huống xài hàm theo kiểu thành công và thất bại!!!!

    //Hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon

    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!

    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này

    //@Test phía hậu trường chính là public static void main()

    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tình giai thừa

    @Test

    public void testGetFactorialGivenRightArgumentReturnsWell() {

        int n = 0; //test thử tình huống tử tế đầu vào và mày phải chạy đúng

        long expected = 1;

//        long actual = ;//gọi hàm cần test bên app chính

        long actual = MathUtility.getFactorial(n);



        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework

        Assert.assertEquals(expected, actual);

        //hàm giúp so sánh 2 giá trị nào đó có giống nhau hay ko

        //nếu giống nhau -> Thảy màu xanh đèn đường - đường thông, code ngon

        //                  ít nhất cho case đang test

        //nếu ko giống nhau -> thảy màu đỏ đèn đường

        //                      hàm ý expected và actual ko giống nhau



        //Gộp thêm vài case thành công nữa

        Assert.assertEquals(1, MathUtility.getFactorial(1));



        Assert.assertEquals(2, MathUtility.getFactorial(2));



        Assert.assertEquals(6, MathUtility.getFactorial(3));



        Assert.assertEquals(24, MathUtility.getFactorial(4));



        Assert.assertEquals(120, MathUtility.getFactorial(5));



        Assert.assertEquals(720, MathUtility.getFactorial(6));

    }



    //Tình huống getF() ta thiết kế có 2 tình huống xử lí 

    //1. Đưa data từ tế trong [0..20] -> tính đúng đ n! - done

    //2. Đưa data vào cà chớn, âm, > 20; thiết kế của HÀM là ném ra ngoại lệ

    //Tao kì vọng ngoại lệ xuất hiện khi N < 0 || N > 20

    //rất mong ngoại lệ xuất hiện với n cà chớn này

    //Nếu hàm nhận vào n < 0 || n > 20 và ném ra ngoại lệ

    //Hàm chạy đúng như thiết kế. -> XANH PHẢI XUẤT HIỆN

    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lệ

    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐỎ

    //Test case:

    //input: -5

    //expected: IllegalArgumentException xuất hiện

    //Tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu

    //là những thử ko thể đo lường so sánh theo kiểu value

    //mà chỉ có thể đo lường - cách chúng có xuất hiện hay ko

    //assertEquals() ko dùng để so sánh 2 ngoại lệ

    //      equals() là bằng nhau hay ko trên value!!!

    //Màu đỏ đó em, do đúng là có ném ngoại lệ thật sự

    //              nhưng ko phải là ngoại lệ như kì vọng - thực sự kì vọng sai

    //              ko phải ném sai

//    @Test(expected = NumberFormatException.class)

//    public void testGetFactorialGivenWrongArgumentThrowsException() {

//        MathUtility.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy

//                                        //sẽ ném về ngoại lệ NumberFormat

//    }

    @Test(expected = IllegalArgumentException.class)

    public void testGetFactorialGivenWrongArgumentThrowsException() {

        MathUtility.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy

        //sẽ ném về ngoại lệ NumberFormat

    }

    

    //Cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn!!!

    

    

    @Test

    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {

        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));

    }

    

    @Test

    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {

        try {

            MathUtility.getFactorial(21);

        } catch(Exception e) {

            Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());

        }

    }

}


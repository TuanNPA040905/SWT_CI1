package com.tuannpa.mathutil.test.core;



/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template

 */



import com.tuannpa.mathutil.core.MathUtility;

import org.junit.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;



/**

 *

 * @author Admin

 */



//Câu lệnh này của JUnit báo hiệu rằng sẽ cần loop qua tập data để

//Lấy cặp data input/expected nhồi vào hàm test

@RunWith(value = Parameterized.class)

public class MathUtilDDTTest {

    //Ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected|Input

    @Parameterized.Parameters  //JUnit sẽ ngầm chạy loop qua từng dòng của arr

                               //để lấy ra đc cặp data input/expected

    //tên hàm ko quan trọng, quan trọng là @

    public static Object[][] initData() {

        return new Integer[][] {

            {0,1},

            {1,1},

            {2,2},

            {3,6},

            {4,24},

            {5,120},

            {6,720},

        };  

    }

    //Giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột

    //vào biến tương ứng, lát hồi nó feed cho hàm

    @Parameterized.Parameter(value = 0)

    public int n; //Biến map với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1)

    public long expected; //Kiểu long vì giá trị trả về của hàm getF()

                          //là long

    

    @Test

    public void testGetFactorialGivenRightArgumentReturnsWell() {

        Assert.assertEquals(expected, MathUtility.getFactorial(n));

    }

}


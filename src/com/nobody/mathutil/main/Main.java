/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.nobody.mathutil.main;

import com.nobody.mathutil.core.MathUtil;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(MathUtil.PI);
    }

   public static void tryTDDFirst(){
        //Test case #1 = Tinh huong xai ham so 1;
        //n = 0; hy vong ham tra ve expected = 1;
        //   thuc te ham tra ve may, actual, doan xem, chay ham moi biet !!!
        long expected = 1;
        long actual = MathUtil.getFactorial(0);//xai ham vua viet
        //so sanh 2 gia tri de ham viet dung hay ko??
        //3 thu nay to hop nen 1 thu goi la TEST CASE - TINH HUONG XAI HAM/XAI APP
        System.out.println("0! Status | Expected = " + expected +
                                    " | Actual = " + actual );
        //Vietsub: 0! co dung la bang 1 hay ko?
        
        //Test case #2: n = 1, 1! hy vong tra ve 1 luon, thuc te = may, chay ham moi biet
        expected = 1;
        actual = MathUtil.getFactorial(0);
        System.out.println("0! Status | Expected = " + expected +
                                    " | Actual = " + actual );
        //vietsub: 1! co bang 1 hay ko??
        
        //Test case #3: n = 2, 2! hy vong tra ve 2 luon, thuc te = may, chay ham moi biet
        System.out.println("0! Status | Expected = " + 2 +
                                    " | Actual = " + MathUtil.getFactorial(2) );
    }
}

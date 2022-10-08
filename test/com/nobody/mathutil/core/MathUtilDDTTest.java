/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nobody.mathutil.core;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 *
 * @author ACER
 */

@RunWith(value = Parameterized.class)

public class MathUtilDDTTest {
    
    @Parameterized.Parameters
 public static Object[][] initData(){
     int a[] = {5, 10, 15, 20, 25};
     int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
     int c[][] = {{1, 0},
                 {1, 1}, 
                 {2, 2}, 
                 {6, 3}, 
                 {24, 4}, 
                 {120, 5}, 
                 {720, 6}};
     
       return new Integer[][]    {{1, 0},
                                  {1, 1}, 
                                  {2, 2}, 
                                  {6, 3}, 
                                  {24, 4}, 
                                  {120, 5}, 
                                  {720, 6}};
       
       //ta phải .. hàm so sánh
       //maxvalue của mảng nhồi vào.. ham số parameter
       
  
     }
 }


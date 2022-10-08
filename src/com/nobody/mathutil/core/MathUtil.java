/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nobody.mathutil.core;

/**
 *
 * @author ACER
 */

//Ta sẽ clone bộ thư viện, công cụ Math Util của JDK
//giả lập các hàm của class Math của JDK
//Những gì mà là công cụ khai thác, class khác thì thường sẽ được
//thiết kế
public class MathUtil {
    
  
        public static final double PI = 3.14159265;
        
        //hàm tính n!! = 1,2,3...n
        //quy ước:
        //ko có giai thừa cho số âm
        //0! = 1! = 1
        //21! vượt 18 số 0, vượt kiểu long
        //Hàm của chúng ta chỉ chấp nhận tính giai thừa của n từ 0 ,...20
        //<0 || >20 chửi,mày đưa n cà chớn
     public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if(n==0 || n==1)
            return 1;
        //song sot den day, sure n tu 0..20
        long product = 1; //bien con heo dat, nhan tich luy
                          //acc = accumulation, gop dan
        for (int i = 2; i <= n; i++)
            product *= i;
        return product;
    }
    
}
// kĩ thuật lập trình kiểu mới
// vẫn giữ kiến thức lập trình đã bỏ
//viết code chú ý luôn/cam kết code có chất lượng
//chất lượng ko nói = miệng, chất lượng nói = code
//kĩ thuật TDD - TEST DRIVEN DEVELOPMENT
// viet code để test code song song với nhau
//mỗi năm viết ra phải viết ngay test case, phải viết ngay hành động
//kiểm thử hàm, để biết rằng 
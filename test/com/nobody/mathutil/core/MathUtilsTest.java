/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.nobody.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;


/**
 *
 * @author ACER
 */
public class MathUtilsTest {
    
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        
        long expected =1;
        long actual =MathUtil.getFactorial(0); 
        Assert.assertEquals(expected, actual);
        
        // kiểm thử 1 giao thừa
        expected =1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        //
        expected =1;
        actual = MathUtil.getFactorial(0); 
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
    } 
    
    
    
    
    @Test
    public void tryJUnitFirst(){
        Assert.assertEquals(69, 69);
    }
    
    @Test
     public void testFactorialGivenRightArgumentReturnWell2(){
         
        //Test case #4: n =3, 3! expected =6?
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: n =4, 4! expected =24?
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #6: n =5, 5! expected =120?
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
        //Test case #7: n =6, 6! expected =720?
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
     }
    
    
    
    
    //class này ta sẽ viết các đoạn code như bình thường
    //code này dùng để test core chính mathutils
    //code này được gọi tên là testscript
    //testscript được dùng để test các code chính
    // những code này gọi các hàm bên code chính và gọi giá trĩ trả về các code chính
    // những đoạn code này phải bao gồm các testcase bên trong
    //=> testscript chứa các testcase
    //@Test anoutation ... khi phiên dịch, code trong thư viện đi kèm sẽ tự động ngầm tạo ra thành public static void và gửi hàm main vào jvn
    // mà kĩ thuật dùng thư viện..qua @ thì thư viện nà gọi là framework
    //framework là thư viện .jar, .tml theo các dàng khung code mà nó quy ước, thư viện là những file chứ tml chứa các class bên trong và ta thoải mái dùng hàm của nó theo cách của ta
    //quy tắc chơi xanh đỏ
     //xanh: khi tất cả các testcase đều xanh ( tất cả phải bằng, ko ngoại lệ)
     //đỏ: chỉ cần có 1 test case màu đỏ xem như hàm toang tạch( chỉ có 1 testpackage đỏ, vứt hết), 1 hàm gây sai toàn bộ
     //hàm ko ổn định về kết quả trả về, coi như sai
     //ko thể test hết tất cả các case, nhưng test nào phải xanh
     // về màu đỏ: màu đỏ xảy ra khi có sự không bằng nhau
     //nó bằng assert
     //lý do 1: testpackage đúng, assert sai = > bug
     //lý do 2: testpackage sai, remove it
     // màu đỏ -> xem lại code
     
     
   
     // hàm get if được thiết kế ném ngoại lệ nếu ta đua vào n < 0
     //nhận về exception, argumentException, nhận ngoại lệ
     // thấy ngoại lệ = > mừng
 
     
     //kiểm tra xem có một ngoại lệ thuộc nhóm class ...xuất hine65 hay ko new ... nếu nó xuất hiện = > good
     // kỳ vọng xuất hiện
     
     //test bộ data .. tuần tự vào chỗ kiểm thử 
     // ví dụ test data đã kiểm thử
     // kiểm thử có trả giao thừa hay ko
     // gọi cho từng case, viết cho từng case, ta biến lệnh này tổng quát
     // hay bằng dấu?, lấy từ tập data ở trên, đễ bảo trì hơn
     // kĩ thuật test code data lại sau, được gọi là kĩ thuật viết testcase theo kiểu tham số hóa
     // còn gọi là datetime testing, ddd
     // viết kiểm thử về ...
     
     // mảng là khai báo biến

     //jdoc,JSON,Jackson,Eexcel <- Library
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phuocson.mathutil.test.core;

import com.phuocson.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

 

/**
 *
 * @author PHUOC SON
 */
public class MathUtilityTest {
    //đây là calss sẽ sử dụng các hàm cảu thư viện/ framwork JUnit
    //để kiểm thử/kiểm tra code chính - hàm tinh1GiaiThừa() bên
    //class core.MathUtil
    //viết code để test code chính bên kia!!!
    
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích cảu các case/tình thuống kiểm thử
    //tình huống xài hàm theo kiểu thảnh công và thất bại!!!
    
    //hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void mai()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; //test thử tính huống tử tế đầu vào, mày phải chạy đúng
        long expected = 1;  //hy vọng 0! = 1
        //long actual = ;//gọi hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactrial(n);
        
        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);
        
        //gộp thêm vài case thành công/đưa đầu vào ngon!!!! hàm phải tính ngon
        Assert.assertEquals(1, MathUtil.getFactrial(1));//tui muốn 1! = 1
        Assert.assertEquals(2, MathUtil.getFactrial(2));//tui muốn 2! = 2
        Assert.assertEquals(6, MathUtil.getFactrial(3));//tui muốn 3! = 6
        Assert.assertEquals(24, MathUtil.getFactrial(4));//tui muốn 4! = 24
        Assert.assertEquals(120, MathUtil.getFactrial(5));//tui muốn 5! = 120
        Assert.assertEquals(120, MathUtil.getFactrial(6));//tui muốn 6! = 120
        
    }   //hàm giúp so sánh 2 gái trị nào đó có giống nhau hay không
        //nếu giống nhau -> thảy màu xanh đến đường - đường thông, code ngon
        //                  ít nhất cho case đang test
        //nếu KO GIỐNG NHAU -> thảy màu đỏ đèn đường
        //                     hàm ý expected và actual ko giống nhau
    
    //hàm getF() ta thiết kế có 2 tình huống xử lí
    //1. đưa data tử tế trong [0..20] => tính đúng dc9 n! - done
    //2. đưa data vào cà chớn, âm, >20; THIẾT KẾ CỦA HÀM LÀ NÉM RA NGOẠI LỆ
    //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn này 
    
    //nếu hàm nah6n5 vào n < 0  hoac785 n > 20 và hàm ném ra ngoại lệ
    //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ => XANH PHẢI XUẤT HIỆN
    
    //nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lệ
    //sure, HÀM CHẠY SAI THIẾT KẾ, SAI KÌ VỌNG, MÀU ĐÓ
    
    //Test case: 
    //Input: -5
    //Expected: IllegalArgumentException xuất hiện
    //tính huống bất thường, ngoại lệ, ngài dự tính, dự liệu
    //là những thứ ko thể đo lường = cách chúng có xuất hiện hay không
    //assertEquals() ko đủ để so sánh 2 ngoại lệ
    //      equal() là bằng nhau hay không trên value!!!!!

    //MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
    //              NHƯNG KHONG PHẢI LÀ NGOẠI LỆ NGƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //              KO PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsException(){
//        MathUtil.getFactrial(-5); //hàm @Test chạy, hay hàm getF() chạy
//                                  //sẽ nếm về ngoại lệ NumberFormat....
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactrial(-5); //hàm @Test chạy, hay hàm getF() chạy
                                  //sẽ nếm về ngoại lệ NumberFormat....
    }
    
    //cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn
    //xài lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21
    //tui cần thấy màu xanh khi chơi với 21!
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion(){
//        Assert.assertThrows(tham số 1: loại ngoại lệ mún so sánh,
//                            tham số 2: đoạn code chạy văng ra ngoại lệ runnable);

        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactrial(-5));
        //MathUtil.getFactrial(-5); //hàm @Test chạy, hay hàm getF() chạy
                                  //sẽ nếm về ngoại lệ NumberFormat....
    }
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    //có ném, tức là hàm chạy đúng thiết kế -> xanh
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        try{
            MathUtil.getFactrial(-5); //hàm @Test chạy, hay hàm getF() chạy
        }catch(Exception e){
            //bắt try-catch làn JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng ko chắc ngoại lệ mình cần có xuất hiện hay không???
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xh
            Assert.assertEquals("Invalid argument. N must be between 0...20", e.getMessage());
            
        }
        
    }
}

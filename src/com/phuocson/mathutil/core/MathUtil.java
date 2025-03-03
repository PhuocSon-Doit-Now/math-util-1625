/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuocson.mathutil.core;

/**
 *
 * @author PHUOC SON
 */
public class MathUtil {
    //trong class này cung cap cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //hàm thư việc xài chung cho ai đó, ko cần lưu lại trạng thái/ giá trị
    //chọn thiết kế là hàm static 
    
    //hàm tính gia thừa!!!
    //n! = 1.12.3.4...n
    //ko có giai thừa cho số âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đúng, tăng nhanh về giá trị
    //20 giai thừa 18 con số, vừa kịp đủ cho kiểu long của Java
    //21 giai thừa tràn kiểu long
    //bài này quy ước tính n! trong khoảng từ 0...20
    public static long getFactrial(int n){
        if (n < 0  || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
        if (n == 0 | n == 1)
            return 1; //kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt 
        
        long product = 1;//tích nhân dồn, Thuật toán heo đất, ốc bu dồn thịt
        
        for (int i = 2; i <= n; i++)
            product *= i; //product = product * i;
        return product;
    }
}

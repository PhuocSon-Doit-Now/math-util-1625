/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phuocson.mathutil.main;

import com.phuocson.mathutil.core.MathUtil;

/**
 *
 * @author PHUOC SON
 */
public class Main {
    public static void main(String[] args) {
        //thử nghiệm hàm tính giai thừa coi chạy đùng như thiết kết hay không
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc không
        //        0 coi tính mấy
        //       20 coi tính mấy
        //       21 coi tính mấy
        //TEST CASE: Một tình huống hàm/app/màn hình/tính năng đc đưa vào sử dụng
        //giả lập hành vi xài cảu ai đó!!!!
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP (HÀM) MÀ NÓ BAO HÀM
        //INPUT: DATA ĐẦU VÀO CỤ THỀ NÀO ĐÓ 
        //OUTPUT ĐUẦ RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO 
        // ĐỂ XỬ LÍ
        //KÌ VỌNG: MÒNG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG KO
        
        long expected = 120; // tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;           // input
        long actual = MathUtil.getFactrial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}

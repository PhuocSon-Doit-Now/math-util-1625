package com.phuocson.mathutil.test.core;


import com.phuocson.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//câu lệnh này là cảu JUnit báo hiệu rằng sẽ cần loop qua tpa65 data để
//lấy cap85 data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    //ta sẽ trả về mảng 2 chiều gồm nhiều cặp Expected|Input
    @Parameterized.Parameters   //JUnit sẽ ngầm chạy loop qua từng dòng
                                // của mảng để lầy ra đc cặp data input/expected 
    //tên hàm ko quan trọng, quan trộng là @
    public static Object[][] initData(){
        return new Integer[][]{
                            {0, 1},
                            {1, 1},
                            {2, 2},
                            {3, 6},
                            {4, 24},
                            {6, 720},
        };
    }
    
    //giả sử loop qua từng dòng cua mảng, ta vẫn cần gán từng value của cột
    //vào biến tương ứng input, expected để lát hồi feed cho hàm 
    
    @Parameterized.Parameter(value = 0) //value = 0 là map với mảng data
    public int n; //biến map vớ value cảu cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public long expeced;    //kiểu long vì giá trị trả về cảu hàm getF()
                            //là long
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
         Assert.assertEquals(expeced, MathUtil.getFactrial(n));
    }
}

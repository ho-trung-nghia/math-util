/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.nghia.mathutil.test.core;

import com.nghia.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MathUtilTest {
    // đây là class sẽ sử dụng các hàm của thư viện/framework JUnit để kiểm tra code chính
    // code chính là hàm tínhGiaiThừa() bên class.core.MathUtil
    // viết code để test code chính bên kia 
    // có nhiều quy tắc đặt tên hàm TESTING 
    // nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử

    @Test
    public void testGetFactorialGivenRightArgumentReturnWell() {
        // so sánh EXPECTED vs ACTUAL
        long expected = 120;
        int n = 5;
        long actual = MathUtil.getFactoria(n);
        Assert.assertEquals(expected, actual);

        Assert.assertEquals(1, MathUtil.getFactoria(1)); // 1! == 1
        Assert.assertEquals(2, MathUtil.getFactoria(2)); // 2! == 4
        Assert.assertEquals(6, MathUtil.getFactoria(3)); // 3! == 6
        Assert.assertEquals(24, MathUtil.getFactoria(4)); // 4! == 24
        Assert.assertEquals(120, MathUtil.getFactoria(5)); // 5! == 120
        Assert.assertEquals(720, MathUtil.getFactoria(6)); // 6! == 720
    }// hàm giúp so sánh 2 giá trị nào đó có giống nhau hay không
    // nếu giống -> màu xanh
    //          ít nhất là cho case đang test
    // nếu không giống -> màu đỏ
    //              hàm ý EXPECTED và ACTUAL không giống nhau

    // Test case:
    // input: -5
    // expected: IllegalArgumentException xuất hiện 
    // tình huống xuất hiện exception là những thứ ko thể đo lường so sánh theo kiểu value
    // mà chỉ có thể đo lường bằng cách chúng có xuất hiện hay không 
    // assertEquals() ko dùng để so sánh 2 ngoại lệ
    //       equals() là bằng nhau hay ko về mặt value
    // 
//    @Test(expected = NumberFormatException.class)
//    public void testGetFatorialGivenWrongArgumentThrowsException(){// không phải là ngoại lệ kì vọng
//        MathUtil.getFactoria(-5); // hàm Test chạy với kì vọng sẽ ném ra exception 
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testGetFatorialGivenWrongArgumentThrowsException() {// không phải là ngoại lệ kì vọng
        MathUtil.getFactoria(-5); // hàm Test chạy với kì vọng sẽ ném ra exception 
    }

    // sử dụng Lambda
    // Test case: hàm sẽ ném ra Exception nếu giá trị nhận vào 21
    @Test(expected = IllegalArgumentException.class)
    public void testGetFatorialGivenWrongArgumentThrowsException_LambdaVersion() {// không phải là ngoại lệ kì vọng
        MathUtil.getFactoria(-5); // hàm Test chạy với kì vọng sẽ ném ra exception 
        //assertThrows() cần 2 tham số: 1.loại Exception muốn bắt 2.đoạn code chạy văng ra Exception
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactoria(-5));
    }

    // Bắt ngoại lệ, xem hàm có ném Exception hay ko khi n ko hợp lệ
    // có ném tức là hàm chạy đúng thiết kế
    @Test()
    public void testGetFatorialGivenWrongArgumentThrowsException_TryCatch() {// không phải là ngoại lệ kì vọng
        try {
            MathUtil.getFactoria(-5);
        } catch (Exception e) {
            // bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát Exception
            // nhưng ko chắc là Exception mình cần có xuất hiện hay ko
            Assert.assertEquals("Invalid argument n must be between 0..20", e.getMessage());
        }
        
    }
}

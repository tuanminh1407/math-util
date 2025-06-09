package com.minh.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

@Test // @test mang ý nghĩa biến hàm ở ưới thành hàm main thì mới chạy lệnh test khi run app
    // test case 1 verify getfractorial with n =0
void testFactorialGivenRightArgument0RunWell() {
    int n=0;
    long expected =1; // hy bọng n= 0 tức là 0! = 1
    long actual = MathUtility.getFactorial(n);
    assertEquals(expected, actual); // so sánh giúp tui xem thực tế có như kỳ vọng ko
    // nếu ko thì ra màu đỏ tick đỏ
    // nếu expectec = actual thì ra tick xanh
}
@Test
void testFactorialGivenRightArgument1RunWell() {
    int n=1;
    long expected =1; // hy bọng n= 1 tức là 1! = 1
    long actual = MathUtility.getFactorial(n);
    assertEquals(expected, actual); // so sánh giúp tui xem thực tế có như kỳ vọng ko
    // nếu ko thì ra màu đỏ tick đỏ
    // nếu expectec = actual thì ra tick xanh
}
@Test
void testFactorialGivenRightArgumentRunWell() {

    assertEquals(2, MathUtility.getFactorial(2));
    assertEquals(6, MathUtility.getFactorial(3));
    assertEquals(24, MathUtility.getFactorial(4));
    assertEquals(120, MathUtility.getFactorial(5));;// so sánh giúp tui xem thực tế có như kỳ vọng ko
    // nếu ko thì ra màu đỏ tick đỏ
    // nếu expectec = actual thì ra tick xanh
}
 //TEST CASE #4: bẮT NGOẠI LỆ
    // VERIFY getFac


    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowsException()
    {
        assertThrows(IllegalArgumentException.class, () -> MathUtility
        .getFactorial(-5));
        //
    }

}
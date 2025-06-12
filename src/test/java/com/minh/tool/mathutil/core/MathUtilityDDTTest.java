package com.minh.tool.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //Tách data ra khỏi hàm text
    //dựng 1 mảng 2 chiều, input, expected
    //sau đó nhồi vào, fill vào các câu lệnh so sánh!!!
    //mảng này sẽ là nguồn dữ liệu để hàm so sánh gọi nhiều lần
    public static Object[][] initTestData() {
        return new Object[][] { {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 7200}
                                };
    }
    @MethodSource("initTestData")
    @ParameterizedTest
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    Bill bill = new Bill();

    @ParameterizedTest
    @CsvSource({
            "20220321161205, 20220321161206, 0.05",
            "20220321161205, 20220321161105, 输入错误",
            "20220321161205, 20220322161205, 143.00",
            "20220321161205, 20230321161205, 输入错误"
    })
    //输入year-month-day-minute-seconds 组成的字符串
    void test(String startTime, String endTime, String results){
        assertEquals(results, bill.getBill(startTime, endTime));
    }
}
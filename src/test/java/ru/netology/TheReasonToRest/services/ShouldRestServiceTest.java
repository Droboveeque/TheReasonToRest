package ru.netology.TheReasonToRest.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ShouldRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void testHowLongWillWeRest(int expected, int income, int expenses, int threshold) {
        ShouldRestService service = new ShouldRestService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class WorkOrRestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/cashForVacation.csv")
    public void testNumberOfVacationManths (int expected, int income, int expense, int threshold) {
        WorkOrRestService service = new WorkOrRestService();
        int actual = service.calcCash(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}

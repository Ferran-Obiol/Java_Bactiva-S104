package org.itacademy.javatesting.junit.n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculoDNITest {

    @ParameterizedTest
    @MethodSource("intAndStringListProvider")
    public void calculaLletra(int num, char lletra) {
        CalculoDNI calculoDNI = new CalculoDNI();
        Assertions.assertEquals(lletra, calculoDNI.calculaLletra(num));
    }

    static Stream<Arguments> intAndStringListProvider() {
        return Stream.of(
                arguments("3453500", 'G'),
                arguments("36247824", 'P'),
                arguments("2840829", 'F'),
                arguments("54621361", 'H'),
                arguments("33015408", 'N'),
                arguments("5425246", 'Y'),
                arguments("91095428", 'H'),
                arguments("45118783", 'M'),
                arguments("31255346", 'W'),
                arguments("85368849", 'W'))
                ;
    }
}
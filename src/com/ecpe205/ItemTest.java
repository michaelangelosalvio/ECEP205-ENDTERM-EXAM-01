package com.ecpe205;
// Argie Donio ---> https://github.com/argied/ECEP205-ENDTERM-EXAM-01
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    private Product product;
    private double quantity, amount;
    Item calc;

    @BeforeAll
    void setup(){
        calc = new Item(product , quantity);
    }

    @ParameterizedTest
    @MethodSource("InputValues")
    void shouldComputeAmount(double price, double quantity) {
        price = product.getPrice();
        quantity = calc.getQuantity();

        short q = (short)quantity;
        assertEquals(price*quantity, calc.setQuantity(q));
    }

    static Stream<Arguments> InputValues () {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,0)
        );
    }

    @ParameterizedTest
    @MethodSource("InputValues1")
    void shouldKnowQuantity(double price, double quantity) {
        price = product.getPrice();
        quantity = calc.getQuantity();

        short q = (short)quantity;
        assertEquals(price*quantity, calc.getQuantity());
    }

    static Stream<Arguments> InputValues1 () {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,0)
        );
    }

    @ParameterizedTest
    @MethodSource("InputValues2")
    void shouldGetAmount(double price, double quantity) {
        price = product.getPrice();
        quantity = calc.getQuantity();

        short q = (short)quantity;
        assertEquals(price*quantity, calc.getAmount());
    }

    static Stream<Arguments> InputValues2 () {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,0)
        );
    }




}
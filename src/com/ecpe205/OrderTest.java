package com.ecpe205;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class OrderTest {
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    void Order{
        Product product = new Product();

        assertEquals();
    }
}

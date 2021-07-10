package com.srjons.mockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoTest {

    @Test
    public void mockitoTest() {
        // mock creation
        List mockedList = Mockito.spy(ArrayList.class);

        // using mock object - it does not throw any "unexpected interaction" exception
        mockedList.add("one");

        Assertions.assertEquals((mockedList).get(0), "one");
    }
}

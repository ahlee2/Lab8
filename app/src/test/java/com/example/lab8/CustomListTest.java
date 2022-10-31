package com.example.lab8;


import static org.junit.jupiter.api.Assertions.*;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testhasCity() {
        CustomList mockList = MockCityList();
        City city = new City("Charlottetown", "Prince Edward Island");
        mockList.addCity(city);
        assertTrue(mockList.hasCity(city));
        assertFalse(mockList.hasCity(new City("Test","test")));
    }
}

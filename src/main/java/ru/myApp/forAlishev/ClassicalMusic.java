package ru.myApp.forAlishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private List<String> classicalList = new ArrayList<>();
    {
        classicalList.add("Hungarian Rhapsody");
        classicalList.add("Symphony no. 5 in C Minor, op. 67");
        classicalList.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSong() {
        return classicalList;
    }
}

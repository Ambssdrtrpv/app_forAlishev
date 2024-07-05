package ru.myApp.forAlishev;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockList = new ArrayList<>();
    {
        rockList.add("Wind cries Mary");
        rockList.add("Paint it black");
        rockList.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSong() {
        return rockList;
    }
}

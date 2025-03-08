package model;

import org.springframework.stereotype.Component;

@Component

public class KiaEngine implements Engine {
    public void start() {
        System.out.println("Kia引擎發動");
    }
}

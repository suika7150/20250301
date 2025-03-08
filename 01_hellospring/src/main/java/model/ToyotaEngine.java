package model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ToyotaEngine implements Engine {
    public void start() {
        System.out.println("Toyota引擎發動");
    }
}

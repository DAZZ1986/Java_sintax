package main;

import main.ImplExample.Door;

public class SmallIronDoor extends Door {

    //protected тест
    public void accessProtectedMethod() {
        protectionMethodDoor();         // Вызываем protected метод напрямую через this
    }

}

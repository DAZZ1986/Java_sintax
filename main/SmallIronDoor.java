package main;

import main.ImplExample.Door;

public class SmallIronDoor extends Door {

    //protected ����
    public void accessProtectedMethod() {
        protectionMethodDoor();         // �������� protected ����� �������� ����� this
    }

}

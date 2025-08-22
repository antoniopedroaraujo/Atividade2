package app;

import manager.SingletonManager;

public class Main {
    public static void main(String[] args) {
        SingletonManager singletonManager = SingletonManager.getInstancia();
        singletonManager.run();

    }
}

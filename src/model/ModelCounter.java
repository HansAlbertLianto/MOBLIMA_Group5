package model;

public class ModelCounter {
    private static ModelCounter ourInstance = new ModelCounter();

    public static ModelCounter getInstance() {
        return ourInstance;
    }

    private ModelCounter() {
    }
}

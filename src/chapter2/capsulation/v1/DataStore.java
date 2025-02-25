package chapter2.capsulation.v1;

public class DataStore {

    private String store;

    public void setStore(String store) {
        if (store.equals("B")) {
            System.out.println("B는 안됩니다.");
        } else {
            this.store = store;
        }

    }
}

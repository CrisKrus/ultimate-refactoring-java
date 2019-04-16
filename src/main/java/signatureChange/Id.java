package signatureChange;

public class Id {
    private int value;

    public Id(int value) {
        this.value = value;
    }

    public boolean is(Id key) {
        return this.value == key.value;
    }
}

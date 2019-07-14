package poe.creator.constants;

public enum ItemBase {

    HELMET("helmet"),
    GLOVES("gloves");

    private final String code;

    ItemBase(String code) {
        this.code = code;
    }

    public boolean equals(String code) {
        return getCode().equals(code);
    }

    public String getCode() {
        return this.code;
    }
}

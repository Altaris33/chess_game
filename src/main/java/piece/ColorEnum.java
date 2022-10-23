package piece;

public enum ColorEnum {

    WHITE("White"),
    BLACK("Black");

    private final String value;

    ColorEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

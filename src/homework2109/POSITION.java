package homework2109;

public enum POSITION {
    DIRECTOR(3),
    Worker(2);
    private int coefficient;

    POSITION(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }
}

package core.basesyntax;

public class Ball {

    private final int number;
    private final BallColor color;

    public Ball(BallColor color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{"
                + "number=" + number
                + ", color=" + color.name()
                + "}";
    }
}

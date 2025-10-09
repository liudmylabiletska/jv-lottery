package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public BallColor getRandomColor() {
        BallColor[] colors = BallColor.values();
        int randomIndex = random.nextInt(colors.length);

        return colors[randomIndex];
    }
}

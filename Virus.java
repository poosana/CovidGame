package coma.game.models.contents;

import coma.game.Resources;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Melee unit class.
 */
final public class Virus extends Unit {
    private Virus(int unitNumber) {
        super(Resources.smlVirusList[unitNumber - 1].clone(), 1, 1);
    }

    public static Virus createRandom() {
        int rand = ThreadLocalRandom.current().nextInt(1, 3 + 1);

        return new Virus(rand);
    }

    public static Virus createUnit1() {
        return new Virus(1);
    }

    public static Virus createUnit2() {
        return new Virus(2);
    }

    public static Virus createUnit3() {
        return new Virus(3);
    }
}

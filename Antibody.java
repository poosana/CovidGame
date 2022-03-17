package coma.game.models.contents;

import com.badlogic.gdx.audio.Sound;
import coma.game.Resources;

/**
 * Melee unit class.
 */
final public class Antibody extends Unit {
    public final int cost;

    private Antibody(int unitNumber, int cost) {
        super(Resources.smlAntibodyList[unitNumber - 1].clone(), 1, 1);

        this.cost = cost;
    }

    public static Antibody createUnit1() {
        return new Antibody(1, 5);
    }

    public static Antibody createUnit2() {
        return new Antibody(2, 10);
    }

    public static Antibody createUnit3() {
        return new Antibody(3, 15);
    }
}

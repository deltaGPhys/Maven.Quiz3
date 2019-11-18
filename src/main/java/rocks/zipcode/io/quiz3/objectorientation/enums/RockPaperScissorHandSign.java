package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK(0), PAPER(1), SCISSOR(2);

    private final int rank;

    RockPaperScissorHandSign(int rank) {
        this.rank = rank;
    }
    public RockPaperScissorHandSign getWinner() {
        for (RockPaperScissorHandSign sign : RockPaperScissorHandSign.values()) {
            if ((3 + sign.rank - this.rank)%3 == 1) {
                return sign;
            }
        }
        return null;
    }

    public RockPaperScissorHandSign getLoser() {
        for (RockPaperScissorHandSign sign : RockPaperScissorHandSign.values()) {
            if ((3 - sign.rank + this.rank)%3 == 1) {
                return sign;
            }
        }
        return null;
    }
}

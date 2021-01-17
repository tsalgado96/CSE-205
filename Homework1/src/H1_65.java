/**
 * CLASS: H1_65 (H1_65.java)
 * GROUP Y
 * AUTHOR 1: Teodoro Salgado, tjsalgad, tsalgado96@gmail.com
 * AUTHOR 2: Isaac Pena, ipena5, ippenaisaac@gmail.com
 * AUTHOR 3: Stephen Elledge, saelledg, saelledg@asu.edu
 */

public class H1_65 {
    // (1) a private int instance variable named mX
    private int mX;

    // (2) a private int class variable named mY initialized to 0
    private static int mY = 0;

    // (3) a private int class constant named A which is equivalent to 100
    private static final int A = 100;

    // (4) a public int class constant named B which is equivalent to 200
    public static final int B = 200;

    // (5) public accessor and mutator methods for mX named getX() and setX()
    public int getX() {
        return this.mX;
    }

    public void setX(int x) {
        this.mX = x;
    }

    // (6) public accessor and mutator methods for mY named getY() and setY()
    public int getY() {
        return mY;
    }

    public void setY(int y) {
        mY = y;
    }

    // (7) a public constructor that has one int input parameter named pX which calls setX() to initialize mX to pX
    public H1_65(int pX) {
        setX(pX);
    }

    // (8) a public default constructor that calls H1_65(int) to initialize mX to -1
    public H1_65() {
        this(-1);
    }
}

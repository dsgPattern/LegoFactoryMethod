package lego.bricks;

public class ClassicLegoCreator extends LegoBrickFactory {
    @Override
    public LegoBrick makeBrick(int width, int length) {
        var classic = new ClassicLegoBrick(width, length);
        System.out.println("Built Classic with size of " + classic.getLength() +"x" + classic.getWidth());
        return classic;
    }
}

package lego.bricks;

public class DuploLegoCreator extends LegoBrickFactory {
    @Override
    public LegoBrick makeBrick(int width, int length) {
        var duplo = new DuploLegoBrick(width, length);
        System.out.println("Built Duplo with size of " + duplo.getLength() +"x" + duplo.getWidth());
        return duplo;

    }
}

package lego.bricks;

public abstract class LegoBrick {
    private int _noOfColumns;
    private int _noOfRows;
    private int _scalling;

    protected LegoBrick(int noOfColumns, int noOfRows, int scalling)
    {
        _noOfColumns = noOfColumns;
        _noOfRows = noOfRows;
        _scalling = scalling;
    }

    public int getWidth()
    {
        return _noOfRows * _scalling;
    }

    public int getLength()
    {
        return _noOfColumns * _scalling;
    }
}

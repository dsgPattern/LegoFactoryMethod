package org.example;

import lego.bricks.ClassicLegoBrick;
import lego.bricks.ClassicLegoCreator;
import lego.bricks.DuploLegoCreator;
import lego.bricks.LegoBrick;

public class LegoFactory {
    public static LegoBrick makeMeABrick(int noOfCols, int noOfRows, String brickType)
    {
        switch (brickType)
        {
            case "Classic":
                return new ClassicLegoCreator().makeBrick(noOfCols, noOfRows);
            case "Duplo":
                return new DuploLegoCreator().makeBrick(noOfCols, noOfRows);
            default:
                return null;
        }
    }
}

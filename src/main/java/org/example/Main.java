package org.example;

import lego.bricks.*;

public class Main {
    public static void main(String[] args)
    {
        // you can build a block by using the LegoFactory
        LegoBrick brick = LegoFactory.makeMeABrick(10,13, "Classic");

        //you can also build a block by using factories from lego.bricks package
        LegoBrickFactory brickFactory = new DuploLegoCreator();
        brickFactory.makeBrick(10, 13);

        //but you are not allowed to create Classic or Duplo bricks directly, because their constructors are not accessible from outside
        ClassicLegoBrick classicBrick = new ClassicLegoBrick(1,1);
    }
}
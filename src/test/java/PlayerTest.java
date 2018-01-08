//package test;
import java.*;
import org.junit.*;
import java.util.ArrayList;

import static org.junit.Assert.fail;

public class PlayerTest {
    Huluwa hu;
    Field field;
    private final int OFFSET = 200;
    private final int SPACE = 60;
    public PlayerTest()
    {
        field=new Field(OFFSET,SPACE);
        hu = new Huluwa(0,0,field,1);
    }
    @BeforeClass
    public static void classBefore()
    {
        System.out.println("Test Begin------");
    }
    @AfterClass
    public static void classAfter()
    {
        System.out.println("Test End-------");
    }
    
    public void testPosition()
    {
        if(hu.x()<0||hu.x()+60>field.getBoardWidth()||hu.y()<0||hu.y()+60>field.getBoardHeight())
            fail("Position out bounder.");
        ArrayList world = new ArrayList();

        world.addAll(field.getHuluwaTeam());
        world.addAll(field.getSnakeTeam());
        for (int i = 0; i < world.size(); i++) {

            Creature item = (Creature) world.get(i);
            if (hu.samePlace(item)) {
                fail("Two Players stand in the same Place.");
            }
        }
    }
    @Test
    public void testMove()
    {
        hu.moveto(0,0);
        for(int i=0;i<10;i++) {
            hu.move(Creature.Direction.UP);
            testPosition();
        }
        hu.moveto(0,0);
        for(int i=0;i<10;i++) {
            hu.move(Creature.Direction.DOWN);
            testPosition();;
        }
        hu.moveto(0,0);
        for(int i=0;i<10;i++) {
            hu.move(Creature.Direction.LEFT);
            testPosition();
        }
        hu.moveto(0,0);
        for(int i=0;i<10;i++) {
            hu.move(Creature.Direction.RIGHT);
            testPosition();
        }
        System.out.println("Test Move Pass");
    }
}

package chapter10._1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    protected void planTest(){

        Room room = new Room();
        HeatingPlan heatingPlan = new HeatingPlan();
        boolean result = room.withinPlan(heatingPlan);

        assertTrue(result);

    }

}
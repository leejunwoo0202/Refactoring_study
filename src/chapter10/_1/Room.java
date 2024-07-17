package chapter10._1;

public class Room {

    boolean withinPlan(HeatingPlan plan){

        return plan.withinRange(daysTempRange());
    }

    protected TempRange daysTempRange(){
        return new TempRange();

    }


}

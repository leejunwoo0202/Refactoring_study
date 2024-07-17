package chapter10._1;

public class HeatingPlan {

    boolean withinRange(TempRange tempRange){
        return (tempRange.getLow() >= _range.getLow() && tempRange.getHigh() <= _range.getHigh());
    }

    private TempRange _range = new TempRange();

}

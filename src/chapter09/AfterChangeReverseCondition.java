package chapter09;

public class AfterChangeReverseCondition {

    protected double getAdjustedCapital(){

        double result = 0.0;

        double _capital = 5;
        double _rate = 10;
        double _duration = 15;
        double _income = 20000;

        /* 조건문안에 조건문이 있어서 복잡하고 _capital > 0.0 조건문을 뒤집으면 함수를 실행하지 않고
            바로 나갈 수 있어서 변경하는게 좋음.
        */

        if(_capital <= 0.0) return 0.0;
        if(_rate <= 0.0 || _duration <= 0.0) return 0.0;
        result = (_income / _duration);

        return result;
    }
}

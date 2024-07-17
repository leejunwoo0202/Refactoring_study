package chapter09;

public class BeforePolymorphism {

    Type _type = Type.EUROPEAN;

    double _numberOfCoconuts = 10;

    // 못을 박았는가?
    boolean _isNailed = true;

    // 볼트의 개수
    double _voltage = 10;

    double getSpeed(){
        switch(_type){
            case EUROPEAN:
                return getBaseSpeed();
            case AFRICAN:
                return getBaseSpeed() - getLoadFactor() * _numberOfCoconuts;
            case NORWEGIAN_BLUE:
                return (_isNailed) ? 0 : getBaseSpeed(_voltage);
        }

        return 0;
    }

    private double getLoadFactor() {
        return 10;
    }

    private double getBaseSpeed() {

        return 5;
    }

    private double getBaseSpeed(double _voltage) {

        return 5 * _voltage;
    }


}

package chapter09;

public class AfterNestedCondition {

    double result;

    boolean _isDead = false;
    boolean _isSeparated = false;
    boolean _isRetired = false;

    double getPayment() {

        if(_isDead) return deadAmount();
        if(_isSeparated) return separatedAmount();
        if(_isRetired) return retiredAmount();
        return normalPayAmount();

    }

    double deadAmount(){
        return 200;
    }

    double separatedAmount(){
        return 150;
    }

    double retiredAmount(){
        return 130;
    }

    double normalPayAmount(){
        return 100;
    }
}

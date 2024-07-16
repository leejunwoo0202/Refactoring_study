package chapter09;

public class BeforeChange {

    double result;

    boolean _isDead = false;
    boolean _isSeparated = false;
    boolean _isRetired = false;

    double getPayment() {

        if (_isDead) result = deadAmount();
        else {
            if (_isSeparated) result = separatedAmount();
            else {
                if (_isRetired) result = retiredAmount();
                else result = normalPayAmount();
            }
            ;
        }
        return result;

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

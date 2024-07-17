package chapter09;

public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    Employee create(int type){
        switch(type){
            case(ENGINEER): return createEngineer();
            case(SALESMAN): return createSalesman();
            case(MANAGER): return createManager();
        }

        return null;
    }

    protected ENGINEER createEngineer()
    {
        return new ENGINEER();
    }

    protected SALESMAN createSalesman()
    {
        return new SALESMAN();
    }

    protected MANAGER createManager()
    {
        return new MANAGER();
    }


}

package exception.overriding;

public abstract class AClass {
    protected abstract void print() throws ArrayIndexOutOfBoundsException;
}

class BClass extends AClass{
    public void print() {

    }
}

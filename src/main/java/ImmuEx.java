import com.SecuredType;

public class ImmuEx extends Immutable{
    private int realValue;

    public ImmuEx(int value) {
        super(value);

        realValue = value;
    }

    public int getValue1() {
        return realValue;
    }
    public void setValue(int newValue) {
        realValue = newValue;
    }

    public static void main(String[] arg){
        ImmuEx obj = new ImmuEx(4);
        Immutable immObj = (Immutable)obj;
        System.out.println(immObj.getValue());
        obj.setValue(8);
        System.out.println(obj.getValue());
    }
}

@SecuredType
class Immutable {
    private final int value;

    public Immutable(int value) {
        this.value = ++value;
    }

    final public int getValue() {
        return value;
    }
}

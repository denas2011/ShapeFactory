package lt.kaunascoding.factory;

public class Square implements Shape{
    private float length;
    public Square(float parLength) {
        length = parLength;
    }

    @Override
    public float drow() {
        float result = (length*length);
        System.out.println("Square: "+result);
        return result;
    }
}

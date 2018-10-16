package lt.kaunascoding.factory;

public class Circle implements Shape {

    private float radius;

    public Circle(float parR) {
        radius = parR;
    }

    @Override
    public float drow() {
        float result = (3.14f * radius * radius);
        System.out.println("Circle: " + result);
        return result;
    }
}

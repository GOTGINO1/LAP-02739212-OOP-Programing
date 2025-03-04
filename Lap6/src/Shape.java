public abstract class Shape {
    private final String type;
    public Shape(String type) {
        this.type = type;

    }
    public abstract void draw();

    public abstract double area();

    public String getType() {

        return type;

    }

}


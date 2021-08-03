package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        //super(color);
        setColor(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
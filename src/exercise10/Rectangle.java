package exercise10;

public class Rectangle extends Figure {
    public Rectangle() {
        super(new Point(0, 0), 1, 1);
    }

    public Rectangle(Point startPoint, double height, double width) {
        super(startPoint, height, width);
    }

    public Rectangle(Rectangle otherRectangle) {
        super(otherRectangle.startPoint, otherRectangle.side1, otherRectangle.side2);
    }

    @Override
    public double calculatePerimeter() {
        return side1 * 2 + side2 * 2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public String getType() {
        return (side1 == side2) ? "Square" : "Rectangle";
    }

    @Override
    public boolean equal(Figure otherFigure) {
        if (otherFigure instanceof Rectangle) {
            return super.equal(otherFigure);
        } else {
            return false;
        }
    }

    @Override
    public boolean containsClick(Point click) {
        // Check if click point is inside the rectangle
        boolean flag1, flag2;

        double tmpX = click.getX();
        double tmpY = click.getY();

        flag1 = (tmpX > this.startPoint.getX()) && (tmpX < (this.startPoint.getX() + this.side1));
        flag2 = (tmpY > this.startPoint.getY()) && (tmpY < (this.startPoint.getY() + this.side2));

        return flag1 && flag2;
    }
}

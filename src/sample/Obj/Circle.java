package sample.Obj;

import javafx.scene.canvas.Canvas;
import sample.Point;

public class Circle extends Figure{

    @Override
    public void Draw(Canvas canvas) {
        swap();
        canvas.getGraphicsContext2D().strokeOval(fist.x,fist.y,Math.abs(fist.x-second.x),Math.abs(second.y-fist.y));
    }

    @Override
    public Figure factor() {
        return new Circle();
    }



}

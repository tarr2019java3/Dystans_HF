import com.fasterxml.jackson.databind.ObjectMapper;

import java.awt.*;
import java.io.File;
import java.io.IOException;




public class Point {
    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;


    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
    public void distance (Point point){

        System.out.println(Math.sqrt((Math.pow((x - point.getX()), 2)
                + Math.pow((y - point.getY()), 2))));

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File("distance.json"), point );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


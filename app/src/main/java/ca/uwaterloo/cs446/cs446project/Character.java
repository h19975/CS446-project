package ca.uwaterloo.cs446.cs446project;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by ethan on 2018-05-15.
 */

public class Character {
    private Context context;

    // Boundbox for physical collision
    public int top=100;
    public int left=100;
    public int width;
    public int height;

    public int state=1;
    // 0: idle
    // 1: run

    // drawable

    public Character(Context context, int width, int height){
        this.context=context;
        this.width=width;
        this.height=height;
    }

    public Character CharacterFactory(){

        return null;
    }


    public void draw(Canvas canvas){
    }
}

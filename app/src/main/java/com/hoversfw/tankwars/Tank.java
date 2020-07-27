package com.hoversfw.tankwars;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
public class Tank{
    public int x;
    public int y;
    public int face=1;

    public Tank(int xPos, int yPos){
        x=xPos;
        y=yPos;
    }

    public int getFace() {
        return face;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    //Give the ID of block the tank is on, based on xy coordinate
    public <T extends View> T locate(Activity ctx,int x,int y) {
        if (y == 1) {
            if (x == 1) {
                return ctx.findViewById(R.id.first1);
            }
            if (x == 2) {
                return ctx.findViewById(R.id.first2);
            }
            if(x==3){
                return ctx.findViewById(R.id.first3);
            }
            if(x==4){
                return ctx.findViewById(R.id.first4);
            }
            if(x==5){
                return ctx.findViewById(R.id.first5);
            }
            if(x==6){
                return ctx.findViewById(R.id.first6);
            }
        }
        if(y==2){
            if(x==1){
                return ctx.findViewById(R.id.second1);
            }
            if(x==2){
                return ctx.findViewById(R.id.second2);
            }
            if(x==3){
                return ctx.findViewById(R.id.second3);
            }
            if(x==4){
                return ctx.findViewById(R.id.second4);
            }
            if(x==5){
                return ctx.findViewById(R.id.second5);
            }
            if(x==6){
                return ctx.findViewById(R.id.second6);
            }
        }
        if(y==3){
            if(x==1){
                return ctx.findViewById(R.id.third1);
            }
            if(x==2){
                return ctx.findViewById(R.id.third2);
            }
            if(x==3){
                return ctx.findViewById(R.id.third3);
            }
            if(x==4){
                return ctx.findViewById(R.id.third4);
            }
            if(x==5){
                return ctx.findViewById(R.id.third5);
            }
            if(x==6){
                return ctx.findViewById(R.id.third6);
            }
        }
        if(y==4){
            if(x==1){
                return ctx.findViewById(R.id.fourth1);
            }
            if(x==2){
                return ctx.findViewById(R.id.fourth2);
            }
            if(x==3){
                return ctx.findViewById(R.id.fourth3);
            }
            if(x==4){
                return ctx.findViewById(R.id.fourth4);
            }
            if(x==5){
                return ctx.findViewById(R.id.fourth5);
            }
            if(x==6){
                return ctx.findViewById(R.id.fourth6);
            }
        }
        if(y==5){
            if(x==1){
                return ctx.findViewById(R.id.fifth1);
            }
            if(x==2){
                return ctx.findViewById(R.id.fifth2);
            }
            if(x==3){
                return ctx.findViewById(R.id.fifth3);
            }
            if(x==4){
                return ctx.findViewById(R.id.fifth4);
            }
            if(x==5){
                return ctx.findViewById(R.id.fifth5);
            }
            if(x==6){
                return ctx.findViewById(R.id.fifth6);
            }
        }
        if(y==6){
            if(x==1){
                return ctx.findViewById(R.id.sixth1);
            }
            if(x==2){
                return ctx.findViewById(R.id.sixth2);
            }
            if(x==3){
                return ctx.findViewById(R.id.sixth3);
            }
            if(x==4){
                return ctx.findViewById(R.id.sixth4);
            }
            if(x==5){
                return ctx.findViewById(R.id.sixth5);
            }
            if(x==6){
                return ctx.findViewById(R.id.sixth6);
            }
        }
        return null;
    }

    public void move(int xm,int ym){
        x=x+xm;
        y=y+ym;
    }
}

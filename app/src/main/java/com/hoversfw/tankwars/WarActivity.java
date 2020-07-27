package com.hoversfw.tankwars;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war);

        //Create bricks

        final int[] a={3,1};
        final int[] b={4,1};
        final int[] c={5,1};
        final int[] d={6,1};
        final int[] e={1,2};
        final int[] f={3,2};
        final int[] g={1,3};
        final int[] h={3,3};
        final int[] i={4,3};
        final int[] j={5,3};
        final int[] k={6,3};
        final int[] l={1,4};
        final int[] m={3,4};
        final int[] n={5,4};
        final int[] o={3,5};
        final int[] p={4,5};
        final int[] q={5,5};
        final int[] brickX={3,4,5,6,1,3,1,3,4,5,6,1,3,5,3,4,5};
        final int[] brickY={1,1,1,1,2,2,3,3,3,3,3,4,4,4,5,5,5};
        //No need to draw bricks because layout file already did it

        //Create the tank
        final Tank player=new Tank(2,6);
        //Draw the tank
        player.locate(WarActivity.this,2,6).setBackgroundResource(R.drawable.tank);

        //initialize buttons that control the tank
        Button up=(Button)findViewById(R.id.up);
        Button down=(Button)findViewById(R.id.down);
        Button left=(Button)findViewById(R.id.left);
        Button right=(Button)findViewById(R.id.moveright);
        Button fire=(Button)findViewById(R.id.fire);
        //If clicked "Up" button
        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Can it move?
                boolean can=false;
                //Check if it will hit brick
                for(int yy=0;yy<17;yy++) {
                    //If it won't hit
                    if(player.y-1!=0/*Continue work on this*/){
                        can=true;
                    }
                }
                if(can==true){
                    //Make tank current location a star
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.star);
                    //Move tank
                    player.move(0,-1);
                    //Draw tank's location after moving
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.tank);
                    //Make tank face upward
                    player.face=1;
                }
                if(can==false){
                    MediaPlayer mediaPlayer= MediaPlayer.create(WarActivity.this,R.raw.quack);
                    mediaPlayer.start();
                }
            }
        });
        //If clicked "Right" button
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean can=false;
                for(int yy=0;yy<17;yy++) {
                    if (player.x+1!=7&&player.x+1!=brickX[yy]&&player.y!=brickY[yy]){
                        can=true;
                    }
                }
                if(can==true){
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.star);
                    player.move(+1,0);
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.tankright);
                    player.face=2;
                }
                if(can==false){
                    MediaPlayer mediaPlayer= MediaPlayer.create(WarActivity.this,R.raw.quack);
                    mediaPlayer.start();
                }
            }
        });
        //If clicked "Down" button
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean can=false;
                for(int yy=0;yy<17;yy++) {
                    if (player.y+1!=0 && player.y+1!=brickY[yy] && player.x!=brickX[yy]){
                        can=true;
                    }
                }
                if(can==true){
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.star);
                    player.move(0,+1);
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.tankdown);
                    player.face=3;
                }
                if(can==false){
                    MediaPlayer mediaPlayer= MediaPlayer.create(WarActivity.this,R.raw.quack);
                    mediaPlayer.start();
                }
            }
        });
        //If clicked "Left" button
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean can=false;
                for(int yy=0;yy<17;yy++) {
                    if (player.x-1!=0&&player.x-1!=brickX[yy]&&player.y!=brickY[yy]){
                        can=true;
                    }
                }
                if(can==true){
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.star);
                    player.move(-1,0);
                    player.locate(WarActivity.this,player.x,player.y).setBackgroundResource(R.drawable.tankleft);
                    player.face=4;
                }
                if(can==false){
                    MediaPlayer mediaPlayer= MediaPlayer.create(WarActivity.this,R.raw.quack);
                    mediaPlayer.start();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
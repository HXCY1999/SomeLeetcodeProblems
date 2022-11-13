package com.imcoa;

import org.junit.Test;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;


public class FindRoot {
    private  int x1=4,y1 = 3,x2=6,y2=4,c=1;
    @Test
    public void t(){
        System.out.println(canReach(x1,y1,x2,y2,c));
    }
    public String canReach(int x1,int y1,int x2,int y2,int c) {
        if (x1>x2 || y1>y2 || isSquare(x1,y1) || isSquare(x2,y2)){
            return "no";
        }
        if (findTarget(x1,y1 )){
            return "yes";
        }else {
            return "no";
        }
    }
    public  boolean isSquare(int x,int y){
        double sqrt = Math.sqrt(x + y);
        return sqrt % 1 == 0;
    }
    public  boolean findTarget(int x,int y){
        if (x == x2 && y == y2) return true;
        //obstacle
        if (isSquare(x,y)) return false;
        //boundary
        if (x>x2) return false;
        if (y>y2) return false;
        return findTarget(x+y, y)||findTarget(x,y+x)||findTarget(x+c,y+c);
    }
}

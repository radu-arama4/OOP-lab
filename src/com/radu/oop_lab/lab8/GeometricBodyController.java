package com.radu.oop_lab.lab8;

import java.util.ArrayList;

public class GeometricBodyController {
    public static GeometricBody maxVolume(ArrayList<GeometricBody> geometricBodies){
        float maxV = 0;
        GeometricBody maxBody = null;
        for(GeometricBody body:geometricBodies){
            if(body.getVolume()>maxV){
                maxV=body.getVolume();
                maxBody = body;
            }
        }
        return maxBody;
    }

    public static GeometricBody maxSurface(ArrayList<GeometricBody> geometricBodies){
        float maxS = 0;
        GeometricBody maxBody = null;
        for(GeometricBody body:geometricBodies){
            if(body.getSurface()>maxS){
                maxS=body.getVolume();
                maxBody = body;
            }
        }
        return maxBody;
    }
}

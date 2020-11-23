package com.radu.oop_lab.lab8;

import com.radu.oop_lab.lab8.GeometricBodyImpl.Cube;
import com.radu.oop_lab.lab8.GeometricBodyImpl.Parallelepiped;
import com.radu.oop_lab.lab8.GeometricBodyImpl.Sphere;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        GeometricBody cube = new Cube(4, 5);
        GeometricBody sphere = new Sphere(5, 7);
        GeometricBody parallelepiped = new Parallelepiped(6, 8);

        ArrayList<GeometricBody> bodies = new ArrayList<>();
        bodies.add(cube);
        bodies.add(sphere);
        bodies.add(parallelepiped);

        System.out.println("Maximum surface - " + GeometricBodyController.maxSurface(bodies).getSurface());
        System.out.println("Maximum volume - " + GeometricBodyController.maxVolume(bodies).getVolume());

    }
}

package com.camoleo.zad9;

import com.camoleo.zad10.Movable;
import com.camoleo.zad10.MoveDirection;

public class Point2D implements Movable {
        private double x;
        private double y;

        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public Point2D() {
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

    @Override
    public void move(MoveDirection moveDirection) {
        setX(moveDirection.getX() + getX()); setY(moveDirection.getY() + getY());
    }
}

package ji;

public class PASET7 {
    public static class Line {
        private int a, b, c;

        public Line(int a, int b, int c) {
            this.a = a; this.b = b; this.c = c;
        }

        public double getSlope() {
            return -1*a/(double)b;
        }

        public boolean isOnLine(int x, int y) {
            return (a*x + b*y + c == 0);
        }
    }

    public static class Vector2 {
        public double r,theta;

        public Vector2(double r, double theta) {
            this.r = r; this.theta = theta;
        }    
        
        public double getX() {
            return r * Math.cos(theta);
        }

        public double getY() {
            return r * Math.sin(theta);
        }

        public static Vector2 setFromCartesian(double x, double y) {
            double r = Math.sqrt(x * x + y * y);
            double theta = Math.atan2(y, x);
            return new Vector2(r, theta);
        }

        public Vector2 add(Vector2 other) {
            return Vector2.setFromCartesian(getX() + other.getX(), getY() + other.getY());
        }

        public Vector2 subtract(Vector2 other) {
            return Vector2.setFromCartesian(getX() - other.getX(), getY() - other.getY());
        }

        public Vector2 scalarMultiply(double scalar) {
            return new Vector2(r * scalar, theta);
        }
    }
}
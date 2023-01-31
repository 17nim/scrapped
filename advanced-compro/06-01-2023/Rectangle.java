class Rectangle {
    double width, height;

    void doubleWidthHeight() {
        width = width * 2;
        height = height * 2;
    }

    public static void main(String[] args) {
        Rectangle quadrate = new Rectangle();
        quadrate.width = 5.0;
        quadrate.height = 8.0;
        System.out.println("Rectangle width = " + quadrate.width + " height = " + quadrate.height);

        quadrate.doubleWidthHeight();
        System.out.println("After calling method doubleWidthHeight()");
        System.out.println("Rectangle width = " + quadrate.width + " height = " + quadrate.height);
    }
}

package Bai2_7;

public class Main {
    public static void main(String[] args) {

        // Test 1: Constructor MyLine(int x1, int y1, int x2, int y2)
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println("Test 1 - Constructor (coordinates):");
        System.out.println(line1);

        // Test 2: Constructor MyLine(MyPoint begin, MyPoint end)
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("\nTest 2 - Constructor (MyPoint):");
        System.out.println(line2);

        // Test 3: getBegin() and getEnd()
        System.out.println("\nTest 3 - getBegin() and getEnd():");
        System.out.println("Begin: " + line1.getBegin());
        System.out.println("End: " + line1.getEnd());

        // Test 4: setBegin() and setEnd()
        System.out.println("\nTest 4 - setBegin() and setEnd():");
        line1.setBegin(new MyPoint(2, 3));
        line1.setEnd(new MyPoint(5, 7));
        System.out.println(line1);

        // Test 5: getBeginX(), setBeginX()
        System.out.println("\nTest 5 - Begin X:");
        System.out.println("Before: " + line1.getBeginX());
        line1.setBeginX(10);
        System.out.println("After: " + line1.getBeginX());

        // Test 6: getBeginY(), setBeginY()
        System.out.println("\nTest 6 - Begin Y:");
        System.out.println("Before: " + line1.getBeginY());
        line1.setBeginY(20);
        System.out.println("After: " + line1.getBeginY());

        // Test 7: getEndX(), setEndX()
        System.out.println("\nTest 7 - End X:");
        System.out.println("Before: " + line1.getEndX());
        line1.setEndX(30);
        System.out.println("After: " + line1.getEndX());

        // Test 8: getEndY(), setEndY()
        System.out.println("\nTest 8 - End Y:");
        System.out.println("Before: " + line1.getEndY());
        line1.setEndY(40);
        System.out.println("After: " + line1.getEndY());

        // Test 9: getBeginXY() and setBeginXY()
        System.out.println("\nTest 9 - Begin XY:");
        System.out.println("Before: " +
                java.util.Arrays.toString(line1.getBeginXY()));
        line1.setBeginXY(1, 2);
        System.out.println("After: " +
                java.util.Arrays.toString(line1.getBeginXY()));

        // Test 10: getEndXY() and setEndXY()
        System.out.println("\nTest 10 - End XY:");
        System.out.println("Before: " +
                java.util.Arrays.toString(line1.getEndXY()));
        line1.setEndXY(8, 9);
        System.out.println("After: " +
                java.util.Arrays.toString(line1.getEndXY()));

        // Test 11: getLength()
        System.out.println("\nTest 11 - getLength():");
        MyLine line3 = new MyLine(0, 0, 3, 4);
        System.out.println("Expected: 5.0");
        System.out.println("Actual: " + line3.getLength());

        // Test 12: getGradient()
        System.out.println("\nTest 12 - getGradient():");
        MyLine line4 = new MyLine(0, 0, 1, 1);
        System.out.println("Expected: " + Math.PI / 4);
        System.out.println("Actual: " + line4.getGradient());

        // Test 13: toString()
        System.out.println("\nTest 13 - toString():");
        System.out.println(line3.toString());
    }
}

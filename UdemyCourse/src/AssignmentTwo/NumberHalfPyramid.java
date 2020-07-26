package AssignmentTwo;

public class NumberHalfPyramid {

	public static void main(String[] args) {
        int x = 5;

        for(int i = 1; i <= x; i++) {
            for(int y = 1; y <= i; y++) {
                System.out.print(y + "");
            }
            System.out.println();
        }
    }
}
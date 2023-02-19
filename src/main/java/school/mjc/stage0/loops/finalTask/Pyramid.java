package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int cathetusWidth = cathetusLength * 2;
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < cathetusWidth - 1; j++) {
                if (j < cathetusLength) {
                    System.out.print(j < cathetusLength - i - 1 ? " " : cathetusLength - j);
                } else {
                    System.out.print(j > (cathetusLength + i - 1) ? "" : cathetusWidth / cathetusLength + j - cathetusLength);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

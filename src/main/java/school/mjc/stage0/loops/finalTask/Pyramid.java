package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int counter = 1;
        int start = 0;
        int spaces = cathetusLength;
        for (int i = 1; i<=cathetusLength; i++){
            start = i;
            for (int j = 1; j < spaces; j ++){
                System.out.print(" ");
            }
            for (int j = 1; j <= counter; j++){
                int middleColumn = counter/2 + 1;
                System.out.print(start);
                if (j < middleColumn){
                    start--;
                } else {
                    start++;
                }
            }
            System.out.println();
            counter += 2;
            spaces--;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

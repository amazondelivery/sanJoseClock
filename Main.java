public class Main {
    public static void main(String args[]) {
        Switch[][] switchArray = new Switch[8][20];
        for (int i = 0; i < switchArray.length; i++) {
            for (int k = 0; k < switchArray[0].length; k++) {
                switchArray[i][k] = new Switch();
            }
        }
    }
}

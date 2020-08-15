package MicrosoftOA;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    private void findVerticalPath() {
        int maxWidth = 0;
        int[] X = {5, 5, 5 ,7, 7, 7};

        Arrays.sort(X);

        for (int i = 0; i < X.length-1; i++) {
            maxWidth = Math.max(maxWidth, (X[i+1] - X[i]));
        }
        System.out.println("Max Vertical Width = "+maxWidth);
    }

}

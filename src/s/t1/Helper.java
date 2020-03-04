
package s.t1;


public class Helper {

    public final static char[] ALPHAPETICS = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static char[][] getCompositinKey() {
        char[][] key = new char[5][5];
        int index = 0;
        for (int x = 0; x < key.length; x++) {
            for (int y = 0; y < key.length; y++) {
                key[x][y] = ALPHAPETICS[index];
                index++;
            }
        }
        return key;
    }

    public static char[] getEncryptionVectore(String vector) {
        char[] encryptionVectore = new char[5];
        for (int i = 0; i < 5; i++) {
            encryptionVectore[i] = vector.charAt(i);
        }
        return encryptionVectore;
    }

    public static char[] matchPlainVector(char text, char[] vector) {
        if (text == 'z') {
            text = 'q';
        }
        char[] cipherBlock = new char[2];
        int[] xy = getXY(text, getCompositinKey());
        int x = xy[0];
        int y = xy[1];
        char cx = vector[x];
        char cy = vector[y];
        System.out.println("cx=" + cx);
        System.out.println("cy=" + cy);

        cipherBlock[0] = cx;
        cipherBlock[1] = cy;
        return cipherBlock;
    }

    public static int[] getXY(char c, char[][] key) {
        int[] xy = new int[2];
        for (int x = 0; x < key.length; x++) {
            for (int y = 0; y < key.length; y++) {
                if (key[x][y] == c) {
                    xy[0] = x;
                    xy[1] = y;
                }
            }
        }
        return xy;
    }

    public static char getCipherChar(char c1, char c2, char[] vector) {
        int x = getVectorIndex(c1, vector);
        int y = getVectorIndex(c2, vector);
        char[][] key = getCompositinKey();
        char c = key[x][y];
        return c;
    }

    public static int getVectorIndex(char c, char[] vector) {
        for (int i = 0; i < 5; i++) {
            if (vector[i] == c) {
                return i;
            }
        }
        return 0;
    }
}

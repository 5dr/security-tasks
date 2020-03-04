/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.t1;

/**
 *
 * @author Moham
 */
public class Encrypt {

    private String plainText;
    private char[] vectorToEncrypt;

    public Encrypt(String plainText, String vectorToEncrypt) {
        this.plainText = plainText.replaceAll("\\s", "").toLowerCase();
        this.vectorToEncrypt = Helper.getEncryptionVectore(vectorToEncrypt);
    }

    public String getCiperChain() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            builder.append(Helper.matchPlainVector(plainText.charAt(i), vectorToEncrypt));
        }
        return builder.toString();
    }

    public String getCiperText() {
        String text = getCiperChain();
        StringBuilder builder = new StringBuilder();
        int splitPoint = (int) (text.length() / 2);
        System.out.println(text);
        char[] vector1 = text.substring(0, splitPoint).toCharArray();
        char[] vector2 = text.substring(splitPoint).toCharArray();
        for (int i = 0; i < vector2.length; i++) {
            char c1 = vector1[i];
            char c2 = vector2[i];

            System.out.println(""+c1+"\t"+c2);
            builder.append(Helper.getCipherChar(c1, c2, vectorToEncrypt));
        }
        return builder.toString();
    }

}

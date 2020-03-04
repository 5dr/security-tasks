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
public class Decrypt {

    private String cipherText;
    private char[] vectorToDecrypt;

    public Decrypt(String cipherText, String vectorToDecrypt) {
        this.cipherText = cipherText.replaceAll("\\s", "").toLowerCase();
        this.vectorToDecrypt = Helper.getEncryptionVectore(vectorToDecrypt);
    }

    public String getCiperChain() {
        StringBuilder builder = new StringBuilder();
        char[] vector1 = new char[cipherText.length()];
        char[] vector2 = new char[cipherText.length()];
        for (int i = 0; i < cipherText.length(); i++) {
            char[] block = Helper.matchPlainVector(cipherText.charAt(i), vectorToDecrypt);
            vector1[i] = block[0];
            vector2[i] = block[1];
        }
        return builder.append(vector1).append(vector2).toString();
    }

    public String getPlainText() {
        String text = getCiperChain();
        StringBuilder builder = new StringBuilder();
        System.out.println(text);
        for (int i = 0; i < text.length(); i += 2) {
            char c1 = text.charAt(i);
            char c2 = text.charAt(i + 1);

            char c = Helper.getCipherChar(c1, c2, vectorToDecrypt);
            if (c == 'q') {
                builder.append("qz");
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}

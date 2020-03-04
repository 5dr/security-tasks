/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s.t1;

import java.lang.*;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import java.awt.event.KeyEvent;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javax.swing.JOptionPane;
import sun.security.util.Length;

/**
 *
 * @author asd
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXToggleButton togg;
    @FXML
    private JFXToggleButton togg2;

    @FXML
    private JFXTextField text;
    @FXML
    private TextField Key;
    @FXML
    private TextField Key2;
    @FXML
    private Pane ceaser;
    @FXML
    private Pane play;
    @FXML
    private Pane p1;

    @FXML
    private Label l;

    @FXML
    private TextField Key1;

    @FXML
    private JFXToggleButton togg1;

    @FXML
    private JFXTextField text1;
    @FXML
    private JFXTextField text2;

    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label change;

    @FXML
    private Label transposition;

    @FXML
    private Pane trans;

    String s = "";

    @FXML
    private JFXToggleButton togg3;
    @FXML
    private Pane full;

    @FXML
    private JFXTextField text3;
    @FXML
    private TextField Key3;

    @FXML
    private Label l3;
    @FXML
    private Pane com;

    @FXML
    private TextField Key4;

    @FXML
    private JFXToggleButton togg4;

    @FXML
    private JFXTextField text4;

    @FXML
    private Label l4;
    
    @FXML
    private Pane hill;

    @FXML
    private TextField Key5;

    @FXML
    private JFXToggleButton togg5;

    @FXML
    private JFXTextField text5;

    @FXML
    private Label l5;

    @FXML
    private Label transposition111;

    @FXML
    private Pane one_time;

    @FXML
    private TextField Key6;

    @FXML
    private JFXToggleButton togg6;

    @FXML
    private JFXTextField text6;

    @FXML
    private Label l6;


    public void ceaser(ActionEvent e) throws Exception {
        change.setText("ceaser");
        p1.setVisible(false);
        ceaser.setVisible(true);
        trans.setVisible(false);
        full.setVisible(false);
        play.setVisible(false);
        com.setVisible(false);
        hill.setVisible(false);
        one_time.setVisible(false);
    }
    public void com(ActionEvent e) throws Exception {
        change.setText("ceaser");
        p1.setVisible(false);
        ceaser.setVisible(false);
        trans.setVisible(false);
        full.setVisible(false);
        play.setVisible(false);
        com.setVisible(true);
        hill.setVisible(false);
        one_time.setVisible(false);
    }
    public void poly(ActionEvent e) throws Exception {
        change.setText("poly alph");
        p1.setVisible(false);
        ceaser.setVisible(true);
        trans.setVisible(false);
        full.setVisible(false);
        play.setVisible(false);
        com.setVisible(false);
        hill.setVisible(false);
        one_time.setVisible(false);

    }
    public void back(ActionEvent e) throws Exception {
        play.setVisible(false);
        p1.setVisible(true);
        ceaser.setVisible(false);
        trans.setVisible(false);
        full.setVisible(false);
        com.setVisible(false);
        hill.setVisible(false);
        one_time.setVisible(false);

    }
    public void trans(ActionEvent e) throws Exception {
        play.setVisible(false);
        p1.setVisible(false);
        ceaser.setVisible(false);
        trans.setVisible(true);
        full.setVisible(false);
        com.setVisible(false);
        hill.setVisible(false);
        one_time.setVisible(false);

    }
    public void play(ActionEvent e) throws Exception {
        play.setVisible(true);
        p1.setVisible(false);
        ceaser.setVisible(false);
        trans.setVisible(false);
        full.setVisible(false);
        com.setVisible(false);
        hill.setVisible(false);
        one_time.setVisible(false);

    }
    public void full(ActionEvent e) throws Exception {
        play.setVisible(false);
        p1.setVisible(false);
        ceaser.setVisible(false);
        trans.setVisible(false);
        full.setVisible(true);
        com.setVisible(false);
        hill.setVisible(false);
        one_time.setVisible(false);

    }
    public void hill(ActionEvent e) throws Exception {
        play.setVisible(false);
        p1.setVisible(false);
        ceaser.setVisible(false);
        trans.setVisible(false);
        full.setVisible(false);
        com.setVisible(false);
        hill.setVisible(true);
        one_time.setVisible(false);

    }
    public void one(ActionEvent e) throws Exception {
        play.setVisible(false);
        p1.setVisible(false);
        ceaser.setVisible(false);
        trans.setVisible(false);
        full.setVisible(false);
        com.setVisible(false);
        hill.setVisible(false);
        one_time.setVisible(true);

    }

    private int getkey() throws UnsupportedEncodingException {
        int k = 0;
        char[] c;

        c = Key.getText().toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        k = (int) c[0];
        if (k >= 65) {

            return k = k - 65;

        } else {

            // k = Character.getNumericValue(c[0]);
            k = Integer.parseInt(new String(c));
            return k;

        }

    }
    public void ceas(ActionEvent e) throws Exception {
        int t = 0;
        int k = getkey();
        char[] c = text.getText().toCharArray();
        String filter = new String(c);
        filter = filter.replaceAll(" ", "");
        c = filter.toCharArray();

        if (togg.isSelected() == true) {
            for (int i = 0; i < c.length; i++) {
                t = (int) c[i] - k;
                if (t < 97) {
                    t = 123 - (97 - t);
                    c[i] = (char) t;
                } else {
                    c[i] = (char) t;
                }
            }
            s = new String(c);

            l.setText(s);
        } else {

            for (int i = 0; i < c.length; i++) {
                t = (int) c[i] + k;
                if (t > 122) {
                    t = 96 + (t - 122);
                    c[i] = (char) t;
                } else {
                    c[i] = (char) t;
                }
            }
            s = new String(c);

            l.setText(s);
        }

    }
    public void transposition(ActionEvent e) throws Exception {
        char[] c = Key1.getText().toCharArray();
        char[] sort = Key1.getText().toCharArray();
        Arrays.sort(sort);
        char[] massege = text1.getText().toCharArray();
        String filter = new String(massege);
        filter = filter.replaceAll(" ", "");
        massege = filter.toCharArray();
        System.out.println(massege);
        int w = massege.length / c.length;
        if (!(c.length * w == massege.length)) {
            w += 2;
        } else if (c.length * w == massege.length) {
            w++;
        }

        if (togg1.isSelected() == true) {
            int count = 0;
            int alpha = 65;
            int wd = massege.length / c.length;
            char[][] encrupt = new char[wd][c.length];
            for (int j = 0; j < c.length; j++) {
                for (int i = 0; i < wd; i++) {

                    encrupt[i][j] = massege[count];
                    count++;

                }
            }
            for (int j = 0; j < c.length; j++) {
                for (int i = 0; i < wd; i++) {
                    System.out.println(encrupt[i][j]);
                }
            }
            char[][] matrix = new char[c.length][wd + 1];

            for (int i = 0; i < c.length; i++) {
                matrix[i][0] = c[i];
            }
            for (int j = 0; j < wd + 1; j++) {
                for (int i = 0; i < c.length; i++) {

                    try {
                        matrix[i][j + 1] = encrupt[j][new String(sort).indexOf(c[i])];
                        System.out.println(matrix[i][j + 1]);
                        String s = l1.getText();
                        l1.setText(s + matrix[i][j + 1]);

                    } catch (Exception ex) {
                    }

                }
            }
//           for (int j = 0; j < wd+1; j++) {
//                for (int i = 0; i < c.length; i++) {
//                    System.out.println(matrix[i][j]);
//                   
//                }
//            }

        } else {

            char[][] matrix = new char[c.length][w];
            // int comp = massege.length % w - 1;
            int count = 0;
            int alpha = 65;
            for (int i = 0; i < c.length; i++) {
                matrix[i][0] = c[i];
            }
            for (int j = 1; j < w; j++) {
                for (int i = 0; i < c.length; i++) {

                    if (count < massege.length) {
                        matrix[i][j] = massege[count];
                        count++;
                    } else {
                        matrix[i][j] = (char) alpha;
                        alpha++;
                    }
                }
            }

            for (int j = 0; j < w; j++) {
                for (int i = 0; i < c.length; i++) {
                    System.out.println(matrix[i][j]);
                }
            }

            char[][] encrupt = new char[w - 1][sort.length];

            for (int j = 0; j < sort.length; j++) {
                for (int i = 0; i < w - 1; i++) {

                    encrupt[i][j] = matrix[new String(c).indexOf(sort[j])][i + 1];

                }
            }
            for (int j = 0; j < c.length; j++) {
                for (int i = 0; i < w - 1; i++) {
                    System.out.println(encrupt[i][j]);
                    String s = l1.getText();
                    l1.setText(s + encrupt[i][j]);
                }
                String s = l1.getText();
                l1.setText(s + " ");
            }
        }
    }
    public void play_fair(ActionEvent e) throws Exception {
        char[] key = Key2.getText().toLowerCase().toCharArray();
        char[] pain = text2.getText().toLowerCase().toCharArray();
        char[] c = text2.getText().toCharArray();
        String filter = new String(pain);
        filter = filter.replaceAll(" ", "");
        pain = filter.toCharArray();
        
        String filter2 = new String(key);
        filter2 = filter2.replaceAll(" ", "");
        key = filter2.toCharArray();
        
        
        
       

        if (togg2.isSelected() == true) {
            int count=0;
            int ind=0;
            int[] ind_of_i_or_j=new int [2];
            char[][] matrix=new char [5][5];
            
            ////ملى الكيي ف الماتريكس
            
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                   
                    if(ind==key.length)break;
                    if(key[ind]=='i'||key[ind]=='j'){
                    ind_of_i_or_j[0]=i;  ind_of_i_or_j[1]=j; 
                       System.out.println("if 1");
                    }
                    if(search(matrix,key[ind] )){
                        System.out.println("if 2");
                        ind++;
                        if(j==0){j=5;i--;}
                        else j--;
                            
                        
                    }else{
                    System.out.println("else 2");
                     System.out.println(key[ind]);
                      matrix[i][j]=key[ind++];
                      count++;
                      
                    }
                }
     
            }
            for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
             
                 System.out.println(matrix[i][j]);
                   
             
             }
           
           }
            int cha =97;
           int count2=count/5;
           count=count%5;
           
        ////ملى بقيتالحروف ف الماتريكس   
            for(int i=count2;i<5;i++){
                if(i!=count2){
                count=0;
                }
             for(int j=count;j<5;j++){
               
            
                 if(search(matrix, (char)cha)){
                     
                 cha++;
                        if(j==0){j=5;i--;}
                        else j--;
                 }
                 else{
                     if(cha==105){
                        if(search(matrix,(char)106)){
                            cha++;
                            if(j==1){j=5;i--;}
                             else j--;
                            continue;
                        }else{
                         matrix[i][j]=(char)cha;
                         cha++;
                        }
                     }
                    else if(cha==106){
                      if (search(matrix,(char)105)){
                          cha++;
                          if(j==0){j=5;i--;}
                         else j--;
                            continue;
                      } else{
                         matrix[i][j]=(char)cha;
                         cha++;
                        }
                     }
                    else{
                    matrix[i][j]=(char)cha;
                    cha++;
                    }
                 }
             }}
            for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
             
                 System.out.println(matrix[i][j]);
                   
             
             }
           }
            
            double d= pain.length;
        d/=2;
        d=  Math.ceil(d);
            System.out.println(d);
          int col=(int)d;
            System.out.println(col);
          char [][] cipher_matrix=new char [col][2];
          int ind_pain=0;
          char current=' ';
          boolean b=false;
          ///ملى السيفر و اقسمه اتنينات
          for(int i=0;i<col;i++){
            for(int j=0;j<2;j++){
               if(ind_pain==pain.length){
                   System.out.println("if 1");
                    break;
                } 
                
                if(ind_pain%2!=0){
                    System.out.println("if 2");
                current=pain[ind_pain];
                if(current==pain[ind_pain-1]&&b==false){
                System.out.println("if 3");
                cipher_matrix[i][j]='x';
                System.out.println(cipher_matrix[i][j]);
                b=true;
                }else{
                System.out.println("else 1");
                cipher_matrix[i][j]=pain[ind_pain++];
                System.out.println(cipher_matrix[i][j]);
                b=false;
                }
                
                }               
                
                
                else{
                System.out.println("else 2");
                cipher_matrix[i][j]=pain[ind_pain++];
                System.out.println(cipher_matrix[i][j]);
                b=false;
                }
            
            }
          }
                   char[] cipher=new char[col*2];
          int ind_cipher=0;
          int pos1=0;
          int pos2=0;
          ////فك التشفير بقى انا زهجت   
        for(int i=0;i<col;i++){
            for(int j=0;j<1;j++){
                int[] index=get_index(matrix,cipher_matrix[i][j] );
                int[] index2=get_index(matrix,cipher_matrix[i][j+1] );
               
                System.out.println(" even : "+index[0]+" "+index[1]);
                System.out.println(" odd : "+index2[0]+" "+index2[1]);
                if(index[0]==index2[0]){
                    if(index[1]==0){pos1=4;}else{pos1=index[1]-1;}
                    if(index2[1]==0){pos2=4;}else{pos2=index2[1]-1;}
                        
                System.out.println(matrix[index[0]][pos1]);
                System.out.println(matrix[index2[0]][pos2]);
                cipher[ind_cipher++]=matrix[index[0]][pos1];
                cipher[ind_cipher++]=matrix[index2[0]][pos2];
                System.out.println("same row");   
                System.out.println(cipher[ind_cipher-2]);
                System.out.println(cipher[ind_cipher-1]);
                System.out.println(index[0]+" "+index[1]);
                System.out.println(index2[0]+" "+index2[1]);
                
               
                }
               else if(index[1]==index2[1]){
                   if(index[0]==0){pos1=4;}else{pos1=index[0]-1;}
                    if(index2[0]==0){pos2=4;}else{pos2=index2[0]-1;}
                cipher[ind_cipher++]=matrix[pos1][index[1]];
                cipher[ind_cipher++]=matrix[pos2][index2[1]];
                System.out.println("same col");
                System.out.println(cipher[ind_cipher-2]);
                System.out.println(cipher[ind_cipher-1]);
                System.out.println(index[0]+" "+index[1]);
                System.out.println(index2[0]+" "+index2[1]);
                
                }
                else{
                
                cipher[ind_cipher++]=matrix[index[0]][index2[1]];
                cipher[ind_cipher++]=matrix[index2[0]][index[1]];
                 System.out.println("else");
                 System.out.println(cipher[ind_cipher-2]);
                 System.out.println(cipher[ind_cipher-1]);
                 System.out.println(index[0]+" "+index[1]);
                 System.out.println(index2[0]+" "+index2[1]);
                
                }
          
        }}
        
        for(int i=0;i<cipher.length;i++){
        
            
            if(cipher[i]=='x'&&i!=0&&i!=cipher.length-1){
              if(cipher[i-1]==cipher[i+1])
                  cipher[i]=' ';
            
            }
            
            System.out.println(cipher[i]);
            
        }
         
        s=new String(cipher);
        s=s.replaceAll(" ", "");
            l2.setText(s);
          
            
            
        } else {
           
            int count=0;
            int ind=0;
            int[] ind_of_i_or_j=new int [2];
            char[][] matrix=new char [5][5];
            
            ////ملى الكيي ف الماتريكس
            
            for(int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                   
                    if(ind==key.length)break;
                    if(key[ind]=='i'||key[ind]=='j'){
                    ind_of_i_or_j[0]=i;  ind_of_i_or_j[1]=j; 
                       System.out.println("if 1");
                    }
                    if(search(matrix,key[ind] )){
                        System.out.println("if 2");
                        ind++;
                        if(j==0){j=5;i--;}
                        else j--;
                            
                        
                    }else{
                    System.out.println("else 2");
                     System.out.println(key[ind]);
                      matrix[i][j]=key[ind++];
                      count++;
                      
                    }
                }
                
            
            
            }
            
             for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
             
                 System.out.println(matrix[i][j]);
                   
             
             }
           
           }
             
           int cha =97;
           int count2=count/5;
           count=count%5;
           
        ////ملى بقيتالحروف ف الماتريكس   
            for(int i=count2;i<5;i++){
                if(i!=count2){
                count=0;
                }
             for(int j=count;j<5;j++){
               
            
                 if(search(matrix, (char)cha)){
                     
                 cha++;
                        if(j==0){j=5;i--;}
                        else j--;
                 }
                 else{
                     if(cha==105){
                        if(search(matrix,(char)106)){
                            cha++;
                            if(j==1){j=5;i--;}
                             else j--;
                            continue;
                        }else{
                         matrix[i][j]=(char)cha;
                         cha++;
                        }
                     }
                    else if(cha==106){
                      if (search(matrix,(char)105)){
                          cha++;
                          if(j==0){j=5;i--;}
                         else j--;
                            continue;
                      } else{
                         matrix[i][j]=(char)cha;
                         cha++;
                        }
                     }
                    else{
                    matrix[i][j]=(char)cha;
                    cha++;
                    }
                 }
             
                 
             }} 
            
          for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
             
                 System.out.println(matrix[i][j]);
                   
             
             }
           
           }

        double d= pain.length;
        d/=2;
        d=  Math.ceil(d);
            System.out.println(d);
          int col=(int)d;
            System.out.println(col);
          char [][] pain_matrix=new char [col][2];
          int ind_pain=0;
          char current=' ';
          boolean b=false;
          ///ملى الباين و اقسمه اتنينات
          for(int i=0;i<col;i++){
            for(int j=0;j<2;j++){
               if(ind_pain==pain.length){
                   System.out.println("if 1");
                    break;
                } 
                
                if(ind_pain%2!=0){
                    System.out.println("if 2");
                current=pain[ind_pain];
                if(current==pain[ind_pain-1]&&b==false){
                System.out.println("if 3");
                pain_matrix[i][j]='x';
                System.out.println(pain_matrix[i][j]);
                b=true;
                }else{
                System.out.println("else 1");
                pain_matrix[i][j]=pain[ind_pain++];
                System.out.println(pain_matrix[i][j]);
                b=false;
                }
                
                }               
                
                
                else{
                System.out.println("else 2");
                pain_matrix[i][j]=pain[ind_pain++];
                System.out.println(pain_matrix[i][j]);
                b=false;
                }
            
            }
          }
          
          char[] cipher=new char[col*2];
          int ind_cipher=0;
          int pos1=0;
          int pos2=0;
          ////التشفير بقى انا زهجت
        for(int i=0;i<col;i++){
            for(int j=0;j<1;j++){
                int[] index=get_index(matrix,pain_matrix[i][j] );
                int[] index2=get_index(matrix,pain_matrix[i][j+1] );
               
                System.out.println(" even : "+index[0]+" "+index[1]);
                System.out.println(" odd : "+index2[0]+" "+index2[1]);
                if(index[0]==index2[0]){
                    if(index[1]==4){pos1=0;}else{pos1=index[1]+1;}
                    if(index2[1]==4){pos2=0;}else{pos2=index2[1]+1;}
                        
                System.out.println(matrix[index[0]][pos1]);
                System.out.println(matrix[index2[0]][pos2]);
                cipher[ind_cipher++]=matrix[index[0]][pos1];
                cipher[ind_cipher++]=matrix[index2[0]][pos2];
                System.out.println("same row");   
                System.out.println(cipher[ind_cipher-2]);
                System.out.println(cipher[ind_cipher-1]);
                System.out.println(index[0]+" "+index[1]);
                System.out.println(index2[0]+" "+index2[1]);
                
               
                }
               else if(index[1]==index2[1]){
                   if(index[0]==4){pos1=0;}else{pos1=index[0]+1;}
                    if(index2[0]==4){pos2=0;}else{pos2=index2[0]+1;}
                cipher[ind_cipher++]=matrix[pos1][index[1]];
                cipher[ind_cipher++]=matrix[pos2][index2[1]];
                System.out.println("same col");
                System.out.println(cipher[ind_cipher-2]);
                System.out.println(cipher[ind_cipher-1]);
                System.out.println(index[0]+" "+index[1]);
                System.out.println(index2[0]+" "+index2[1]);
                
                }
                else{
                
                cipher[ind_cipher++]=matrix[index[0]][index2[1]];
                cipher[ind_cipher++]=matrix[index2[0]][index[1]];
                 System.out.println("else");
                 System.out.println(cipher[ind_cipher-2]);
                 System.out.println(cipher[ind_cipher-1]);
                 System.out.println(index[0]+" "+index[1]);
                 System.out.println(index2[0]+" "+index2[1]);
                
                }
          
        }}
        
        for(int i=0;i<cipher.length;i++){
        
            System.out.println(cipher[i]);
            
        }
        s=new String(cipher);
            l2.setText(s);
        }
       
    }
    public boolean search(char matrix [][],char ch){
       
       
           for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
             
                 if(matrix [i][j]==ch){
                     return true;}
           
             }
           
           }
           return false;
       }
    public int[] get_index(char matrix [][],char ch){
       
           int []x={0,0};
       
           for(int i=0;i<5;i++){
             for(int j=0;j<5;j++){
                 if(matrix [i][j]==ch){
                     x[0]=i;
                     x[1]=j;
                     
                     return x;}
           
             }
           
           }
           return x;
       }
    
    public void full_vigenere(ActionEvent e) throws Exception {
        char[] key = Key3.getText().toLowerCase().toCharArray();
        char[] pain = text3.getText().toLowerCase().toCharArray();
        char[] c = text3.getText().toCharArray();
        String filter = new String(pain);
        filter = filter.replaceAll(" ", "");
        pain = filter.toCharArray();

        if (togg3.isSelected() == true) {
           
            int key_ind=0;
           char[]sol=new char[pain.length];
                   
            for(int i=0;i<pain.length;i++){
                
            if(key_ind==key.length){
                key_ind=0;
                int x=((((int)pain[i]-97)-((int)key[key_ind]-97)));
                
                if(x<0){x+=26;}
                System.out.println((x)%26);
                sol[i]=(char)(((x)%26)+97);
                
            key_ind++;
            }else{
                int x=((((int)pain[i]-97)-((int)key[key_ind]-97)));
                if(x<0){x+=26;}
            System.out.println((x)%26);
            sol[i]=(char)(((x)%26)+97);
            key_ind++;
            
            }
            
            }
           for(int i=0;i<pain.length;i++){
           
               System.out.println(sol[i]);
           }
           s=new String(sol);
            l3.setText(s);
            
            
        } else {
       
           int key_ind=0;
           char[]sol=new char[pain.length];
                   
            for(int i=0;i<pain.length;i++){
            if(key_ind==key.length){
                key_ind=0;
                System.out.println((int)pain[i]-97);
                System.out.println((int)key[key_ind]-97);
                sol[i]=(char)(((((int)pain[i]-97)+((int)key[key_ind]-97))%26)+97);
                
            key_ind++;
            }else{
                
                System.out.println((int)pain[i]-97);
                System.out.println((int)key[key_ind]-97);
            sol[i]=(char)(((((int)pain[i]-97)+((int)key[key_ind++]-97))%26)+97);
            
            }
            
            }
           for(int i=0;i<pain.length;i++){
           
               System.out.println(sol[i]);
           }
           s=new String(sol);
            l3.setText(s);
            
        }

    }

    
    public void combination(ActionEvent e) throws Exception {
        char[] key = Key4.getText().toLowerCase().toCharArray();
        char[] pain = text4.getText().toLowerCase().toCharArray();
        char[] c = text4.getText().toCharArray();
        String filter = new String(pain);
        filter = filter.replaceAll(" ", "");
        pain = filter.toCharArray();

        if (togg4.isSelected() == true) {
           Decrypt de = new Decrypt(text4.getText(), "abcde");
           l4.setText(de.getPlainText());
            
        } else {
       Encrypt en = new Encrypt(text4.getText(), "abcde");
        l4.setText(en.getCiperText());
        }

    }
    
    public void one_time(ActionEvent e) throws Exception{
    if (togg6.isSelected() == true) {
//        l6.setText(decrypt(text6.getText(), Key6.getText()));
        
    }else{
    
   // l6.setText(encrypt(text6.getText(), Key6.getText()));
    String x=Integer.toBinaryString((int)(text6.getText().charAt(0)));
    String y=Integer.toBinaryString((int)(Key6.getText().charAt(0)));
        System.out.println(x);
        System.out.println(y);
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();

      for (int i = 0; i < x.length(); i++) {
         sb.append(x.charAt(i)^y.charAt(i));
      }
        
        System.out.println(sb);   
        System.out.println(Integer.parseInt(sb.toString(),2));  
        String x1=Integer.toBinaryString(13),y1=Integer.toBinaryString(19);
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toBinaryString(19));
       
        for (int i = 0; i < x1.length(); i++) {
         sb1.append(x1.charAt(i)^y1.charAt(i));
      }
        System.out.println(sb1);
        System.out.println(Integer.parseInt(sb1.toString(),2));
    
    }
    
    
    }
    public StringBuffer[]  encrypt(String plain, String key){ 
		if (plain.length() != key.length()) this.error("Message and key must be equal in length");
		
		plain = plain.toLowerCase();
		key = key.toLowerCase();
		String[] message = this.convertCharToInt(plain.toCharArray());
		String[] random  = this.convertCharToInt(key.toCharArray());
		String[] data    = new String[plain.length()];
		StringBuffer[] sb1 = new StringBuffer[plain.length()];
		for (int i=0;i<plain.length();i++){
		for (int j = 0; j < message[i].length(); j++) {
                  sb1[i].append(message[i].charAt(i)^random[i].charAt(i));
                   }	               
		}
		
		return sb1;
	}
	
//	public String decrypt(String cipher, String key){ 
//		if (cipher.length() != key.length()) this.error("Encrypted message and key must be equal");
//		
//		cipher = cipher.toLowerCase();
//		key = key.toLowerCase();
//		int[] message = this.convertCharToInt(cipher.toCharArray());
//		int[] random  = this.convertCharToInt(key.toCharArray());
//		int[] data    = new int[cipher.length()];
//		
//		for (int i=0;i<cipher.length();i++){
//			data[i] = message[i] - random[i];
//			//data[i] = data[i] % 26;
//			if (data[i] < 0) data[i] = data[i] + 26;
//		}
//		
//		return new String(this.convertIntToChar(data));
//	}
	
	private void error(String msg){
		System.out.println(msg);
                JOptionPane.showMessageDialog(null, msg);
		//System.exit(-1);
	}
	
	private char[] convertIntToChar(int[] m){
		
		char c[] = new char[m.length];
		
		for (int i = 0;i < m.length; i++){
			if (m[i] == 0){
				c[i] = 'a';
			}
			else if (m[i] == 1){
				c[i] = 'b';
			}
			else if (m[i] == 2){
				c[i] = 'c';
			}
			else if (m[i] == 3){
				c[i] = 'd';
			}
			else if (m[i] == 4){
				c[i] = 'e';
			}
			else if (m[i] == 5){
				c[i] = 'f';
			}
			else if (m[i] == 6){
				c[i] = 'g';
			}
			else if (m[i] == 7){
				c[i] = 'h';
			}
			else if (m[i] == 8){
				c[i] = 'i';
			}
			else if (m[i] == 9){
				c[i] = 'j';
			}
			else if (m[i] == 10){
				c[i] = 'k';
			}
			else if (m[i] == 11){
				c[i] = 'l';
			}
			else if (m[i] == 12){
				c[i] = 'm';
			}
			else if (m[i] == 13){
				c[i] = 'n';
			}
			else if (m[i] == 14){
				c[i] = 'o';
			}
			else if (m[i] == 15){
				c[i] = 'p';
			}
			else if (m[i] == 16){
				c[i] = 'q';
			}
			else if (m[i] == 17){
				c[i] = 'r';
			}
			else if (m[i] == 18){
				c[i] = 's';
			}
			else if (m[i] == 19){
				c[i] = 't';
			}
			else if (m[i] == 20){
				c[i] = 'u';
			}
			else if (m[i] == 21){
				c[i] = 'v';
			}
			else if (m[i] == 22){
				c[i] = 'w';
			}
			else if (m[i] == 23){
				c[i] = 'x';
			}
			else if (m[i] == 24){
				c[i] = 'y';
			}
			else if (m[i] == 25){
				c[i] = 'z';
			}
			else if (m[i] == -1){
				c[i] = 'Z';
			}

		}
		
		return c;
	}
	
       String []one_pod;
	private String[] convertCharToInt(char[] m){
		/**
		 * This function converts the letters in an array 'm' to numbers for OTP encryption
		 */
		
                one_pod=new String[text6.getText().toCharArray().length];
		int c[] = new int[m.length];
		
		for (int i = 0;i < m.length; i++){
			if (m[i] == 'a'){
				c[i] = 0;
                one_pod[i]=Integer.toBinaryString((int)(0));
			}
			else if (m[i] == 'b'){
                            c[i] = 1;
	        one_pod[i]=Integer.toBinaryString((int)(1));
			}
			else if (m[i] == 'c'){
				c[i] = 2;
                one_pod[i]=Integer.toBinaryString((int)(2));
			}
			else if (m[i] == 'd'){
				c[i] = 3;
                one_pod[i]=Integer.toBinaryString((int)(3));
			}
			else if (m[i] == 'e'){
				c[i] = 4;
                one_pod[i]=Integer.toBinaryString((int)(4));
			}
			else if (m[i] == 'f'){
				c[i] = 5;
		one_pod[i]=Integer.toBinaryString((int)(5));
                        }
			else if (m[i] == 'g'){
				c[i] = 6;
		one_pod[i]=Integer.toBinaryString((int)(6));	
                        }
			else if (m[i] == 'h'){
				c[i] = 7;
		one_pod[i]=Integer.toBinaryString((int)(7));
                        }
			else if (m[i] == 'i'){
				c[i] = 8;
		one_pod[i]=Integer.toBinaryString((int)(8));	
                        }
			else if (m[i] == 'j'){
				c[i] = 9;
		one_pod[i]=Integer.toBinaryString((int)(9));	
                        }
			else if (m[i] == 'k'){
				c[i] = 10;
		one_pod[i]=Integer.toBinaryString((int)(10));	
                        }
			else if (m[i] == 'l'){
				c[i] = 11;
		one_pod[i]=Integer.toBinaryString((int)(11));	
                        }
			else if (m[i] == 'm'){
				c[i] = 12;
		one_pod[i]=Integer.toBinaryString((int)(12));	
                        }
			else if (m[i] == 'n'){
				c[i] = 13;
		one_pod[i]=Integer.toBinaryString((int)(13));
                        }
			else if (m[i] == 'o'){
				c[i] = 14;
		one_pod[i]=Integer.toBinaryString((int)(14));	
                        }
			else if (m[i] == 'p'){
				c[i] = 15;
		one_pod[i]=Integer.toBinaryString((int)(15));
                        }
			else if (m[i] == 'q'){
				c[i] = 16;
		one_pod[i]=Integer.toBinaryString((int)(16));	
                        }
			else if (m[i] == 'r'){
				c[i] = 17;
		one_pod[i]=Integer.toBinaryString((int)(17));	
                        }
			else if (m[i] == 's'){
				c[i] = 18;
		one_pod[i]=Integer.toBinaryString((int)(18));	
                        }
			else if (m[i] == 't'){
				c[i] = 19;
		one_pod[i]=Integer.toBinaryString((int)(19));	
                        }
			else if (m[i] == 'u'){
				c[i] = 20;
		one_pod[i]=Integer.toBinaryString((int)(20));	
                        }
			else if (m[i] == 'v'){
				c[i] = 21;
		one_pod[i]=Integer.toBinaryString((int)(21));	
                        }
			else if (m[i] == 'w'){
				c[i] = 22;
		one_pod[i]=Integer.toBinaryString((int)(22));	
                        }
			else if (m[i] == 'x'){
				c[i] = 23;
		one_pod[i]=Integer.toBinaryString((int)(23));	
                        }
			else if (m[i] == 'y'){
				c[i] = 24;
		one_pod[i]=Integer.toBinaryString((int)(24));	
                        }
			else if (m[i] == 'z'){
				c[i] = 25;
	one_pod[i]=Integer.toBinaryString((int)(25));
                        }
			else{
				c[i] = -1;
			}

		}
		
		return one_pod;
	}
    

   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}

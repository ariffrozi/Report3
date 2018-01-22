package jp.ac.uryukyu.ie.e175756;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Main {
        public static void main(String args[]){
            JFrame myFrame = new JFrame("Sample Frame");//ウィンドーのタイトルを書く
            myFrame.setSize(600,600);//ウィンドーのサイズ
            myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            myFrame.setVisible(true);
        }
    }
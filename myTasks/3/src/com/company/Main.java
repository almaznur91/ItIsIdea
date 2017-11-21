package com.company;

public class Main {
            public static void main(String[] args) throws Exception {
                int x=0,y=0;
                while (true) {
                    for (int i=0;i<10;i++) {
                        for (int j=0;j<10;j++) {
                            if (y==i&&x==j) {
                                System.out.print("@");
                            }else {
                                System.out.print("~");
                            }
                        }
                        System.out.println();
                    }
                    x+=1;
                    y+=2;
                    x=x>9?0:x;
                    y=y>9?0:y;
                    Thread.sleep(500);
                    Runtime.getRuntime().exec("cls");                }
            }
    }


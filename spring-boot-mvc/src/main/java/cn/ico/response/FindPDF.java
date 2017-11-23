package cn.ico.response;

import java.io.File;

public class FindPDF {

    public static void main(String[] args) {
        File file=new File("E:\\upload");
        File[] files = file.listFiles();
        find(file);
    }

    private static void find(File file) {
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    find(files[i]);
                }else {
                    String filename=files[i].getName();
                    int dot = filename.lastIndexOf('.');
                    int upload = files[i].getAbsolutePath().indexOf("upload");
                    if (filename.substring(dot + 1).equalsIgnoreCase("pdf")) {
                        System.out.println(files[i].getAbsolutePath().substring(upload+6));
                    }
                }
            }
        }
    }
}

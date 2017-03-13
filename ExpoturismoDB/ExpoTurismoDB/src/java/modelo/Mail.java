/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Labing
 */
public class Mail {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Labing\\Desktop\\prueba.txt", "rw");
        raf.seek(8);
        System.out.println("num: "+raf.readInt());
        raf.seek(28);
        System.out.println("num: "+raf.readLong());
    }
}

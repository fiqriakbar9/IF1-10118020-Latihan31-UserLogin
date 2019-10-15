/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan33login;

import java.util.Scanner;
/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk membuat halaman dan 
 * proses login serta berbasis objek oriented
 */
public class Latihan33Login {

    private String usName;
    private String passWord;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User login = new User();
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Masukkan Username = ");
        String user = scanner.next();
        System.out.printf("Masukkan Password = ");
        String pass = scanner.next();
        System.out.println();
        
        login.pengecekkanLogin(user,pass);
        System.out.println("\nDevelop by : Fiqri Akbar Pratama");
    }
    
}

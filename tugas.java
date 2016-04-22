/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author Lenovo
 */
public class tugas {
    private static int count=0;
    private final String nama,nmrhp;
    public tugas (String a,String b){
        nama = a;
        nmrhp = b;
        count++;
    }
    public static int getcount (){
        return count;
    }
    public void display(){
        System.out.println("nama: "+nama+"\tnomor hp: "+nmrhp);
    }
}

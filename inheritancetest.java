/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author Sumakmur Goenawan
 */
public class inheritancetest {
    public static void main(String[] args)
    { a ortu = new a();
      b anak = new b();
        System.out.println("Superclass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();
        System.out.println("sub class");
        anak.setX(5);
        anak.setY(4);
        anak.setZ(50);
        anak.getJumlah();
    }
}

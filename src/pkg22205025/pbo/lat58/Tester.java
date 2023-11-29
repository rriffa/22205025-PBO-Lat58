/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205025.pbo.lat58;

/**
 *
* @author Lenovo
 * Nama :Ma'rifatu Khirzah
 * Nim :22205025
 * Prodi :Teknik Informatika
 * Deskripsi :Membuat program dengan tambah kurang bilangan
 */


    class Bilangan {

        protected int x;
        protected int y;

        public Bilangan() {
            this.x = 3;
            this.y = 4;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    class JumlahBilangan extends Bilangan {

        public void tampilHasilJumlah() {
            System.out.println("Hasil Penjumlahan = " + (getX() + getY()));
        }
    }

    class SelisihBilangan extends Bilangan {

        public void tampilSelisih() {
            System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " + (getX() - getY()));
        }
    }

    public class Tester {

        public static void main(String[] args) {
            //Membuat objek JumlahBilangan
            JumlahBilangan jm = new JumlahBilangan();
            jm.tampilHasilJumlah();

            //Membuat objek Selisih Bilangan
            SelisihBilangan sb = new SelisihBilangan();
            sb.tampilSelisih();
        }
    }



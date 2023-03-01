/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projedeneme;

import java.util.ArrayList;

/**
 *
 * @author hande
 */
public class Müsteri {

    public static Müsteri loginMusteri = null;
    public static ArrayList<Müsteri> musteriListesi = new ArrayList<>();

    public String adSoyad;
    public String tcNo;
    public String eMail;
    public String sifre;
    public String dogumYeri;
    public boolean baskaBankaKullanicisi;
    public int hesapBakiyesi = 0;
    public int miktar;

    public Müsteri() {
    }

    public Müsteri(String tcNo, int miktar) {
        this.tcNo = tcNo;
        this.miktar = miktar;
    }

    public Müsteri(int hesapBakiyesi, int miktar) {

        this.hesapBakiyesi = hesapBakiyesi;
        this.miktar = miktar;
    }

    public Müsteri(int miktar) {
        this.miktar = miktar;
    }

    public Müsteri(String tcNo) {
        this.tcNo = tcNo;
    }

    public Müsteri(String adSoyad, String tcNo, String eMail, String sifre, String dogumYeri, boolean baskaBankaKullanicisi) {
        this.adSoyad = adSoyad;
        this.tcNo = tcNo;
        this.eMail = eMail;
        this.sifre = sifre;
        this.dogumYeri = dogumYeri;
        this.baskaBankaKullanicisi = baskaBankaKullanicisi;
    }

    public static Müsteri Giris(String tcNo, String sifre) {
        for (Müsteri m : Müsteri.musteriListesi) {
            if (m.tcNo.compareTo(tcNo) == 0
                    && m.sifre.compareTo(sifre) == 0) {
                return m;
            }

        }
        return null;
    }

    public static void ParaYatir(Müsteri mus, int miktar) {
        if (miktar > 0) {
            mus.hesapBakiyesi += miktar;
        }
    }

    public static void ParaCek(Müsteri mus, int miktar) {
        if (mus.hesapBakiyesi >= miktar) {
            mus.hesapBakiyesi -= miktar;
        }
    }

    public static int BakiyeGetir(Müsteri mus, int hesapBakiyesi) {

        mus.hesapBakiyesi = hesapBakiyesi;
        return mus.hesapBakiyesi;

    }

    public static void HavaleYap(Müsteri mus, Müsteri mus2,int miktar) {
        if (mus.hesapBakiyesi>=miktar) {
            mus.hesapBakiyesi -= miktar;
            mus2.hesapBakiyesi += miktar;
        }

    }

}

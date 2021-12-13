/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 55359
 */
public class Ser {

    private String nome;
    private String familia;
    private long qtdSeres;
    private Hino hino;

    public Ser(String nome, String familia, long qtdSeres) {
        this.familia = familia;
        this.qtdSeres = qtdSeres;
        this.nome = nome;
    }

    public void addHino(Hino h) {
        if(this.hino==null)
            this.hino = h;
        else
            System.out.println("Os cara já tem hino parcero!");

    }

    public void removeHino() {
        this.hino = null;
    }
    
    public void recitarHino() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(this.hino.getCaminho()));
        while (br.ready()) {
            System.out.println(br.readLine());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public long getQtdSeres() {
        return qtdSeres;
    }

    public void setQtdSeres(long qtdSeres) {
        this.qtdSeres = qtdSeres;
    }
    
    public boolean possuiHino() {
        return this.hino != null;
    }

}

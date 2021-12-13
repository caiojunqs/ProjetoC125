/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 55359
 */
public class Hino {

    private String titulo;
    private String letra;
    private String caminho;

    public Hino(String titulo, String letra, String caminho) throws IOException {
        this.titulo = titulo;
        this.letra = letra;
        this.caminho = caminho;
        atualizarHino(this.letra);
    }

    public void atualizarHino(String letra) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(getCaminho()));
        bw.append(letra);
        bw.close();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    

}

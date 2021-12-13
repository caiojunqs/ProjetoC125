/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasolar;

import corpoceleste.Planeta;
import corpoceleste.Sol;
import java.util.ArrayList;

/**
 *
 * @author 55359
 */
public class SistemaSolar {

    private String nome;
    private Sol sol;
    private int qtdPlanetas;
    private Planeta[] planeta;

    public SistemaSolar(String nome, Sol sol, int qtdPlanetas) {
        this.nome = nome;
        this.sol = sol;
        this.qtdPlanetas = qtdPlanetas;
        planeta = new Planeta[qtdPlanetas];
    }

    public void addPlaneta(Planeta planeta) {
        for (int i = 0; i < this.planeta.length; i++) {
            if (this.planeta[i] == null) {
                this.planeta[i] = planeta;
                break;
            }
        
        if (i == this.planeta.length-1) {
            System.out.println("Sistema solar cheião já!");
        }
    }}

    public void removePlaneta(Planeta planeta) {
        for (int i = 0; i < this.planeta.length; i++) {
            if (this.planeta[i] == planeta) {
                this.planeta[i] = null;
                break;
            }
            if (i == this.planeta.length-1) {
                System.out.println("Não achei essa Planeta ai não!");
            }
        }
    }

    public void removePlaneta(int index) {
        for (int i = 0; i < this.planeta.length; i++) {
            if (i == index) {
                this.planeta[i] = null;
                break;
            }
            if (i == this.planeta.length-1) {
                System.out.println("Não achei essa Planeta ai não!");
            }
        }
    }

    public void removePlaneta(String nome) {
        for (int i = 0; i < this.planeta.length; i++) {
            if (this.planeta[i].getNome().equals(nome)) {
                this.planeta[i] = null;
                break;
            }
            if (i == this.planeta.length-1) {
                System.out.println("Não achei essa Planeta ai não!");
            }
        }
    }

    public void mostrarPlaneta() {
        for (int i = 0; i < this.planeta.length; i++) {
            if (this.planeta[i] != null) {
                int a = i+1;
                System.out.println("Planeta " + a + " : " + this.planeta[i].getNome());
            }
        }

    }

    public void mostrarSol() {
        System.out.println("O meu sol é o  : " + this.sol.getNome());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public boolean possuiSol() {
        return this.sol != null;
    }

    public boolean possuiPlaneta() {
        for (Planeta pl : this.planeta) {
            if (pl != null) {
                return true;
            }
        }
        return false;
    }

}

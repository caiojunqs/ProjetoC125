/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corpoceleste;

import ser.Ser;

/**
 *
 * @author 55359
 */
public class Planeta extends CorpoCeleste implements Habitavel {

    private int qtdLua;
    private Lua[] lua;
    private Ser ser;

    public Planeta(String nome, long diametro, int qtdLua) {
        super(nome, diametro);
        lua = new Lua[qtdLua];
    }

    public void mostrarLua() {
        for (int i = 0; i < this.lua.length; i++) {
            if (this.lua[i] != null) {
                int a = i + 1;
                System.out.println("Lua " + a + " do planeta " + getNome() + " : " + this.lua[i].getNome());
            }
        }

    }

    public void addLua(Lua lua) {
        for (int i = 0; i < this.lua.length; i++) {
            if (this.lua[i] == null) {
                this.lua[i] = lua;
                break;
            }
            if (i == this.lua.length - 1) {
                System.out.println("Planetinha bonadão de Lua já!");
            }
        }
    }

    public void removeLua(Lua lua) {
        for (int i = 0; i < this.lua.length; i++) {
            if (this.lua[i] == lua) {
                this.lua[i] = null;
                break;
            }
            if (i == this.lua.length - 1) {
                System.out.println("Não achei essa Lua ai não!");
            }
        }
    }

    public void removeLua(int index) {
        for (int i = 0; i < this.lua.length; i++) {
            if (i == index) {
                this.lua[i] = null;
                break;
            }
            if (i == this.lua.length - 1) {
                System.out.println("Não achei essa Lua ai não!");
            }
        }
    }

    public void removeLua(String nome) {
        for (int i = 0; i < this.lua.length; i++) {
            if (this.lua[i].getNome().equals(nome)) {
                this.lua[i] = null;
                break;
            }
            if (i == this.lua.length - 1) {
                System.out.println("Não achei essa Lua ai não!");
            }
        }
    }

    @Override
    public void mostrarNome() {
        System.out.println("O nome do Planeta eh: " + getNome());
    }

    @Override
    public void mostrarDiametro() {
        System.out.println("O diametro do Planeta eh: " + getDiametro());
    }

    @Override
    public void addSer(Ser ser) {
        if (this.ser == null) {
            this.ser = ser;
        } else {
            System.out.print("Tem que remover os manin primeiro!");
        }
    }

    @Override
    public void removeSer() {
        this.ser = null;
    }

    public boolean possuiSer() {
        return this.ser != null;
    }

    public boolean possuiLua() {
        for (Lua lua1 : this.lua) {
            if (lua1 != null) {
                return true;
            }
        }
        return false;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import sistemasolar.SistemaSolar;
import corpoceleste.Lua;
import corpoceleste.Planeta;
import corpoceleste.Sol;
import corpoceleste.CorpoCeleste;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ser.Hino;
import ser.Ser;

/**
 *
 * @author 55359
 */
public class LE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CorpoCeleste cc1 = new CorpoCeleste("cometinha", 5);
        cc1.mostrarNome();
        cc1.setNome("Ccometinha_2");
        cc1.mostrarNome();
        cc1.mostrarDiametro();
        
        System.out.println();
        
        Sol sl = new Sol("Solzinho", 1392700);
        sl.mostrarNome();
        sl.setNome("Solzao");
        sl.mostrarNome();
        
        System.out.println();
        
        Planeta p1 = new Planeta("Mercurio", 4879, 0);
        Planeta p2 = new Planeta("Venus", 12104, 0);
        Planeta p3 = new Planeta("Terra", 12742, 1);
        Planeta p4 = new Planeta("Marte", 6779, 2);
        Planeta p5 = new Planeta("Jupter", 139820, 79);
        Planeta p6 = new Planeta("Saturno", 116460, 82);
        Planeta p7 = new Planeta("Urano", 50724, 27);
        Planeta p8 = new Planeta("Netuno", 49244, 13);
        Planeta p9 = new Planeta("plutaozin", 1, 0);
        
        SistemaSolar ss1 = new SistemaSolar("Sisteminha", sl, 8);
        
        ss1.addPlaneta(p1);
        ss1.addPlaneta(p2);
        ss1.addPlaneta(p3);
        ss1.addPlaneta(p4);
        ss1.addPlaneta(p5);
        ss1.addPlaneta(p6);
        ss1.addPlaneta(p7);
        ss1.addPlaneta(p8);
        ss1.addPlaneta(p9);
        ss1.mostrarPlaneta();
        
        System.out.println();
        
        
        Lua l1 = new Lua("Luazinha", 3474);
        p3.addLua(l1);
        Lua l2 = new Lua("Fobos", 22);
        Lua l3 = new Lua("Deimos", 12);
        p4.addLua(l2);
        p4.addLua(l3);
        Lua l4 = new Lua("Europa", 3121);
        Lua l5 = new Lua("Ganimedes", 5268);
        p5.addLua(l4);
        p5.addLua(l5);
        Lua l6 = new Lua("Tita", 5149);
        Lua l7 = new Lua("Encelado", 504);
        p6.addLua(l6);
        p6.addLua(l7);
        Lua l8 = new Lua("Umbriel", 1169);
        Lua l9 = new Lua("Ariel", 1157);
        p7.addLua(l8);
        p7.addLua(l9);
        Lua l10 = new Lua("Tritao", 2706);
        Lua l11 = new Lua("Talassa", 82);
        p8.addLua(l10);
        p8.addLua(l11);
        
        p3.mostrarLua();
        p8.mostrarLua();
        System.out.println();
        
        Ser ser1 = new Ser("Homo Sapiens Sapiens", "Hominideos", 800000000);
        try {
            Hino h = new Hino("Homao da porca", "Nós somos dahoras!!!", "C:\\Users\\55359\\Desktop\\aaa.txt");
            ser1.addHino(h);
            ser1.recitarHino();
            Hino h1 = new Hino("Homao da porca_2", "Nós não somos dahoras!!!", "C:\\Users\\55359\\Desktop\\aaa.txt");
            ser1.addHino(h1);
            ser1.removeHino();
            ser1.addHino(h1);
            ser1.recitarHino();
        }catch (IOException ex) {
            Logger.getLogger(LE1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        p3.addSer(ser1);
        System.out.println(p3.possuiSer());
    }
    
}

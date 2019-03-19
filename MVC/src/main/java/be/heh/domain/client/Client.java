package be.heh.domain.client;

import javax.swing.JButton;
import javax.swing.JLabel;

import be.heh.domain.controleurs.Controleur;
import be.heh.domain.modele.ModeleCompteur;
import be.heh.domain.vues.VueConsole;
import be.heh.domain.vues.VueGui;

/**
 * Client
 */
public class Client 
{
    public Client()
    {
        JButton btn1 = new JButton();
        JButton btn2 = new JButton();
        JLabel lbl = new JLabel();
        VueConsole vc = new  VueConsole();
        VueGui vg = new VueGui(btn1,btn2,lbl);
        ModeleCompteur mc = new ModeleCompteur();
        Controleur ctrl = new Controleur(mc,vg);
        vg.ajouterControleur(ctrl);
        mc.addObserv(vc);
        mc.addObserv(vg);
        mc.setCompteur(10);
        
        
    }

    
}
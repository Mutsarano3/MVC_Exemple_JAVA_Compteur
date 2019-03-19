package be.heh.domain.controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import be.heh.domain.modele.ModeleCompteur;
import be.heh.domain.vues.VueGui;

public class Controleur implements ActionListener 
{
    private ModeleCompteur m;
    private VueGui v;

    public Controleur(ModeleCompteur c,VueGui gui)
    {
        m = c;
        v = gui;
            
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        JButton btnSource =(JButton) e.getSource();
        if(btnSource.getText() == "+")
        {
            v.maj(m.IncrementeCompteur());
        }
        else if(btnSource.getText() == "-")
        {
            v.maj((m.DecrementeCompteur()));
        }
        m.notifier(m.getValeur());

    }

        

    
}
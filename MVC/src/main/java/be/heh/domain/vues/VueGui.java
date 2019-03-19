package be.heh.domain.vues;

import javax.swing.JFrame;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import be.heh.domain.controleurs.Controleur;
import be.heh.domain.observer.IObserver;

/**
 * VueGui
 */
public class VueGui extends JFrame implements IObserver
{
    private  JButton btnInc;
    private  JButton btnDec;
    private JLabel lblAffiche;
   

    public VueGui(JButton a, JButton b ,JLabel c)
    {
        btnInc = a;
        btnDec = b;
        lblAffiche = c;
        InitComposant();

    }
    

    @Override
    public void maj(int p) 
    {
       
        lblAffiche.setText(String.valueOf(p));
    }
    

    public void  ajouterControleur(Controleur ctrl)
    {
        btnInc.addActionListener(ctrl);
        btnDec.addActionListener(ctrl);        
    }
    /*public int getValeur()
    {
        return Integer.parseInt(lblAffiche.getText()) ;
    } Si je garde cette méthode et que je l'utilise dans contrôleur il y'a une latence mais ça fonctionne*/

    private void InitComposant()
    {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 300);
        JPanel pnl = new JPanel();
        this.setContentPane(pnl);
        pnl.add(btnInc);
        pnl.add(btnDec);
        pnl.add(lblAffiche);
        this.setTitle("Mon application MVC");
        this.setLocationRelativeTo(null);
        btnInc.setText("+");
        btnDec.setText("-");
        

    }

    

    
}
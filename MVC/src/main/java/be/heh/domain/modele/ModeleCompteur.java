package be.heh.domain.modele;

import java.util.ArrayList;

import be.heh.domain.observer.IObserver;
import be.heh.domain.observer.ISujet;

public class ModeleCompteur implements ISujet 
{
    private int value;
    private ArrayList<IObserver> list_Oberv = new ArrayList<>();

    @Override
    public void addObserv(IObserver obs) 
    {
        this.list_Oberv.add(obs);


    }

    @Override
    public void notifier(int p) 
    {
        for(IObserver obs : list_Oberv)
        {
            obs.maj(p);
        }

    }

    public void setCompteur(int p_value)
    {
        this.value = p_value;

    }
    public int getValeur() //Utiliser car pas de décalage lors du momement de compter
    {
        return value;
    }
    public int IncrementeCompteur()
    {
        return value++;
    }
    public int DecrementeCompteur()
    {
        return value--;
    }

    
}
package be.heh.domain.vues;

import be.heh.domain.observer.IObserver;

public class VueConsole implements IObserver 
{

    @Override
    public void maj(int p) 
    {
        System.out.println("Le compteur est a : "+p);

    }

    
}
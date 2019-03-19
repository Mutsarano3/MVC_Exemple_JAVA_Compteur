package be.heh.domain.observer;

/**
 * ISujet Interface qui va décrire de façon abstraite le modele
 */
public interface ISujet 
{
    public void addObserv(IObserver obs);
    public void notifier(int p);
    

    
}
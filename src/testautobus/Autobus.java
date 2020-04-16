
package testautobus;

import java.util.Arrays;


public class Autobus {
    boolean [] Sediste = new boolean [50]; 

    public Autobus() {
        Arrays.fill(Sediste, true);
    }
    
    public void uvozPutnika(int brojSedista){
        if (Sediste[brojSedista])
            Sediste[brojSedista] = false;
        else System.out.println("Doslo je do greske, sediste broj " + (brojSedista+1) + " je vec zauzeto.");
    }
    
    public boolean provera(){
        for(int i=0;i<50;i++)
            if (Sediste[i])
                return true;
        return false;
    }
    
    public int brojSlobodnih(){
        int br = 0;
        for(int i=0;i<50;i++)
            if(Sediste[i])
                br++;
        return br;
    }
    
    public int brojZauetih(){
        int br = 0;
        for(int i=0;i<50;i++)
            if(!Sediste[i])
                br++;
        return br;
    }
    
    public void status(){
        for (int i = 0; i < 50; i++)
            if (Sediste[i])
                System.out.println("Sediste broj "+ (i+1)+ " je slobodno.");
            else
                  System.out.println("Sediste broj "+ (i+1)+ " je zauzeto.");
    }
        
}

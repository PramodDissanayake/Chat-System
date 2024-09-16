/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.system;

/**
 *
 * @author shara
 */
public class ChatSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Observerble observerble = Observerble.getinstace();
        
        Saman saman = new Saman();
        Sunil sunil = new Sunil();
        Kamal kamal = new Kamal();
        Nimal nimal = new Nimal();
        
        saman.setVisible(true);
        sunil.setVisible(true);
        kamal.setVisible(true);
        nimal.setVisible(true);
        
        
        
        observerble.addComp(saman);
        observerble.addComp(sunil);
        observerble.addComp(kamal);
        observerble.addComp(nimal);
        
        
    }
    
}

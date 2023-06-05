import java.util.Random;


public class HigurashiGame{
    
    public static void main(String[]args) {
        

        Random random = new Random();
        
        
        Higurashi keiichi = new Higurashi("Keiichi Maebara",2000,random.nextInt(1000)+1);
        Higurashi rena = new Higurashi("Rena Ryuugu",2000,random.nextInt(1000)+1);
        // Cria dois personagens e realiza uma batalha simulada entre eles.
        
        
        while(keiichi.getPontosDeVida() >0 && rena.getPontosDeVida() >0){
            
            keiichi.atacar(rena);
            rena.atacar(keiichi);
            
            
            if(rena.getPontosDeVida()<=0 || keiichi.getPontosDeVida()<=0){break;}
        
        }
        
        
        if(rena.getPontosDeVida()>0){
            
            System.out.println(rena.getNome() + " venceu a batalha! ");
        }

        else if(keiichi.getPontosDeVida()>0){
            
            System.out.println(keiichi.getNome() + " venceu a batalha! ");
        }
        
        else{
            
            System.out.println("A batalha terminou em empate!");
        }
    }
}


import java.util.Random;


class Higurashi{

    public String nome;
    private int ataque;
    public int pontosDeVida;

    
    public Higurashi(String nome, int pontosDeVida, int ataque){
        
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.ataque = ataque;
    }

    
    void atacar(Higurashi alvo){
        
        alvo.pontosDeVida -= ataque;
    }
}


class HigurashiGame{
    public static void main(String[]args) {
        
        Random random = new Random();
        
        
        Higurashi keiichi = new Higurashi("Keiichi Maebara",2000,random.nextInt(1000)+1);
        Higurashi rena = new Higurashi("Rena Ryuugu",2000,random.nextInt(1000)+1);
        
        
        
        while(keiichi.pontosDeVida >0 && rena.pontosDeVida >0){
            
            keiichi.atacar(rena);
            rena.atacar(keiichi);
            
            
            if(rena.pontosDeVida<=0 || keiichi.pontosDeVida<=0){break;}
        
        }
        
        
        if(rena.pontosDeVida>0){
            
            System.out.println(rena.nome + " venceu a batalha! " + rena.pontosDeVida + " pontos de vida restantes!");
        }


        else if(keiichi.pontosDeVida>0){
            
            System.out.println(keiichi.nome + " venceu a batalha com " + keiichi.pontosDeVida + " pontos de vida restantes!");
        }
        
        
        else{
            
            System.out.println("A batalha terminou em empate!");
        
        }
    }
}


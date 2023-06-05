
public class Higurashi{
    
    private String nome;// Nome do personagem
    private int ataque;// Valor de ataque do personagem
    private int pontosDeVida;// Pontos de vida do personagem

    
    /**
     * Construtor da classe Higurashi.
     * 
     * @param nome         Nome do personagem
     * @param pontosDeVida Pontos de vida do personagem
     * @param ataque       Valor de ataque do personagem
     */
    public Higurashi(String nome, int pontosDeVida, int ataque){
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.ataque = ataque;
    }

    /**
     * Realiza um ataque ao personagem alvo, reduzindo seus pontos de vida.
     * 
     * @param alvo O personagem a ser atacado
     */
    public void atacar(Higurashi alvo){
        alvo.pontosDeVida -= ataque;
    }


    public String getNome(){
        return nome;// Obtém o nome do personagem.
    }


    public void setNome(String nome){
        this.nome = nome;// Define o nome do personagem.
    }


    public int getPontosDeVida(){
        return pontosDeVida;//  Obtém os pontos de vida do personagem.
    }


    public void setPontosDeVida(int pontosDeVida){
        this.pontosDeVida = pontosDeVida;// Define os pontos de vida do personagem.
    }


    public int getAtaque(){
        return ataque;// Obtém o valor de ataque do personagem.
    }


    public void setAtaque(int ataque){
        this.ataque = ataque;// Define o valor de ataque do personagem.
    }
    
}






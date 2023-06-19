public class Higurashi {
    
    private String nome; // Nome do personagem
    private int ataque; // Valor de ataque do personagem
    private int pontosDeVida; // Pontos de vida do personagem

    /**
     * Construtor da classe Higurashi.
     * 
     * @param nome         Nome do personagem
     * @param pontosDeVida Pontos de vida do personagem
     * @param ataque       Valor de ataque do personagem
     */
    public Higurashi(String nome, int pontosDeVida, int ataque) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.ataque = ataque;
    }

    /**
     * Realiza um ataque ao personagem alvo, reduzindo seus pontos de vida.
     * 
     * @param alvo O personagem a ser atacado
     */
    public void atacar(Higurashi alvo) {
        alvo.pontosDeVida -= ataque;
    }

    /**
     * Obtém o nome do personagem.
     * 
     * @return O nome do personagem
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém os pontos de vida do personagem.
     * 
     * @return Os pontos de vida do personagem
     */
    public int getPontosDeVida() {
        return pontosDeVida;
    }

    /**
     * Obtém o valor de ataque do personagem.
     * 
     * @return O valor de ataque do personagem
     */
    public int getAtaque() {
        return ataque;
    }
    
}

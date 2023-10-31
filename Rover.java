public class Rover {

    public static final int LARGURA = 20;
    public static final int COMPRIMENTO = 20;

    private Mapa mapa;
    private  int posicaoX;
    private  int posicaoY;
    private int velocidadeX;
    private int velocidadeY;
    private  int pontuacao;
    private int compartimentoTamanho;
    private ArrayList<Tesouro> compartimento;

    public Rover(Mapa mapa, int velocidadeX, int velocidadeY, int compartimentoTamanho) {
        this.mapa       = mapa;
        this.pontuacao = 0;
       // this.posicaoX   = posicaoX;
       // this.posicaoY   = posicaoY;
        this.posicioanrRoboNoMapa(mapa);
        this.velocidadeX = velocidadeX;
        this.velocidadeY = velocidadeY;
        this.compartimentoTamanho = compartimentoTamanho;
    }
    public boolean posicioanrRoboNoMapa(Mapa mapa){
        //TODO
        return  false;
    }
    public  boolean adicionarTesouro(){
        return false;
    }
    public int pontuacao(){
        //TODO
        return -1;
    }
    public boolean movimentar(int direcao){
        //TODO
        return false;
    }

}

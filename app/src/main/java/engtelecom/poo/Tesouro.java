package engtelecom.poo;

public class Tesouro {
    public static final int LARGURA = 10;
    public static final int ALTURA  = 10;
    private  int posicaoX;
    private  int posicaoY;
    private int valor;

    public Tesouro(int posicaoX, int posicaoY, int pontos) {
        this.posicaoX   = posicaoX;
        this.posicaoY   = posicaoY;
        this.valor      = pontos;
    }

    public int getPosicaoX()    {return this.posicaoX;}

    public int getPosicaoY()    {return this.posicaoY;}

    public int getValor()       {return this.valor;   }
}
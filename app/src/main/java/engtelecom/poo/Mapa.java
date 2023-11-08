package engtelecom.poo;

import java.util.ArrayList;
import java.util.Random;

public class Mapa {
    private static final int ZERO = 0;
    private  int larguraMap;
    private  int alturaMap;
    private  int totalDeTesouros;
    private  ArrayList<Tesouro> tesouros;

    public Mapa(int largura, int altura, int totalDeTesouros) {
        this.larguraMap = largura;
        this.alturaMap = altura;
        this.totalDeTesouros = totalDeTesouros;
        this.tesouros = new ArrayList<>();
        this.posicionaTesouros();
    }
    public boolean posicionaTesouros(){

        for (int i= 0; i < totalDeTesouros; i++){
            Tesouro tesouro = new Tesouro(ZERO,ZERO,ZERO);
            int x, y;
            Random geraAleatorioEntre = new Random();

            do {
                //garante que sorteará uma número par que os tesouros fiquem completamente dentro do mapa
                x = geraAleatorioEntre.nextInt(this.larguraMap - tesouro.getLarguraTesouro());
                y = geraAleatorioEntre.nextInt(this.alturaMap  - tesouro.getAlturaTesouro() );
            }while(detectaSobreposicao(x,y,tesouro.getLarguraTesouro(),tesouro.getAlturaTesouro()));

            tesouro = new Tesouro(x,y,10);
            this.tesouros.add(tesouro);
        }
        return false;
    }

    private boolean detectaSobreposicao(int x, int y, int larguraTesouro, int alturaTesouro){
        if(this.tesouros.isEmpty()) { return  false; };
        for (Tesouro tesouro: this.tesouros) {
            int     xMin = tesouro.getPosicaoX(),
                    xMax = tesouro.getPosicaoY() + tesouro.getLarguraTesouro(),
                    yMin = tesouro.getPosicaoX(),
                    yMax = tesouro.getPosicaoY() + tesouro.getAlturaTesouro() ,
                    xLargura = x + tesouro.getLarguraTesouro(),
                    yAltura  = y + tesouro.getAlturaTesouro() ;
            boolean interseccaoDireita  =   x >= xMin && xMax >= x  &&              //
                                            y >= yMin && yMax >= y,
                    interseccaoEsquerda =   xLargura > xMin && xMax < xLargura    &&
                                            yAltura > yMin && yMax < yAltura;
            if(  interseccaoEsquerda    ||  interseccaoDireita   ){ return  true;}
        }
        return false;
    }


    public Tesouro coletarTesouro(int x,int y){
        //TODO coletarTesouro
        return null;
    }

    public int getLarguraMapa()     { return larguraMap; }
    public int getAlturaMapa()      { return alturaMap;  }
    public int getTotalDeTesouros() { return totalDeTesouros;
    }
}

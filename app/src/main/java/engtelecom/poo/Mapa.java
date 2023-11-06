package engtelecom.poo;

import java.util.ArrayList;

public class Mapa {

    private  int largura ;
    private  int altura ;
    private  int totalDeTesouros;
    private  ArrayList<Tesouro> tesouros;

    public Mapa(int largura, int altura, int totalDeTesouros) {
        this.largura = largura;
        this.altura = altura;
        this.totalDeTesouros = totalDeTesouros;
        this.tesouros = new ArrayList<>();
        this.posicionaTesouros();
    }
    public boolean posicionaTesouros(){
        //TODO posicionarTesouros
        return false;
    }
    public Tesouro coletarTesouro(int x,int y){
        //TODO coletarTesouro
        return null;
    }
    public int getLargura() {
        return largura;
    }
    public int getAltura() {
        return altura;
    }
    public int getTotalDeTesouros() {
        return totalDeTesouros;
    }
}

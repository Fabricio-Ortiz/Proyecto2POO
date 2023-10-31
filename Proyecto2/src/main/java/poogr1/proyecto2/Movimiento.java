package poogr1.proyecto2;

public class Movimiento {
    private int valorCelda;
    private String posicionCelda;
    
    public Movimiento(int pValorCelda, String pPosicionCelda){
        setValorCelda(pValorCelda);
        setPosicionCelda(pPosicionCelda);
    }
    
    public void setValorCelda(int pValorCelda){
        valorCelda = pValorCelda;
    }
    
    public void setPosicionCelda(String pPosicionCelda){
        posicionCelda = pPosicionCelda;
    }
    
    public int getValorCelda(){
        return valorCelda;
    }
    
    public String getPosicionCelda(){
        return posicionCelda;
    }
}

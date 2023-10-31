package poogr1.proyecto2;

import java.util.ArrayList;
import java.util.List;

public class MovimientosHechos {
    private List<Movimiento> movimientos;
    
    public MovimientosHechos(){
        movimientos = new ArrayList();
    }
    
    public void agregarMovimiento(Movimiento pMovimiento){
        movimientos.add(pMovimiento);
    }
    
    public int buscarMovimiento(int pValorCelda, String pPosicionCelda){
        int indice = 0;
        for (Movimiento ind:movimientos){
            if(ind.getPosicionCelda().equals(pPosicionCelda) && ind.getValorCelda() == pValorCelda){
                return indice;
            }
            indice ++;
        }
        return -1;
    }
    
    public Movimiento deshacerJugada(){
        Movimiento movimientoBorrado = movimientos.get(0);
        movimientos.remove(0);
        return movimientoBorrado;
    }
    
    public Movimiento borrarJugada(Movimiento pMovimientoaBorrar){
        int movimientoABorrar= buscarMovimiento(pMovimientoaBorrar.getValorCelda(), pMovimientoaBorrar.getPosicionCelda());
        Movimiento movimientoBorrado = movimientos.get(movimientoABorrar);
        movimientos.remove(movimientoABorrar);
        return movimientoBorrado;
    }
}

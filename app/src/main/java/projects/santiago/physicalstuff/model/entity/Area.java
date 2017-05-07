package projects.santiago.physicalstuff.model.entity;

import java.math.BigDecimal;

/**
 * Created by santiago on 06/05/17.
 */

public class Area {
    private BigDecimal valor;
    private ULongitud unidad;

    public Area(BigDecimal valor, ULongitud unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public Area() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public ULongitud getUnidad() {
        return unidad;
    }

    public void setUnidad(ULongitud unidad) {
        this.unidad = unidad;
    }

    public String getUnidadAsString() {
        return unidad.getSimbolo() + "^2";
    }
}

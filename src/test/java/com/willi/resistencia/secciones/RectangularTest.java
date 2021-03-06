package com.willi.resistencia.secciones;

import com.willi.resistencia.exceptions.VigaConLargoIndefinidoException;
import org.junit.Assert;
import org.junit.Test;

public class RectangularTest {

    @Test
    public void area_de_la_viga_de_10_x_10_deberia_devolver_100() {
        Rectangular vigaRectangular = new Rectangular(10f, 10f, 40f, 0, 0);
        float realArea = vigaRectangular.getArea();
        float expectedArea = 100f;
        Assert.assertEquals(expectedArea, realArea, 0.1);
    }

    @Test(expected = VigaConLargoIndefinidoException.class)
    public void largo_de_viga_negativo_deberia_tirar_un_error() {
        Rectangular vigaRectangular = new Rectangular(10f, 10f, -5f, 0, 0);
    }

    // me gustaría que hagas el test para que cuando creo una viga de dimensiones negativas
    // no me deje crearla, es decir, lance una excepción
    // Para testear que un método lance una excepción, tenes que hacer algo como
    // @Test(expected = ExceptionQueVasALanzar.class)
    // public void tu_test(){
    //  ... tu codigo ...
    // }
}
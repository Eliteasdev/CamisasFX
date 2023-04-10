import fes.ico.camisasfx.helpers.Descuentos;
import fes.ico.camisasfx.helpers.Operaciones;
import fes.ico.camisasfx.helpers.Tipos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CamisasFXTesting {

    @Test
    @DisplayName("Test de la clase Enum [Descuentos]")
    public void testTipos() {
        //Este metodo comprueba que los Descuentos sean los establecidos en los requerimientos
        int[] limites = {2, 5, -1};
        // Se pone -1 porque es de 5 en adelante; si existiera un limite para aplicar este descuento estaria indicado en el tercer limite
        float[] porcentajesDescuento = {0.0f, 0.05f, 0.08f};


        int index = 0;
        for (Descuentos descuento : Descuentos.values()) {
            //Comprobacion de limites
            Assertions.assertEquals(limites[index], descuento.getLimite());
            //Comprobacion de porcentajes a descontar
            Assertions.assertEquals(porcentajesDescuento[index], descuento.getDescuento());
            index++;
        }


    }

    @Test
    @DisplayName("Test del metodo 'calcularPrecioDeLista' de la clase helper [Operaciones]")
    public void testCalcularPrecioDeLista() {
        for (Tipos tipo : Tipos.values()) {
            for (int nCamisas = 1; nCamisas <= 1000; nCamisas++) {
                float valorEsperado = nCamisas * tipo.getPrecio();
                Assertions.assertEquals(valorEsperado, Float.parseFloat(Operaciones.calcularPrecioDeLista(nCamisas, tipo.getPrecio())));
            }
        }
    }

    @Test
    @DisplayName("Test del metodo 'calcularDescuento' de la clase helper [Operaciones]")
    public void testCalcularDescuento() {
        float valorEsperado;
        for (Tipos tipo : Tipos.values()) {
            for (int nCamisas = 1; nCamisas <= 1000; nCamisas++) {
                if (nCamisas <= Descuentos.HASTA.getLimite()) {
                    valorEsperado = tipo.getPrecio() * nCamisas * Descuentos.HASTA.getDescuento();
                } else if (nCamisas <= Descuentos.ENTRE.getLimite()) {
                    valorEsperado = tipo.getPrecio() * nCamisas * Descuentos.ENTRE.getDescuento();
                } else {
                    valorEsperado = tipo.getPrecio() * nCamisas * Descuentos.MASDE.getDescuento();
                }
                Assertions.assertEquals(valorEsperado, Float.parseFloat(Operaciones.calcularDescuento(nCamisas, tipo.getPrecio())));
            }
        }
    }

    @Test
    @DisplayName("Test del metodo 'calcularPrecioFinal' de la clase helper [Operaciones]")
    public void testCalcularPrecioFinal() {
        float valorEsperado;
        float descuento;
        float precioLista;
        for (Tipos tipo : Tipos.values()) {
            for (int nCamisas = 1; nCamisas <= 1000; nCamisas++) {
                precioLista = nCamisas * tipo.getPrecio();
                if (nCamisas <= Descuentos.HASTA.getLimite()) {
                    valorEsperado = precioLista - tipo.getPrecio() * nCamisas * Descuentos.HASTA.getDescuento();
                } else if (nCamisas <= Descuentos.ENTRE.getLimite()) {
                    valorEsperado = precioLista - tipo.getPrecio() * nCamisas * Descuentos.ENTRE.getDescuento();
                } else {
                    valorEsperado = precioLista - tipo.getPrecio() * nCamisas * Descuentos.MASDE.getDescuento();
                }
                Assertions.assertEquals(valorEsperado, Float.parseFloat(Operaciones.calcularPrecioFinal(nCamisas, tipo.getPrecio())));
            }
        }
    }


}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosTest {

    @Test
    void sumaTest() {
        int numero1 = 4;
        int numero2 = 6;
        int total = Ejercicios.suma(numero1, numero2);
        assertEquals(10,total);
    }

    @Test
    void esNumeroCapicuaTest() {
        int numero = 1221;
        boolean esCapicua = Ejercicios.esNumeroCapicua(numero);
        assertTrue(esCapicua);
    }

    @Test
    void esPalabraCapicuaTest() {
        String palabra = "neuquen";
        boolean esCapicua = Ejercicios.esPalabraCapicua(palabra);
        assertTrue(esCapicua);
    }

    @Test
    void esParTest() {
        int numero = 27438;
        boolean esPar = Ejercicios.esPar(numero);
        assertTrue(esPar);
    }

    @Test
    void esPrimoTest() {
        int numeroPrimo = 859;
        boolean esPrimo = Ejercicios.esPrimo(numeroPrimo);
        assertTrue(esPrimo);
    }

    @Test
    void contarCantidadDeAparicionesDelNumeroEnArrayTest() {
        int numero = 5;
        int array[] = {8,5,4,5,5,4,7,6,8};
        int cantidadDeApariciones = Ejercicios.contarCantidadDeAparicionesDelNumeroEnArray(numero,array);
        assertEquals(3,cantidadDeApariciones);
    }
    @Test
    void contarCantidadDeAparicionesDeLaPalabraEnListTest() {
        String palabra = "covid";
        List<String> palabras = new ArrayList<>();
        palabras.add("dengue");
        palabras.add("covid");
        palabras.add("gripe");
        palabras.add("covid");
        palabras.add("dengue");
        palabras.add("dengue");
        int cantidadDeApariciones = Ejercicios.contarCantidadDeAparicionesDeLaPalabraEnList(palabra,palabras);
        assertEquals(2,cantidadDeApariciones);
    }

    @Test
    void funcionExtrañaTest() {
        assertThrows(Exception.class, () -> Ejercicios.funcionExtraña(100));
    }

    @Test
    void ordenarListaTest() {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(20);
        lista.add(1);
        lista.add(3);
        lista.add(34);
        lista.add(25);
        List<Integer> listaOrdenada = lista.stream().sorted().collect(Collectors.toList());
        lista = Ejercicios.ordenarLista(lista);
        assertEquals(listaOrdenada, lista);
    }

    @Test
    void obtenerElMayorDeLaListaTest() {
        List<Integer> lista = new ArrayList<>();
        lista.add(44);
        lista.add(25);
        lista.add(12);
        lista.add(4);
        lista.add(55);
        lista.add(25);
        int numeroMayor = Ejercicios.obtenerElMayorDeLaLista(lista);
        assertEquals(55, numeroMayor);
    }

    @Test
    void sonAnagramasTest() {
        String palabra1 = "amor";
        String palabra2 = "roma";
        boolean sonAnagramas = Ejercicios.sonAnagramas(palabra1,palabra2);
        assertTrue(sonAnagramas);
    }

}
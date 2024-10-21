package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import main.Estudiante;

public class EstudianteTest {
    private static Estudiante estudiante;

    @BeforeAll
    public static void beforeAll() {
        estudiante = new Estudiante("Rafa", 18);
        List<Double> calificaciones = new ArrayList<>();
        double cal1 = 6.8, cal2 = 7.9, cal3 = 4.5;
        calificaciones.add(cal1);
        calificaciones.add(cal2);
        calificaciones.add(cal3);
        estudiante.setCalificaciones(calificaciones);
        System.out.println("Iniciar pruebas unitarias");
    }
    
    @Test
    public void obtenerPromedioTest() {
        double promedioEsperado = (6.8 + 7.9 + 4.5) / 3;
        assertEquals(6.925, estudiante.obtenerPromedio(), 0.001);
        System.out.println("obtenerPromedioTest()");
    }

    @Test
    public void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        assertEquals(4, estudiante.getNumeroCalificaciones());
        System.out.println("agregarCalificacionTest()");
    }

    @Test
    public void getNumeroCalificacionesTest() {
        assertEquals(3, estudiante.getNumeroCalificaciones());
        System.out.println("getNumeroCalificacionesTest()");
    }

    @Test
    public void agregarCalificacionExcepcionTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(11.0);
        });

        assertEquals("La calificacion debe estar entre 0 y 10.", exception.getMessage());
        System.out.println("agregarCalificacionExcepcionTest()");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Finalizan pruebas unitarias");
    }
}

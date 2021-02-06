package edu.escuelaing.arem.calculo;

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import edu.escuelaing.arem.linkedList.Lista;

import static org.junit.Assert.*;


public class CalculadoraTest {

	 public CalculadoraTest() {
	    }
	    
	    @BeforeClass
	    public static void setUpClass() {
	    }
	    
	    @AfterClass
	    public static void tearDownClass() {
	    }
	    
	    @Before
	    public void setUp() {
	    }
	    
	    @After
	    public void tearDown() {
	    }

	    /**
	     * prueba para el calculo de la meedia
	     */
	    @org.junit.Test
	    public void testCalcularMedia() {
	        Lista lista = new Lista();
	        lista.add(160.0);
	        lista.add(591.0);
	        lista.add(114.0);
	        lista.add(229.0);
	        lista.add(230.0);
	        lista.add(270.0);
	        lista.add(128.0);
	        lista.add(1657.0);
	        lista.add(624.0);
	        lista.add(1503.0);
	        Double respuesta = 550.6;
	        Double calculo = Calculadora.media(lista);
	        assertEquals(respuesta, calculo, 550.6);
	    }
	    /**
	     * prueba para el calculo de la meedia 2
	     */
	    @org.junit.Test
	    public void testCalcularMedia2() {
	        Lista lista = new Lista();
	        lista.add(160.0);
	        lista.add(591.0);
	        lista.add(114.0);
	        lista.add(229.0);
	        Double respuesta = 273.5;
	        Double calculo = Calculadora.media(lista);
	        assertEquals(respuesta, calculo);
	    }
	    
	    
	    /**
	     * prueba para el calculo de la desviacion estandar
	     */
	    @org.junit.Test
	    public void testCalcularDesviacion() {
	        Lista lista = new Lista();
	        lista.add(160.0);
	        lista.add(591.0);
	        lista.add(114.0);
	        lista.add(229.0);
	        lista.add(230.0);
	        lista.add(270.0);
	        lista.add(128.0);
	        lista.add(1657.0);
	        lista.add(624.0);
	        lista.add(1503.0);
	        Double respuesta = 572.03;
	        Double calculo = Calculadora.desviacion(lista);
	        assertEquals(respuesta, calculo, 572.03);
	    }
	
}


package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSumar(){
    	Calculadora c = new Calculadora();
    	int resultado =c.sumar(5,11);
        assertTrue(resultado==16);
    }
    @Test
    public void Restar(){
    	Calculadora c = new Calculadora();
    	int resultado =c.restar(5,1);
        assertTrue(resultado==4);
    }
    
}

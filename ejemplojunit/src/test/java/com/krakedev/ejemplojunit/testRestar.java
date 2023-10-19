package com.krakedev.ejemplojunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testRestar {

	@Test
    public void Restar(){
    	Calculadora c = new Calculadora();
    	int resultado =c.restar(5,1);
        assertTrue(resultado==4);
    }
}

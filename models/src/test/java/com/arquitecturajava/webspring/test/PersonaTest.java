package com.arquitecturajava.webspring.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.arquitecturajava.spring.models.Persona;

class PersonaTest {

	@Test
	void mayorEdadtest() {
		//AAA
		
		//arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadtest2() {
		//AAA
		
		//arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadtest3() {
		//AAA
		
		//arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadtest4() {
		//AAA
		
		//arrange preparar
		Persona p = new Persona("pepe", 20);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}
	
	@Test
	void mayorEdadtest5() {
		//AAA
		
		//arrange preparar
		Persona p = new Persona("pepe", 10);
		boolean esMayor = p.esMayorEdad();
		assertTrue(esMayor);
	}

}

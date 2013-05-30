package com.corejsf;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Planets implements Serializable {

	private static final long serialVersionUID = 1L;

	public String[] getNames() {
		return new String[] { 
				"Mercury", "Venus", "Earth", "Mars", "Jupiter",
				"Saturn", "Uranus", "Neptune", "Pluto" };
	}

	public double[] getValues() {
		return new double[] { 
				3100, 7500, 8000, 4200, 88000, 71000, 32000,
				30600, 1430 };
	}

}

package Exercises;
import java.util.Arrays;
import java.util.ArrayList;

public class Methods {
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void add(String Name, int Alumnos) {
		System.out.println("Materia: "+ Name +" Alumnos: "+ Alumnos );
	}
	public void add(String Name) {
		System.out.println("Materia: "+ Name);
	}
	
}

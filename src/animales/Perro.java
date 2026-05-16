/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import java.util.Objects;

public class Perro extends Animal {
    
    private String raza;
    /**
     * Constructor para crear una nueva instancia de Perro.
     * * @param codigo         El código de identificación único del perro. Debe empezar por 'p'.
     * @param fechaNacimiento  La fecha de nacimiento del perro.
     * @param sexo             El sexo del perro ('H' para hembra, 'M' para macho).
     * @param peso             El peso del perro en kilogramos.
     * @param raza             La raza del perro. No puede estar vacía.
     * @throws                 IllegalArgumentException Si el código no empieza por 'p' o si la raza está vacía.
     */
    public Perro(String codigo, String fechaNacimiento, char sexo, double peso, String raza) throws IllegalArgumentException {
        super(codigo, fechaNacimiento, sexo, peso);
        if ((!codigo.matches("p.*")) || ("".equals(raza))) {
            throw new IllegalArgumentException();
        } else {
            this.codigo = codigo;
            this.raza = raza;
        }
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        if ("".equals(codigo)) {
            throw new IllegalArgumentException();
        } else {
            this.raza = raza;
        }
    }
    
    @Override
    public void setCodigo(String codigo) throws IllegalArgumentException {
        if (!codigo.matches("p.*")) {
            throw new IllegalArgumentException();
        } else {
            super.setCodigo(codigo);
        }
    }
    
    public String pasear() {
        return "Me encanta que me saquen a pasear";
    }

    @Override
    public String hacerSonido() {
        return "Guau";
    }

    @Override
    public String alegrarse() {
        return "Salto de alegria y muevo la cola";
    }

    @Override
    public String enfadarse() {
        return "Grunio y ensenio los dientes";
    }

    @Override
    public String queSoy() {
        return "Soy un perro";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.raza) + super.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        if (!super.equals(obj)) {
            return false;
        }
        
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Perro{" + super.toString() + "raza=" + raza + '}';
    }
    
}

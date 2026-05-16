/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import java.util.Objects;

/**
 *
 * @author AulaVirtual
 */
public class Gato extends Animal{
    
    private String raza;
    
    /**
     * Constructor para crear una nueva instancia de Gato.
     * * @param codigo         El código de identificación único del gato. Debe empezar por 'g'.
     * @param fechaNacimiento  La fecha de nacimiento del gato.
     * @param sexo             El sexo del gato ('H' para hembra, 'M' para macho).
     * @param peso             El peso del gato en kilogramos.
     * @param raza             La raza del gato. No puede estar vacía.
     * @throws                 IllegalArgumentException Si el código no empieza por 'g' o si la raza está vacía.
     */
    public Gato(String codigo, String fechaNacimiento, char sexo, double peso, String raza) throws IllegalArgumentException {
        super(codigo, fechaNacimiento, sexo, peso);
        if ((!codigo.matches("g.*")) || ("".equals(raza))) {
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
        if (!codigo.matches("g.*")) {
            throw new IllegalArgumentException();
        } else {
            super.setCodigo(codigo);
        }
    }

    public String cazar() {
        return "Me encanta cazar animalejos";
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public String alegrarse() {
        return "Ronroneo y me froto contra tus piernas";
    }

    @Override
    public String enfadarse() {
        return "Me bufo y saco las uñas";
    }

    @Override
    public String queSoy() {
        return "Soy un gato";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.raza) + super.hashCode();
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
        
        final Gato other = (Gato) obj;
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Gato{" + super.toString() + "raza=" + raza + '}';
    }
}

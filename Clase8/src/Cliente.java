public class Cliente {
    private String nombre;
    private Integer edad;

    public Cliente(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + '\'' +", edad=" + edad + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }



}

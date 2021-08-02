package dominio;

/**
 *
 * @author Chalán Dilan ; Quishpi Jordan
 */
public abstract class Animal extends SerVivo {

    private String nombreA;

    public void setNombre(String nombreA) {
        this.nombreA = nombreA;

    }

    public String getNombre() {
        return this.nombreA;
    }
}

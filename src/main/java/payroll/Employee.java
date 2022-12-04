package payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
class Employee {

    private @Id
    @GeneratedValue Long id;
    private String nomeProprio;
    private String cognome;
    private String ruolo;

    Employee() {
    }

    Employee(String nomeProprio, String cognome, String ruolo) {
        this.nomeProprio = nomeProprio;
        this.cognome = cognome;
        this.ruolo = ruolo;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nomeProprio + " " + this.cognome;
    }

    public void setNome(String nome) {

        String[] parts = nome.split(" ");
        this.nomeProprio = parts[0];
        this.cognome = parts[1];
    }

    public String getNomeProprio() {
        return nomeProprio;
    }

    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.nomeProprio, employee.nomeProprio) &&
                Objects.equals(this.cognome, employee.cognome) && Objects.equals(this.ruolo, employee.ruolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nomeProprio, this.cognome, this.ruolo);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nomeProprio='" + nomeProprio + '\'' +
                ", cognome='" + cognome + '\'' +
                ", ruolo='" + ruolo + '\'' +
                '}';
    }
}

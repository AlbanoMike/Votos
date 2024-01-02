import java.util.Objects;

public class Votes {

    private String nome;
    private Integer total;

    public Votes(String nome, Integer total) {
        this.nome = nome;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Votes votes = (Votes) o;
        return Objects.equals(nome, votes.nome) && Objects.equals(total, votes.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }


    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", total=" + total;
    }
}

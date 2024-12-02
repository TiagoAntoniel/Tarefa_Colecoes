package sexoENome;

public class Pessoas implements Comparable<Pessoas> {
    private String nome1;
    private String sexo;

    public Pessoas(String nome1, String sexo) {
        this.nome1 = nome1;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome1;
    }

    public void setNome(String nome1) {
        this.nome1 = nome1;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int compareTo(Pessoas pessoas) {
        return this.sexo.compareTo(pessoas.getSexo());
    }

    @Override
    public String toString() {
        return "Nome: "
                + nome1
                +" Sexo: "
                +sexo;
    }
}

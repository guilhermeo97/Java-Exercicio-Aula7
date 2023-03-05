public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica guilherme = new PessoaFisica("Guilherme", "Oliveira", "Homem", "Casado", 25, 95074554, 65888312266);

    }
}

class PessoaFisica {
    private String nome, ultimoNome, genero, estadoCivil;
    private int idade, cep;
    private long cpf;
    

    public PessoaFisica(String nome, String ultimoNome, String genero, String estadoCivil, int idade, int cep,
            long cpf) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.idade = idade;
        this.cep = cep;
        this.cpf = cpf;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUltimoNome() {
        return ultimoNome;
    }
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ultimoNome == null) ? 0 : ultimoNome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((estadoCivil == null) ? 0 : estadoCivil.hashCode());
        result = prime * result + idade;
        result = prime * result + cep;
        result = prime * result + (int) (cpf ^ (cpf >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PessoaFisica other = (PessoaFisica) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ultimoNome == null) {
            if (other.ultimoNome != null)
                return false;
        } else if (!ultimoNome.equals(other.ultimoNome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (estadoCivil == null) {
            if (other.estadoCivil != null)
                return false;
        } else if (!estadoCivil.equals(other.estadoCivil))
            return false;
        if (idade != other.idade)
            return false;
        if (cep != other.cep)
            return false;
        if (cpf != other.cpf)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "PessoaFisica [nome=" + nome + ", ultimoNome=" + ultimoNome + ", genero=" + genero + ", estadoCivil="
                + estadoCivil + ", idade=" + idade + ", cep=" + cep + ", cpf=" + cpf + "]";
    }
}
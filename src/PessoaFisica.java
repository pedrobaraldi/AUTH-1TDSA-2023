import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private Collection<Pessoa> filhos = new Vector<>();

    public PessoaFisica addFilho(Pessoa filho) {
        this.filhos.add(filho);
        return this;
    }

    public PessoaFisica removeFilho(Pessoa filho) {
        this.filhos.remove(filho);
        return this;
    }

    public  Collection<Pessoa> getFilhos(){
        return Collections.unmodifiableCollection(this.filhos);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }

    public PessoaFisica(long id, String nome, LocalDate nascimento, String cpf, Collection<Pessoa> filhos) {
        super(id, nome, nascimento);
        this.cpf = cpf;
        this.filhos = filhos;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", filhos=" + filhos +
                "} " + super.toString();
    }
}

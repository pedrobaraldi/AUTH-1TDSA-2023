import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    private Collection<Pessoa> socios = new Vector<>();

    public PessoaJuridica addSocio(Pessoa socio){
        this.socios.add(socio);
        return this;
    }
    public PessoaJuridica removeSocio(Pessoa socio){
        this.socios.remove(socio);
        return this;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {
    }

    public PessoaJuridica(long id, String nome, LocalDate nascimento, String cnpj, Collection<Pessoa> socios) {
        super(id, nome, nascimento);
        this.cnpj = cnpj;
        this.socios = socios;
    }

    public Collection<Pessoa> getSocios(){
        return Collections.unmodifiableCollection(this.socios);
    }
    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", socios=" + socios +
                "} " + super.toString();
    }
}

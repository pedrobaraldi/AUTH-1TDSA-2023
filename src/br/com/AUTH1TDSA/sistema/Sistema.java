package br.com.AUTH1TDSA.sistema;

import br.com.AUTH1TDSA.pessoa.model.Pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Sistema {

    private Long id;
    private String nome;
    private String sigla;

    private Collection<Pessoa> responsaveis = new Vector<>();

    public Sistema() {
    }

    public Sistema(Long id, String nome, String sigla, Collection<Pessoa> responsaveis) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
        this.responsaveis = responsaveis;
    }

    public Sistema addResponsavel(Pessoa responsavel){
        this.responsaveis.add(responsavel);
        return this;
    }
    public Sistema removeResponsavel(Pessoa responsavel){
        this.responsaveis.remove(responsavel);
        return this;
    }

    public Collection<Pessoa> getResponsavel(){
        return Collections.unmodifiableCollection(this.responsaveis);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


    @Override
    public String toString() {
        return "Sistema{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", responsaveis=" + responsaveis +
                '}';
    }
}

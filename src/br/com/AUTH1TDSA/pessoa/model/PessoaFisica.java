package br.com.AUTH1TDSA.pessoa.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class PessoaFisica extends Pessoa {

    private String cpf;
    private Collection<PessoaFisica> filhos = new Vector<>();

    public PessoaFisica addFilho(PessoaFisica filho) {
        this.filhos.add(filho);
        return this;
    }

    public PessoaFisica removeFilho(PessoaFisica filho) {
        this.filhos.remove(filho);
        return this;
    }

    public  Collection<Pessoa> getFilhos(){return Collections.unmodifiableCollection(this.filhos);
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica() {
    }

    public PessoaFisica(long id, String nome, LocalDate nascimento, String cpf, Collection<PessoaFisica> filhos) {
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
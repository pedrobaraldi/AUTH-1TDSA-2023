import br.com.AUTH1TDSA.model.Profile;
import br.com.AUTH1TDSA.model.Role;
import br.com.AUTH1TDSA.model.User;
import br.com.AUTH1TDSA.pessoa.model.Pessoa;
import br.com.AUTH1TDSA.pessoa.model.PessoaFisica;
import br.com.AUTH1TDSA.pessoa.model.PessoaJuridica;
import br.com.AUTH1TDSA.sistema.Sistema;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Objects;

public class Main {

    public static PessoaFisica novaPessoa(Long id,String nome, LocalDate nascimento, String cpf) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome(nome);
        pf.setCpf(cpf);
        pf.setId(id);
        pf.setNascimento(nascimento);
        return pf;
    }
    public static PessoaJuridica novaPessoaJuridica (Long id,String nome, LocalDate nascimento, String cnpj) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome(nome);
        pj.setNascimento(nascimento);
        pj.setId(id);
        pj.setCnpj(cnpj);
        return pj;
    }

    public static User novoUsuario(Long id, String email, String password, Pessoa pessoa) {
        User lg = new User();
        lg.setPessoa(pessoa);
        lg.setId(id);
        lg.setEmail(email);
        lg.setPassword(password);
        return lg;
    }

    public static Profile novoProfile(Long id, String nome){
        Profile profile = new Profile();
        profile.setId(id);
        profile.setNome(nome);
        return profile;
    }

    public static Role novaRole(Long id, String nome, String descricao, Sistema sistema){
        Role rl = new Role();
        rl.setId(id);
        rl.setNome(nome);
        rl.setDescricao(descricao);
        return rl;
    }

    public static Sistema novoSistema(Long id,String nome, String sigla){
        Sistema sist = new Sistema();
        sist.setId(id);
        sist.setNome(nome);
        sist.setSigla(sigla);
        return sist;
    }



    public static void main(String[] args) {
        PessoaFisica pedro= novaPessoa(1234L,"Pedro",LocalDate.of(2004,5,24),"12345678910");
        PessoaJuridica holding = novaPessoaJuridica(1234L,"Holding",LocalDate.of(2023,1,19),"123456");
        User pedro24 = novoUsuario(12345L,"pedrobaraldi02@gmail.com","24052005",pedro);
        Profile gerente = novoProfile(4444L,"Pedro");
        Sistema mercado = novoSistema(55555L,"NoX","NX");
        Role gerenciaMercado = novaRole(4424L,"Pedro","Gerencia o mercado", mercado);

        PessoaFisica Pedrojr = novaPessoa(732L,"Pedro Junior", LocalDate.of(2023,8,15),"654321");

        pedro.addFilho(Pedrojr);
        holding.addSocio(pedro);
        pedro24.addProfile(gerente);
        gerente.addRole(gerenciaMercado);
        mercado.addResponsavel(pedro);


        var login = JOptionPane.showInputDialog("Digite seu email: ");
        var senha = JOptionPane.showInputDialog("Digite sua senha: ");

        if ( Objects.equals(login,pedro24.getEmail()) && Objects.equals(senha,pedro24.getPassword())){
            System.out.println("Você logou!!");
        } else {
            System.out.println("Email ou senha incorretos Falha no login!");
        }
    }




}
# Autentica Benezinho 🤓👍🏾

| ![](documentos/fiap.jpg)                 | **Domain Driven Design** |
|------------------------------------------|-------------------------------|
| **ALUNO:**                               | **TURMA:** 1TDSA              |
| **PROFESSOR:** Benefrancis do Nascimento | 18/05/2023                    |
| **SIMULADO PARA O CHECK POINT II**       | **NÃO VALE PONTOS**           |

# Sumário


[Estudo de caso ](#_Estudo_de_caso)

[O que deverá ser feito? ](#_O_que_devera_ser_feito)

[Diagrama de Classes ](#_Diagrama_de_Classes)

[Correção da Prova ](#_Correcao)

<a id="_Estudo_de_caso"></a>

# Estudo de caso

A Holding Benezinho ![](RackMultipart20230518-1-gnovuy_html_5188b812c34f88e5.png) expandiu muito o seu portifólio de sistemas gerenciados, para prover maior segurança ao acesso dos diversos sistemas da Holding, os arquitetos de software propuseram o desenvolvendo de um sistema para o gerenciamento de permissões dos sistemas empresariais da Holding Benezinho.

Contratamos você como Engenheiro de Software para ajudar a construir esse sistema.

Na sprint atual, você foi incumbido de fazer:

1. As classes conforme o DIAGRAMA DE CLASSES abaixo

<a id="_O_que_devera_ser_feito"></a>

# O que deverá ser feito?
**Você deverá:**

1. **(1,5 Pontos)** Criar corretamente a classe **Profile**.

Lembre-se de encapsular os campos, criar o toString e criar dois construtores sendo:

1º Com todos os atributos;

2º Sem receber os atributos;

3º Há uma coleção de Roles na classe Profile. Encapsule essa coleção.

1. **(1 Ponto)** Criar corretamente a classe **Role**.

Lembre-se de encapsular os campos, criar o toString e criar dois construtores sendo:

1º Com todos os atributos;

2º Sem receber os atributos;

1. **(2 Pontos)** Criar corretamente a classe **User**.

Lembre-se de encapsular os campos, criar o toString e criar dois construtores sendo:

1º Com todos os atributos;

2º Sem receber os atributos;

3º Há uma coleção de Profiles na classe **User**. Encapsule essa coleção.

1. **(0,5 Ponto)** Criar corretamente a classe **Pessoa**.

Lembre-se de encapsular os campos, criar o toString e criar dois construtores sendo:

1º Com todos os atributos;

2º Sem receber os atributos;

3º A classe Seguro possui três classes herdeiras:

1. Pessoa Física;
2. Pessoa Jurídica.

1. **(1 Ponto)** Criar corretamente a classe **PessoaFisica**.

Lembre-se de encapsular os campos, criar o toString e criar dois construtores sendo:

1º Com todos os atributos;

2º Sem receber os atributos;

3º Há uma coleção de **PessoaFisica** na classe **PessoaFisica**. Encapsule essa coleção.

1. **(1 Ponto)** Criar corretamente a classe **PessoaJuridica**.

Lembre-se de encapsular os campos, criar o toString e criar dois construtores sendo:

1º Com todos os atributos;

2º Sem receber os atributos;

3º Há uma coleção de Pessoa na classe **PessoaJuridica**. Encapsule essa coleção.

1. **(1 Pontos)** Criar corretamente a classe **Sistema**.

Lembre-se de encapsular os campos, criar o toString e criar dois construtores sendo:

1º Com todos os atributos;

2º Sem receber os atributos;

3º Há uma coleção de Pessoa na classe Sistema. Encapsule essa coleção.

1. **(1 Ponto)** criar a enumeração **Sexo** ;

1. **(1 Ponto)** criar um método capaz de consultar um **Usuario** pelo seu email e senha na classe Usuário;

<a id="_Diagrama_de_Classes"></a>

# Diagrama de Classes

<img src="documentos/classes.png">


<a id="_Correcao"></a>

# Correção da Prova

A correção da prova será disponibilizada no github do professor (branch correcao):

Para acessar digite no prompt:

```shell
git clone https://github.com/Benefrancis/AUTH-1TDSA-2023.git && cd AUTH-1TDSA-2023 && git checkout correcao
```

A prova é individual, em caso de fraude de qualquer tipo todos os envolvidos receberão nota ZERO.

Boa prova.

Boa avaliação.

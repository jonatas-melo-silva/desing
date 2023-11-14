package com.ada.desingpatterns.builder.problem;

import java.time.LocalDate;

public class Pessoa {
  private String nome;
  private String sobrenome;
  private String documento;
  private String email;
  private String apelido;
  private LocalDate dataNascimento;

  public Pessoa(String nome, String sobrenome, String documento, String email, String apelido,
      LocalDate dataNascimento) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.documento = documento;
    this.email = email;
    this.apelido = apelido;
    this.dataNascimento = dataNascimento;
  }

  private void isStringValide(String text) {
    if (text == null || text.isEmpty()) {
      throw new IllegalArgumentException("Texto não pode ser nulo ou vazio");
    }
  }

  private void isDataValide(LocalDate data) {
    if (data == null) {
      throw new IllegalArgumentException("Data não pode ser nula");
    }
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.isStringValide(nome);
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.isStringValide(sobrenome);
    this.sobrenome = sobrenome;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.isStringValide(documento);
    this.documento = documento;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.isStringValide(email);
    this.email = email;
  }

  public String getApelido() {
    return apelido;
  }

  public void setApelido(String apelido) {
    this.isStringValide(apelido);
    this.apelido = apelido;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.isDataValide(dataNascimento);
    this.dataNascimento = dataNascimento;
  }

  @Override
  public String toString() {
    return "Pessoa [apelido=" + apelido + ", dataNascimento=" + dataNascimento + ", documento=" + documento
        + ", email=" + email + ", nome=" + nome + ", sobrenome=" + sobrenome + "]";
  }
}

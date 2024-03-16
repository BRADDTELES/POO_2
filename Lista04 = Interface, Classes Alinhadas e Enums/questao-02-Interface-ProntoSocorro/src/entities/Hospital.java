package entities;

import interfaces.Clinica;
import interfaces.ProntoSocorro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hospital implements ProntoSocorro, Clinica {

  Scanner sc = new Scanner(System.in);

  private String nome;
  private Integer idade;
  private Integer sexo;
  private String agendaData;
  private String agendaHorario;

  public Hospital() {

  }

  public void atender() {
    System.out.println("Nome Completo: ");
    setNome(sc.nextLine());
    System.out.println("Idade: ");
    setIdade(sc.nextInt());
    System.out.println("Sexo:\n1 - Masculino\n2 - Feminino\n3 - Não definido");
    sexo = sc.nextInt();
    if (sexo == 1) {
      System.out.println("Masculino");
    } else if (sexo == 2) {
      System.out.println("Feminino");
    } else if (sexo == 3) {
      System.out.println("Sexo Não Definido");
    } else {
      System.out.println("Opção Inválida");
    }
  }

  public void fazerTriagem() {
    boolean flag = true;
    while (flag) {
      System.out.println("Descreva os Sintomas:");
      sc.next();
      String sintomas = sc.nextLine();
      System.out.println(
        "Possui Arlegia a algum Medicamento ?\n1 - Sim\n2 - Não"
      );
      int arlegiaMedicamento = sc.nextInt();
      if (arlegiaMedicamento == 1) {
        System.out.println("Descreva qual: ");
        sc.next();
        String alergia = sc.nextLine();
        System.out.println("O Paciente está Respirando?\n1 - Sim\n2 - Não");
        int respirando = sc.nextInt();
        if (respirando == 1) {
          System.out.println("Informe a Frequência Respiratória:");
          int frequenciaRespiratoria = sc.nextInt();
          if (frequenciaRespiratoria > 30) {
            System.out.println("Código Azul");
			flag = false;
          } else if (
            frequenciaRespiratoria > 10 && frequenciaRespiratoria < 30
          ) {
            System.out.println(
              "O Pulso Radial está presente ?\n1 - Sim\n2 - Não"
            );
            int pulsoRadial = sc.nextInt();
            if (pulsoRadial == 1) {
              System.out.println(
                "O Paciente está consciente ?\n1 - Sim\n2 - Não"
              );
              int consciente = sc.nextInt();
              if (consciente == 1) {
                System.out.println(
                  "O Paciente está executando ordens Simples ? Descreva:"
                );
                String ordensSimples = sc.nextLine();
                System.out.println("Código Amarelo!");
                flag = false;
              } else if (consciente == 2) {
                System.out.println(
                  "O Paciente está executando ordens Simples ? Descreva:"
                );
                String ordensSimples = sc.nextLine();
                System.out.println("Código Vermelho");
                flag = false;
              } else {
                System.out.println("Opção Inválida");
              }
            } else if (pulsoRadial == 2) {
              System.out.println("Código Vermelho");
              flag = false;
            } else {
              System.out.println("Opção Inválida");
            }
          } else if (frequenciaRespiratoria < 10) {
            System.out.println("Código Vermelho");
            flag = false;
          } else {
            System.out.println("Opção Inválida");
          }
        } else if (respirando == 2) {
          System.out.println("Código Vermelho");
          flag = false;
        } else {
          System.out.println("Opção Inválida");
        }
      } else if (arlegiaMedicamento == 2) {
        System.out.println("O Paciente está andando?\n1 - Sim\n2 - Não");
        int andando = sc.nextInt();
        if (andando == 1) {
          System.out.println("Código Verde!");
          flag = false;
        } else if (andando == 2) {
          System.out.println("O Paciente está Respirando?\n1 - Sim\n2 - Não");
          int respirando = sc.nextInt();
          if (respirando == 1) {
            System.out.println("Informe a Frequência Respiratória:");
            int frequenciaRespiratoria = sc.nextInt();
            if (frequenciaRespiratoria > 30) {
              System.out.println("Código Azul");
            } else if (
              frequenciaRespiratoria > 10 && frequenciaRespiratoria < 30
            ) {
              System.out.println(
                "O Pulso Radial está presente ?\n1 - Sim\n2 - Não"
              );
              int pulsoRadial = sc.nextInt();
              if (pulsoRadial == 1) {
                System.out.println(
                  "O Paciente está consciente ?\n1 - Sim\n2 - Não"
                );
                int consciente = sc.nextInt();
                if (consciente == 1) {
                  System.out.println(
                    "O Paciente está executando ordens Simples ? Descreva:"
                  );
                  String ordensSimples = sc.nextLine();
                  System.out.println("Código Amarelo!");
                  flag = false;
                } else if (consciente == 2) {
                  System.out.println(
                    "O Paciente está executando ordens Simples ? Descreva:"
                  );
                  String ordensSimples = sc.nextLine();
                  System.out.println("Código Vermelho");
                  flag = false;
                } else {
                  System.out.println("Opção Inválida");
                }
              } else if (pulsoRadial == 2) {
                System.out.println("Código Vermelho");
                flag = false;
              } else {
                System.out.println("Opção Inválida");
              }
            } else if (frequenciaRespiratoria < 10) {
              System.out.println("Código Vermelho");
              flag = false;
            } else {
              System.out.println("Opção Inválida");
            }
          } else if (respirando == 2) {
            System.out.println("Código Vermelho");
            flag = false;
          } else {
            System.out.println("Opção Inválida");
          }
        } else {
          System.out.println("Opção Inválida");
        }
      } else {
        System.out.println("Opção Inválida");
      }
    }
  }

  public void agendarConsulta() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    System.out.println("Informe a Data de Agendamento da Consulta [Formato da Data: 01/01/2000][Horário: 12:00]: ");
    setAgendaData(sc.nextLine());
    setAgendaHorario(sc.nextLine());
    Date agenda = sdf.parse(getAgendaData()+" "+getAgendaHorario());
    System.out.println("Nome Completo: ");
    setNome(sc.nextLine());
    System.out.println("Idade: ");
    setIdade(sc.nextInt());
    System.out.println("Sexo:\n1 - Masculino\n2 - Feminino\n3 - Não definido");
    sexo = sc.nextInt();
    switch (sexo) {
      case 1:
        System.out.println("Masculino");
        break;
      case 2:
        System.out.println("Feminino");
      case 3:
        System.out.println("Sexo Não Definido");
        break;
      default:
        System.out.println("Opção Inválida");
    }
    System.out.print(getNome() + " ");
    System.out.println("Agendado: "+ sdf.format(agenda));
    System.out.println("Consulta Agendada!");
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public Integer getSexo() {
    return sexo;
  }

  public void setSexo(Integer sexo) {
    this.sexo = sexo;
  }

  public String getAgendaData() {
    return agendaData;
  }

  public void setAgendaData(String agendaData) {
    this.agendaData = agendaData;
  }

  public String getAgendaHorario() {
    return agendaHorario;
  }

  public void setAgendaHorario(String agendaHorario) {
    this.agendaHorario = agendaHorario;
  }

}

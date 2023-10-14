package main.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

  private Map<LocalDate, Evento> eventosMap;

  public AgendaEventos() {
    this.eventosMap = new HashMap<>();
  }

  public void adicionarEvento(LocalDate data, String nome, String atracao) {
    // Evento evento = new Evento(nome, atracao);

    eventosMap.put(data, new Evento(nome, atracao));

  }

  public Map<LocalDate, Evento> exibirAgenda() {
    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

    return eventosTreeMap;
  }

  public void obterProximoEvento() {
    /*
     * Set<LocalDate> dataSet = eventosMap.keySet();
     * Collections<Evento> values = eventosMap.values();
     */

    Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);

    LocalDate atualDate = LocalDate.now();

    for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {

      if (entry.getKey().isEqual(atualDate) || entry.getKey().isAfter(atualDate)) {
        System.out.println("O proximo Evento: " + entry.getValue() + " Acontecerá na data " + entry.getKey());
        break;
      }

    }

  }

  public static void main(String[] args) {
    AgendaEventos agendaTeste = new AgendaEventos();

    agendaTeste.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 12), "ESTUDAR", "JAVACOLLECTIONS");
    agendaTeste.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 14), "CONSEGUIR EMPREGO", "NÃO SEI AINDA");
    agendaTeste.adicionarEvento(LocalDate.of(2022, Month.JULY, 13), "COMEÇAR A ESTUDAR PROG", "DEVMEDIA");

    System.out.println(agendaTeste.exibirAgenda());

    agendaTeste.obterProximoEvento();
  }

}

package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.impressora.Impressora;
import equipamentos.digitalizadora.Digitalizadora;

public class EquipamentoMultiFuncional implements Copiadora, Impressora, Digitalizadora {
  

  public static void main(String[] args) {
    
  }

  @Override
  public void copiar() {
    System.out.println("COPIANDO VIA EQUIP. MULTIFUNCIONAL");
  }

  @Override
  public void Digitalizar() {
    System.out.println("DIGITALIZANDO VIA EQUIP. MULTIFUNCIONAL");
  }

  @Override
  public void imprimir() {
    System.out.println("IMPRIMINDO VIA EQUIP. MULTIFUNCIONAL");

  }
  
}

package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {

  public static void main(String[] args) {
    
    EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
    Impressora impressora = em;
    Digitalizadora digitalizadora = em;
    Copiadora copiadora = em;

    impressora.imprimir();

    digitalizadora.Digitalizar();
    copiadora.copiar();
  }
  
}

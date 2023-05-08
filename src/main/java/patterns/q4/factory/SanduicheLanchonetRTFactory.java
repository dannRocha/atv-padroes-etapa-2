package patterns.q4.factory;

import patterns.q4.model.SanduicheImpl;
import patterns.q4.model.enums.Pao;
import patterns.q4.model.enums.Presunto;
import patterns.q4.model.enums.Queijo;
import patterns.q4.model.enums.Salada;

public class SanduicheLanchonetRTFactory extends SanduicheFactory {
    @Override
    public SanduicheImpl montarSanduice() {
        return new SanduicheImpl(Pao.BOLA, Queijo.CHEDDAR, Presunto.PERU, Salada.COM_VERDURA);
    }
}

package patterns.q4.factory;

import patterns.q4.model.SanduicheImpl;
import patterns.q4.model.enums.Pao;
import patterns.q4.model.enums.Presunto;
import patterns.q4.model.enums.Queijo;
import patterns.q4.model.enums.Salada;

public class SanduicheLanchonetJPFactory extends SanduicheFactory{
    @Override
    public SanduicheImpl montarSanduice() {
        return new SanduicheImpl(Pao.FRANCES, Queijo.MUSSARELA, Presunto.FRANGO, Salada.COM_VERDURA);
    }
}

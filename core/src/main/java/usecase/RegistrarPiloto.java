package input;

import exception.ExceptionPiloto;
import model.Piloto;
import output.CreaterPiloto;
import output.SaveBD;

import java.time.LocalDate;

public class RegistrarPiloto implements CreaterPiloto {
    private final SaveBD bd;

    public RegistrarPiloto(SaveBD bd) {
        this.bd = bd;
    }

    @Override
    public boolean creacionPiloto(String id, String name, String dni, LocalDate fechaNate) throws ExceptionPiloto {
        Piloto p = Piloto.factori(id, name,dni, fechaNate);
        if(bd.buscarPilotoId(p.getDni()))
            throw new ExceptionPiloto("Piloto ya existe");

        return bd.savePiloto(p);
    }
}

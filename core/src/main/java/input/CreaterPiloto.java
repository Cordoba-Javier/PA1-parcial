package output;

import exception.ExceptionPiloto;

import java.time.LocalDate;

public interface CreaterPiloto {
    public boolean  creacionPiloto(String id,String name, String dni, LocalDate fechaNate)throws ExceptionPiloto;
}

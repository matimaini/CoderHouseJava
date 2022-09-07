package entregableexceptions;

public class SumaDeEnteros  {


    public double sumar( Double enteroA  , Double enteroB) throws EnteroInvalidoException {
        if (enteroA < 0 || enteroB < 0){
            throw new EnteroInvalidoException("Solo se pueden sumar números positivos");
        }
        else {
            return enteroA + enteroB;
        }
    }
}
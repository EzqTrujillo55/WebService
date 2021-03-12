
package UDDI;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "ServicioOperaciones")
public class ServicioOperaciones {

    @WebMethod(operationName = "hello")
    
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "horasSemana")

    public double horasSemana(@WebParam(name = "horasDiarias") double x1, @WebParam(name = "numeroDias") int x2) {
        return x1 * x2;
    }
    
    @WebMethod(operationName = "salarioSemana")
    public double salarioSemana (@WebParam(name = "salarioHora") double x1, @WebParam(name = "horasDiarias") double x2, @WebParam(name = "numeroDias") int x3) {
        return x1 * this.horasSemana(x2,x3);
    }
    
   
    
    
    
    

    
}

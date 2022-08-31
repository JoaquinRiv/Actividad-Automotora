

/**
 *
 * @author CETECOM
 */
public class Cotizacion {
    //04 crear atributos clase Cotizacion
    
    private String codigo;
    private char tipoVehiculo;
    private int cantidadVehiculo;
    
    //05 crear constructor c/ parametros y s/ parametros

    public Cotizacion() {
    }

    public Cotizacion(String codigo, char tipoVehiculo, int cantidadVehiculo) {
        this.codigo = codigo;
        this.tipoVehiculo = tipoVehiculo;
        this.cantidadVehiculo = cantidadVehiculo;
    }
    
    //06 crear getters y setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public char getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(char tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCantidadVehiculo() {
        return cantidadVehiculo;
    }

    public void setCantidadVehiculo(int cantidadVehiculo) {
        this.cantidadVehiculo = cantidadVehiculo;
    }
    
    //07 crear metodos customer
    public void imprimirCotizacion(){
        System.out.println("-------------COTIZACION-----------");
        System.out.println("codigo: "+ this.codigo);
        System.out.println("tipo vehiculo: "+ this.tipoVehiculo);
        System.out.println("cantidad vehiculo: "+ this.cantidadVehiculo);
        System.out.println("----------------------------------");
    }
    public void calcularMonto(){
        double DSCTO = 0.70;
        int sedan = 8750;
        int hatchBack = 8000;
        int familiar = 10000;
        double total = 0;
        
        if(tipoVehiculo == 's' || tipoVehiculo == 'S'){
           total = sedan * cantidadVehiculo;
           if(cantidadVehiculo > 3){
               total = (sedan * cantidadVehiculo) * DSCTO;
           }
           
        }else if(tipoVehiculo == 'h' || tipoVehiculo == 'H'){
            total = hatchBack * cantidadVehiculo;
            if(cantidadVehiculo > 3){
               total = (hatchBack * cantidadVehiculo) * DSCTO;
           }
         
        }else if(tipoVehiculo == 'f' || tipoVehiculo == 'F'){
            total = familiar * cantidadVehiculo;
            if(cantidadVehiculo > 3){
               total = (familiar * cantidadVehiculo) * DSCTO;
           }
            
        }else{
            System.out.println("elija un vehiculo apropiado");
        }
        
        
    
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}

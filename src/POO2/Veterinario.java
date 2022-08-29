
package POO2;


public class Veterinario extends Doctor 
{
    
    private String animalAtiende;
    private String productoFarmaceotico;
    private int nivelPaciencia;
    
    Doctor doctor1 = new Doctor();

    public Veterinario(String animalAtiende, String productoFarmaceotico, int nivelPaciencia, String instrumentoUsado, String especialidad, int anioExperiencia) 
    {
        super(instrumentoUsado, especialidad, anioExperiencia);
        this.animalAtiende = animalAtiende;
        this.productoFarmaceotico = productoFarmaceotico;
        this.nivelPaciencia = nivelPaciencia;
    }
    
    public Veterinario(){}//Veterinario
      
    
    public void setAnimalAtiende(String animalAtiende) 
    {
        this.animalAtiende = animalAtiende;
    }

    public String getAnimalAtiende() 
    {
        return animalAtiende;
    }
    
    public void setProductoFarmaceotico(String productoFarmaceotico) 
    {
        this.productoFarmaceotico = productoFarmaceotico;
    }

    public String getProductoFarmaceotico() 
    {
        return productoFarmaceotico;
    }
    
    public void setNivelPaciencia(int nivelPaciencia)
    {
        this.nivelPaciencia = nivelPaciencia;
    }

    public int getNivelPaciencia() 
    {
        return nivelPaciencia;
    }

    String setInstrumentoUsado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}

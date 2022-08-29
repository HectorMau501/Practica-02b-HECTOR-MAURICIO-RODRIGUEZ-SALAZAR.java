
package POO2;


public class Doctor 
{
    private String instrumentoUsado;
    private String especialidad;
    private int anioExperiencia;
    
    public Doctor(){}

    public Doctor(String instrumentoUsado, String especialidad, int anioExperiencia)
    {
        this.instrumentoUsado = instrumentoUsado;
        this.especialidad = especialidad;
        this.anioExperiencia = anioExperiencia;
    }
 

    public void setInstrumentoUsado(String instrumentoUsado)
    {
        this.instrumentoUsado = instrumentoUsado;
    }
    
    public String getInstrumentoUsado()
    {
        return instrumentoUsado;
    }
    
    public void setEspecialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() 
    {
        return especialidad;
    }

    public void setAnioExperiencia(int anioExperiencia)
    {
        this.anioExperiencia = anioExperiencia;
    }
    
    public int getAnioExperiencia()
    {
        return anioExperiencia;
    }   
            
}

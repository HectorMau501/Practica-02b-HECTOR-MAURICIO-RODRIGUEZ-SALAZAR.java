
package POO2;

import java.util.Scanner;


public class Main2 
{
    public static void main(String [] args)
    {
        int opcion = 0;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        Veterinario[] veterinario1 = new Veterinario[20];//arreglo
        for(int i = 0; i < 20; i++) veterinario1[i] = new Veterinario("","",0,"","",0); //Aqui es el for que nos ayuda a registrar los valores entre otras cosas
        
        do
        {
             int opcion2 = 0;
            
            System.out.println("Bienvenido al programa de arreglos");
            System.out.println("Que opcion desea realizar?");
            System.out.println("1. Registar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Consultar");
            System.out.println("5. Salir");
            opcion = entrada.nextInt();
            
            switch(opcion)
            {
                case 1: //Registrar
                    if(contador==20)
                    {
                        System.out.println("\tUsted ha colocado mas elementos registrados");
                    }
                    
                    else
                    {
                        System.out.println("Comience a registrar los puntos");
                        
                        System.out.println("El Dispositivo en el que esta es: N = "+contador);
                        
                        System.out.println("Que instrumento usa?");
                        String instromentoUsado = entrada.nextLine(); // opcion de guardar la variable
                        veterinario1[contador].setInstrumentoUsado(instromentoUsado); //Establece la variable
                        entrada.nextLine(); //Este sirve para que no se salte las variables
                        
                        System.out.println("Que especialidad tiene?");
                        String especialidad = entrada.nextLine();
                        veterinario1[contador].setEspecialidad(especialidad);
                        entrada.nextLine();
                        
                        System.out.println("Cuantos anios de experiencia tiene?");
                        int anioExperiencia = entrada.nextInt();
                        veterinario1[contador].setAnioExperiencia(anioExperiencia);
                        entrada.nextLine();
                        
                        System.out.println("Que tipo de animal atiende?");
                        veterinario1[contador].setAnimalAtiende(entrada.nextLine());
                        entrada.nextLine();
                        
                        System.out.println("Que producto Farmaceotico puede recomiendan");
                        veterinario1[contador].setProductoFarmaceotico(entrada.nextLine());
                        entrada.nextLine();
                        
                        System.out.println("Su nivel de paciencia(del 1 al 10)");
                        veterinario1[contador].setNivelPaciencia(entrada.nextInt());
                        entrada.nextLine();
                        
                        System.out.println("\n\tIntrumento:"+veterinario1[contador].getInstrumentoUsado()); //Este lo pongo para que pueda guardar correctamente el atributo
                        contador++;
                    }

              
                    break;
                    
                case 2: //Buscar
                    System.out.println("Que atributo desea buscar?"); 
                    System.out.println("1. el intromento Usado");
                    System.out.println("2. especialidad");
                    System.out.println("3. anio de Experiencia");
                    System.out.println("4. Animal que Atiende");
                    System.out.println("5. producto Farmaceotico");
                    System.out.println("6. Nivel de paciencia");
                    System.out.println("7. Salir");
                    opcion2 = entrada.nextInt();
                    
                    
                    switch(opcion2)
                    {
                        case 1:
                        String intromentoBuscado;
                            
                        System.out.println("\n\tBusqueda del tipo del intrumento ");
                        System.out.println("El instrumento que se va a buscar");
                            intromentoBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(intromentoBuscado.equals(veterinario1[i].getInstrumentoUsado()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Esperiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Especialidad: ");
                                    veterinario1[i].setEspecialidad(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Experiencia: ");
                                    veterinario1[i].setAnioExperiencia(entrada.nextInt());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Animal que atiende: ");
                                    veterinario1[i].setAnimalAtiende(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Producto Farmaceotico: ");
                                    veterinario1[i].setProductoFarmaceotico(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar el Nivel de Paciencia: ");
                                    veterinario1[i].setNivelPaciencia(entrada.nextInt());
                                    entrada.nextLine();
      
                                }
                                else{}   
                            }
                            
                            break;
                            
                        case 2:
                        String especialidadBuscado;
                            
                        System.out.println("\n\tBusqueda de la espcialidad");
                        System.out.println("La especialidad que se va a buscar");
                            especialidadBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(especialidadBuscado.equals(veterinario1[i].getEspecialidad()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Esperiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Instrumento: ");
                                    veterinario1[i].setInstrumentoUsado(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Experiencia: ");
                                    veterinario1[i].setAnioExperiencia(entrada.nextInt());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Animal que atiende: ");
                                    veterinario1[i].setAnimalAtiende(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Producto Farmaceotico: ");
                                    veterinario1[i].setProductoFarmaceotico(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar el Nivel de Paciencia: ");
                                    veterinario1[i].setNivelPaciencia(entrada.nextInt());
                                    entrada.nextLine();
      
                                }
                                else{}   
                            }
                            
                            break;
                        case 3:
                        int experienciaBuscado;
                            
                        System.out.println("\n\tBusqueda de la experiencia");
                        System.out.println("La experiencia que se va a buscar");
                        experienciaBuscado = entrada.nextInt(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(experienciaBuscado == veterinario1[i].getAnioExperiencia())
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Instrumento: ");
                                    veterinario1[i].setInstrumentoUsado(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Especialidad: ");
                                    veterinario1[i].setEspecialidad(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar animal que atiende: ");
                                    veterinario1[i].setAnimalAtiende(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Producto Producto farmaceotico: ");
                                    veterinario1[i].setProductoFarmaceotico(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar el Paciencia: ");
                                    veterinario1[i].setNivelPaciencia(entrada.nextInt());
                                    entrada.nextLine();
      
                                }
                                else{}   
                            }
                            break;
                            
                        case 4:
                        String animalAtiendeBuscado;
                            
                        System.out.println("\n\tBusqueda del animal que atiende");
                        System.out.println("El animal que se va a buscar");
                        animalAtiendeBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(animalAtiendeBuscado.equals(veterinario1[i].getAnimalAtiende()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Instrumento: ");
                                    veterinario1[i].setInstrumentoUsado(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Especialidad: ");
                                    veterinario1[i].setEspecialidad(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Experiencia: ");
                                    veterinario1[i].setAnioExperiencia(entrada.nextInt());
                                    entrada.nextLine();
                                    System.out.println("Producto Farmaceotico: ");
                                    veterinario1[i].setProductoFarmaceotico(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar el Nivel de Paciencia: ");
                                    veterinario1[i].setNivelPaciencia(entrada.nextInt());
                                    entrada.nextLine();
      
                                }
                                else{}   
                            }
                            break;
                            
                        case 5:
                        String productoBuscado;
                            
                        System.out.println("\n\tBusqueda del producto que recomienda");
                        System.out.println("El producto que se va a buscar");
                        productoBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(productoBuscado.equals(veterinario1[i].getProductoFarmaceotico()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Instrumento: ");
                                    veterinario1[i].setInstrumentoUsado(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Especialidad: ");
                                    veterinario1[i].setEspecialidad(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Experiencia: ");
                                    veterinario1[i].setAnioExperiencia(entrada.nextInt());
                                    entrada.nextLine();
                                    System.out.println("Cambiar animal que atiende: ");
                                    veterinario1[i].setAnimalAtiende(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar el Nivel de Paciencia: ");
                                    veterinario1[i].setNivelPaciencia(entrada.nextInt());
                                    entrada.nextLine();
      
                                }
                                else{}   
                            }
                            break;
                            
                        case 6:
                        int pacienciaBuscado;
                            
                        System.out.println("\n\tBusqueda del nivel de paciencia");
                        System.out.println("El nivel de paciencia que se busca:");
                        pacienciaBuscado = entrada.nextInt(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(pacienciaBuscado == veterinario1[i].getNivelPaciencia())
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para modificar los datos de los atributos menos el que buscas
                                    System.out.println("Cambiar Instrumento: ");
                                    veterinario1[i].setInstrumentoUsado(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Especialidad: ");
                                    veterinario1[i].setEspecialidad(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar Experiencia: ");
                                    veterinario1[i].setAnioExperiencia(entrada.nextInt());
                                    entrada.nextLine();
                                    System.out.println("Cambiar animal que atiende: ");
                                    veterinario1[i].setAnimalAtiende(entrada.nextLine());
                                    entrada.nextLine();
                                    System.out.println("Cambiar el Producto farmaceotico: ");
                                    veterinario1[i].setProductoFarmaceotico(entrada.nextLine());
                                    entrada.nextLine();
      
                                }
                                else{}   
                            }
                            break;
                            
                    
                        default: System.out.println("Ustede escribio inserto un numero o caracter incorrecto");
                    }
                            
                    break;
                    
                    
                    
        
                
                case 3: //Borrar
                     System.out.println("Que atributo desea borrar?"); 
                    System.out.println("1. el intromento Usado");
                    System.out.println("2. especialidad");
                    System.out.println("3. anio de Experiencia");
                    System.out.println("4. Animal que Atiende");
                    System.out.println("5. producto Farmaceotico");
                    System.out.println("6. Nivel de paciencia");
                    System.out.println("7. Salir");
                    opcion2 = entrada.nextInt();
                    
                    
                    switch(opcion2)
                    {
                        case 1:
                        String intromentoBuscado;
                            
                        System.out.println("\n\tEliminar del tipo del intrumento ");
                        System.out.println("El instrumento que se va a Elimimar");
                            intromentoBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(intromentoBuscado.equals(veterinario1[i].getInstrumentoUsado()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Esperiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para eliminar el objeto
                                    System.out.println("Se va a borra el elemento");
                                    for(int j = i ; j<contador; j++ ) 
                                    {
                                        veterinario1[j].setInstrumentoUsado(veterinario1[j+1].getInstrumentoUsado()) ;
                                       
                                    }
      
                                }
                                else{}   
                            }
                            
                            break;
                            
                        case 2:
                        String especialidadBuscado;
                            
                        System.out.println("\n\tEliminar de la espcialidad");
                        System.out.println("La especialidad que se va a eliminar");
                            especialidadBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(especialidadBuscado.equals(veterinario1[i].getEspecialidad()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Esperiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para eliminar el objeto
                                    System.out.println("Se va a borra el elemento");
                                    for(int j = i ; j<contador; j++ ) 
                                    {
                                        veterinario1[j].setEspecialidad(veterinario1[j+1].getEspecialidad()) ;
                                    }
   
                                }
                                else{}   
                            }
                            
                            break;
                        case 3:
                        int experienciaBuscado;
                            
                        System.out.println("\n\tEliminar de la experiencia");
                        System.out.println("La experiencia que se va a Eliminar");
                        experienciaBuscado = entrada.nextInt(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(experienciaBuscado == veterinario1[i].getAnioExperiencia())
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para eliminar el objeto
                                    System.out.println("Se va a borra el elemento");
                                    for(int j = i ; j<contador; j++ ) 
                                    {  
                                        veterinario1[j].setAnioExperiencia(veterinario1[j+1].getAnioExperiencia()) ; 
                                    }
      
                                }
                                else{}   
                            }
                            break;
                            
                        case 4:
                        String animalAtiendeBuscado;
                            
                        System.out.println("\n\tEliminar del animal que atiende");
                        System.out.println("El animal que se va a Eliminar");
                        animalAtiendeBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(animalAtiendeBuscado.equals(veterinario1[i].getAnimalAtiende()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para eliminar el objeto
                                    System.out.println("Se va a borra el elemento");
                                    for(int j = i ; j<contador; j++ ) 
                                    {  
                                        veterinario1[j].setAnimalAtiende(veterinario1[j+1].getAnimalAtiende()) ;  
                                    }
                                    
                                }
                                else{}   
                            }
                            break;
                            
                        case 5:
                        String productoBuscado;
                            
                        System.out.println("\n\tEliminar del producto que recomienda");
                        System.out.println("El producto que se va a Eliminar");
                        productoBuscado = entrada.nextLine(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(productoBuscado.equals(veterinario1[i].getProductoFarmaceotico()))
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para eliminar el objeto
                                    System.out.println("Se va a borra el elemento");
                                    for(int j = i ; j<contador; j++ ) 
                                    {
                                        veterinario1[j].setProductoFarmaceotico(veterinario1[j+1].getProductoFarmaceotico()) ;
                                    }
                                    
     
      
                                }
                                else{}   
                            }
                            break;
                            
                        case 6:
                        int pacienciaBuscado;
                            
                        System.out.println("\n\tEliminar del nivel de paciencia");
                        System.out.println("El nivel de paciencia que se Eliminar:");
                        pacienciaBuscado = entrada.nextInt(); //Aqui se busca la variable
                            
                           //Despues imprime los valores del atributo al que estamos buscando y recorre el arreglo
                            for(int i = 0; i < contador ; i++) 
                            {
                                //Este sirve para si coincide el elemento que estamos buscando pueda pasar lo de la parte de abajo
                                if(pacienciaBuscado == veterinario1[i].getNivelPaciencia())
                               {
                                   //Te muestra los datos de los arreglos
                                    System.out.println("\t\nPosicion del elemento:"+i);
                                    System.out.println("Instrumento: "+veterinario1[i].getInstrumentoUsado());
                                    System.out.println("Especialidad: "+veterinario1[i].getEspecialidad());
                                    System.out.println("Experiencia: "+veterinario1[i].getAnioExperiencia());
                                    System.out.println("Animal que atiende: "+veterinario1[i].getAnimalAtiende());
                                    System.out.println("Producto Farmaceotico: "+veterinario1[i].getProductoFarmaceotico());
                                    System.out.println("Nivel de Paciencia: "+veterinario1[i].getNivelPaciencia());
                                    System.out.println("\n");
                                    
                                    //Para eliminar el objeto
                                    System.out.println("Se va a borra el elemento");
                                    for(int j = i ; j<contador; j++ ) 
                                    {
                                        veterinario1[j].setNivelPaciencia(veterinario1[j+1].getNivelPaciencia()) ;
                                    }

                                }
                                else{}   
                            }
                            break;
                            
                    
                        default: System.out.println("Ustede escribio inserto un numero o caracter incorrecto");
                    }
                            
                    break;
                    
                
                
                case 4: //Mostrar
                    for(int i = 0; i < contador; i++)
                    {
                        System.out.println("\n\t\tLos datos del arreglo son:");  
                        System.out.println("\n\tEl instrumento es: "+veterinario1[i].getInstrumentoUsado()+" , "+" El numero de elemento es :"+i);
                        System.out.println("\n\tLa especialidad es: "+veterinario1[i].getEspecialidad()+" , "+" El numero de elemento es:  "+i);
                        System.out.println("\n\tLos anios que tiene de experiencia: "+veterinario1[i].getAnioExperiencia()+" , "+" El numero de elemento es: "+i);
                        System.out.println("\n\tEl tipo de animal que atiende es: "+veterinario1[i].getAnimalAtiende()+" , "+" El numero de elemento es: "+i);
                        System.out.println("\n\tEl producto farmaceotico que recomienda es: "+veterinario1[i].getProductoFarmaceotico()+" , "+" El numero de elemento es: "+i);
                        System.out.println("\n\tSu nivel de experiencia es: "+veterinario1[i].getNivelPaciencia()+" , "+" El numero de elemento es: "+i);
                    }
                    break;
                
               
                case 5:
                    break;
                    
                default: System.out.println("Ustede escribio inserto un numero o caracter incorrecto");
            }
            
            
        }while(opcion != 5);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.Ejecutable;
import com.javifast.clase_v_Introduccion.*;
import com.javifast.clase_v_basicas.*;
import com.javifast.clase_v_conocimiento_POO.*;
import com.javifast.clase_v_ejemplo_aplicacion.*;
import com.javifast.clase_v_intermedia.*;
import com.javifast.clase_x_archivos.*;
import com.javifast.clase_x_base_datos.*;
import com.javifast.clase_x_interface_grafica.*;
import com.javifast.clase_y_hilos.*;



import java.util.Scanner;

/**
 * La ventaja es poder reutilizar el objeto indefinidamente tambien se pueden
 * pasar los metodos a los objetos nota: recuerda quitar // para usar los
 * llamados a los metodos y ver su funcionamiento param javifast ---> metodo
 * main renombrado por defecto es (String[] args)
 */
public class Clase_salidas {

    public static void main(String... javifast) throws Exception { // aqui se invoca los metodos y clases con el parametro correspondiente
        
        Scanner clase = new Scanner(System.in);
        int elejir = 0;
        String separador = "============================================="+"============================================="
                           +"===============================================";
        do{ System.out.println(separador+"\nBienvenido al Curso de Java Esencial:\nPorfavor elija un curso:\nSi desea conocer la lista del curso porfavor ingrese: 0");
            elejir = clase.nextInt();
        switch (elejir) {
            case 0:
                Clase_0_info c0 = new Clase_0_info(); 
                c0.Clase_0_info();
                break;
            case 1:
                System.out.println(separador);
                new Clase_1_java();
                break;
            case 2:
                System.out.println(separador);
                new Clase_2_requisitos();
                break;
            case 3:
                System.out.println(separador);
//-------------------------------Clase 3  Hola mundo --------------------------------------------------------------------------------------------------
                Clase_03_a_08_introductoria c3 = new Clase_03_a_08_introductoria();
                c3.hola();
                break;
            case 4:
                System.out.println(separador);
//-------------------------------Clase 4  Metodo Main -------------------------------------------------------------------------------------------------
                System.out.println("Argumento en properties/run: "+javifast.length);
                break;
            case 5:
                System.out.println(separador);
 //-------------------------------Clase 5 a 8  Tipos de datos -----------------------------------------------------------------------------------------
                Clase_03_a_08_introductoria c5 = new Clase_03_a_08_introductoria();
                c5.tipos_datos(); //Clase 5 (inicializacion de datos)
                break;
            case 6:
                System.out.println(separador);
                Clase_03_a_08_introductoria c6 = new Clase_03_a_08_introductoria();
                c6.tipos_datos(); //Clase 6 (impresion de datos) 
                break;
            case 7:
                System.out.println(separador);
                Clase_03_a_08_introductoria c7 = new Clase_03_a_08_introductoria();
                c7.conver_datos(); //Clase 7        
                break;
            case 8:
                System.out.println(separador);
                Clase_03_a_08_introductoria c8 = new Clase_03_a_08_introductoria();
                c8.tipo_String(); //Clase 8
                break;
            case 9:
                System.out.println(separador);
//-------------------------------Clase 9  Sentencia if ------------------------------------------------------------------------------------------------
                Clase_09_sentencias c9 = new Clase_09_sentencias(); 
                c9.Sentencia_if(10); // aqui colocamos el numero en este caso el 5 podemos cambiarlo por otro para probar los distintos resultados  
                break;
            case 10:
                System.out.println(separador);
//-------------------------------Clase 10  Entrada de Datos -------------------------------------------------------------------------------------------
                Clase_10_Entrada_datos c10 = new Clase_10_Entrada_datos();
                c10.Ingresar_dato();
                break;
            case 11:
                System.out.println(separador);
//-------------------------------Clase 11 a 13  Ciclos ------------------------------------------------------------------------------------------------
                Clase_11_a_13_ciclos c11 = new Clase_11_a_13_ciclos();
                c11.ciclo_while(4); //Clase 11 While        
                break;
            case 12:
                System.out.println(separador);
                Clase_11_a_13_ciclos c12 = new Clase_11_a_13_ciclos();
                c12.ciclo_for(4); //Clase 12 for
                break;
            case 13:
                System.out.println(separador);
                Clase_11_a_13_ciclos c13 = new Clase_11_a_13_ciclos();
                c13.ciclo_dowhile(5); //Clase 13 Do while
                break;
            case 14:
                System.out.println(separador);
//-------------------------------Clase 14 a 17  Vector -------------------------------------------------------------------------------------------------
                Clase_14_a_17_vector c14 = new Clase_14_a_17_vector();
                c14.vector_inicial(); //Clase 14
                break;
            case 15:
                System.out.println(separador);
                Clase_14_a_17_vector c15 = new Clase_14_a_17_vector();
                c15.vector_paralelo(); //Clase 15
                break;
            case 16:
                System.out.println(separador);
                Clase_14_a_17_vector c16 = new Clase_14_a_17_vector();
                c16.vector_mayor_menor(); //Clase 16
                break;
            case 17:
                System.out.println(separador);
                Clase_14_a_17_vector c17 = new Clase_14_a_17_vector();
                c17.vector_orden_burbuja(); //Clase 17
                break;
            case 18:
                System.out.println(separador);
//-------------------------------Clase 18 a 19  Matrices ----------------------------------------------------------------------------------------------
                Clase_18_a_19_matrices c18 = new Clase_18_a_19_matrices();
                c18.matriz(); //Clase 18
                break;
            case 19:
                System.out.println(separador);
                Clase_18_a_19_matrices c19 = new Clase_18_a_19_matrices();
                c19.operacion_matrices(800,1300); //Clase 19 nota: el valor 800 y valor 1300 son los tiempo de espera en milisegundos
                // esto con el fin de controlar el tiempo de la automatizacion del ejemplo se pueden modificar por el que estime conveniente
                break;
            case 20:
                System.out.println(separador);
//-------------------------------Clase 20 Switch  ------------------------------------------------------------------------------------------------------
                Clase_20_switch c20 = new Clase_20_switch(); 
                c20.usando_switch();
                break;
            case 21:
                System.out.println(separador);
//-------------------------------Clase 21 y 22  Clases y metodos ---------------------------------------------------------------------------------------
                Clase_21_y_22_clasesyMetodos c21 = new Clase_21_y_22_clasesyMetodos(); 
                c21.defecto();// Clase 21        
                break;
            case 22:
                System.out.println(separador);
                Clase_21_y_22_clasesyMetodos c22 = new Clase_21_y_22_clasesyMetodos();
                c22.saludar(); //Clase 22
                break;
            case 23:
                System.out.println(separador);
//-------------------------------Clase 23  Alcance de las variables ------------------------------------------------------------------------------------        
                Clase_23_alcanze_variables c23 = new Clase_23_alcanze_variables(); // muestra la variable global pero no puede mostrar la local ya que 
                //esta dentro de un metodo aislado
                c23.local(); //muestra la variable local declarada dentro del metodo y ademas puede mostrar la variable global declarada en la clase
                break;
            case 24:
                System.out.println(separador);
//-------------------------------Clase 24  Introduccion a POO ------------------------------------------------------------------------------------------
                Clase_24_intro c24 = new Clase_24_intro("LG", "NEGRO"); //se crea un constructor en base la clase Clase_24_intro asignandole los valores 
                // del metodo Clase_24_intro
                c24.llamar(); //se llama al metodo llamar con el contructor creado anteriormente
                Clase_24_intro cl24 = new Clase_24_intro("NOKIA", "BLANCO"); // se puede crear tantos contructores como estime conveniente
                // respetando los valores solicitados
                cl24.llamar();//se llama al metodo con el contructor creado
                cl24.llamarespecial(c24); //se llama al metodo llamada especial el cual toma los atributos del constructor c creado
                // la ventaja de esto es evitar tener que ingresar los datos del contructor cuando se necesite
                break;
            case 25:
                System.out.println(separador);
//-------------------------------Clase 25 Metodos ------------------------------------------------------------------------------------------------------
                Clase_25_metodos c25 = new Clase_25_metodos(); // constructor por defecto al cual se le asigno un mensaje
                Clase_25_metodos cl25 = new Clase_25_metodos("javier"); //constructor con un parametro
                Clase_25_metodos cla25 = new Clase_25_metodos("alex", "manzano"); //constructor con dos parametros
                //Nota: se pueden crear constructores con los parametros que desee siempre y cuando los tenga generado en la clase principal
                cl25.saludo(); // se llama al metodo saludo en clase_25 con el parametro "javier" como el segundo parametro no es definido por defecto se 
                //le asigna "null"
                cla25.saludo(); // se llama al metodo saludo en clase_25 con el parametro "alex" y el segundo parametro "manzano"
                break;
            case 26:
                System.out.println(separador);
//-------------------------------Clase 26 Modificadores de Acceso --------------------------------------------------------------------------------------
                Clase_26_accesos c26 = new Clase_26_accesos();
                //c26.edad = 25; // variable con acceso protegido por lo que no puedo accederla fuera del paquete de la clase
                c26.nombre = "javier"; // variable con acceso publico
                //c26.pack = "defecto"; // variable con acceso por paquete por lo que no puedo accederla fuera del paquete de la clase
                c26.datos(); // se llama al metodo datos
                Clase_26_accesos c26a = new Clase_26_accesos("alex",25,"defecto"); // para accederlo fuera del paquete debemos generar el parametro
                // de accedo en un metodo dentro de la clase de no ser asi no se podra cambiar las variables privadas o protegidas
                c26a.datos();
                break;
            case 27:
                System.out.println(separador);
//-------------------------------Clase 27 Metodo get & set ---------------------------------------------------------------------------------------------
                Clase_27_get_set c27 = new Clase_27_get_set(); 
                c27.setNombre("Iphone"); // se llama a la variable del constructor con el metodo set+Nombre de variable
                c27.setColor("negro"); // se llama a la variable del constructor con el metodo set+Color de variable
                c27.setCodigo("123456789"); // se llama a la variable del constructor con el metodo set+Codigo de variable
                // para llamar las variables ingresada se utiliza el metodo creado get+ nombre de la variable para esto hay que crear una variable del
                // mismo tipo que almacene esta informacion
                String nombre_27 = c27.getNombre(); // la variable nombre_27 recibe el parametro de la variable nombre(private)de la clase Clase_27_get_set
                String color_27 = c27.getColor(); // la variable color_27 recibe el parametro de la variable color(private) de la clase Clase_27_get_set
                String codigo_27 = c27.getCodigo(); // la variable codigo_27 recibe el parametro de la variable codigo(private) de la clase Clase_27_get_set
                System.out.println(nombre_27+" "+color_27+" "+codigo_27);
                //tambien se puede llamar directamente en el metodo println
                System.out.println(c27.getNombre()+" "+c27.getColor()+" "+c27.getCodigo());
                //o crear un metodo que muestre directamente en la clase Clase_27_get_set
                c27.mostrar();
                // la ventaja que tienen los metodos set & get es la posibilidad de controlar los valores cuando ya sean nulos o contengan un parametro
                // definido para cambiar su valor o ejecutar una accion determinada
                // este ejemplo esta en la clase Clace_27.getCodigo para emular la sentencia debe inabilitar la sentencia "c27.setCodigo("123456789");"
                break;
            case 28:
                System.out.println(separador);
//-------------------------------Clase 28 Herencia ------------------------------------------------------------------------------------------------------
                Clase_28_heredero c28 = new Clase_28_heredero("Pastor Aleman","pipe","dogShow",4); 
                // nos da acceso tanto a las variables de su clase padre como las de su propia clase
                // al crear los contructores debemos instanciar la informacion al crear el objeto comenzando por la variable de la clase hija
                c28.setNombre("maite");
                c28.setEdad(3);
                c28.setComida("master dog");
                c28.setRaza("poodle");
                c28.mostrar();//la secuencia que se muestra esta definida en la clase Clase_28_heredero.mostrar();
                Clase_28_Herencia cl28 = new Clase_28_Herencia("Elefante","mani",25); // en este caso solo tenemos acceso a la clase propia sin poder 
                //acceder a los metodos de la clase hija
                cl28.setNombre("elefante");
                cl28.setEdad(25);
                break;
            case 29:
                System.out.println(separador);
//-------------------------------Clase 29 Polimorfismo --------------------------------------------------------------------------------------------------
                Clase_29_polimorfismo c_hijo_29 = new Clase_29_hijo("Pastor Aleman","pipe","dogShow",4); //para utilizar el polimorfismo se 
                //debe instanciar la clase padre dentro de la clase hijo
                c_hijo_29.alimentarse();
                Clase_29_polimorfismo c_hija_29 = new Clase_29_hija();
                c_hija_29.alimentarse();
                break;
            case 30:
                System.out.println(separador);
//-------------------------------Clase 30 Encapsulamiento -----------------------------------------------------------------------------------------------
                new Clase_30_encapsulacion(); // ejemplo de metodo split en string en un array     
                break;
            case 31:
                System.out.println(separador);
//-------------------------------Clase 31 Metodos instancia y clase -------------------------------------------------------------------------------------
                Clase_31_metodo_instanciaclase c31 = new Clase_31_metodo_instanciaclase();
                c31.setNombre("Javier");
                c31.setEdad(23);
                c31.MostrarInstancia();
                Clase_31_metodo_instanciaclase.MostrarClase();
                break;
            case 32:
                System.out.println(separador);
//-------------------------------Clase 32 Manejo de Fechas ----------------------------------------------------------------------------------------------
                Clase_32_date_calendar c32 = new Clase_32_date_calendar();
                // existen los tipos Date y Calendar, en versiones mas actuales jdk8 tenemos el tipo time, en este caso comenzaremos con Date
                c32.mostrarDate();
                c32.mostrarCalendar();//Metodo Calendar
                break;
            case 33:
                System.out.println(separador);
//-------------------------------Clase 33 interface -----------------------------------------------------------------------------------------------------
                Clase_33_Interfaces c33 = new Clase_33_Interfaces();
                c33.tipoAnimal();
                String nombre = c33.mostrarNombre();
                System.out.println(nombre);
                c33.mostrarVida();
                break;
            case 34:
                System.out.println(separador);
//-------------------------------Clase 34 ejemplo aplicativo 1 -------------------------------------------------------------------------------------------
                Clase_34 c34 = new Clase_34(); // en paquete com.javifast.clase_v_ejemplo_aplicacion
                c34.aplicacion1();
                break;
            case 35:
                System.out.println(separador);
//-------------------------------Clase 35 StringBuilder --------------------------------------------------------------------------------------------------
                Clase_35_StringBuilder c35 = new Clase_35_StringBuilder();
                c35.concatenacion(); // ejemplo de string + cadenas de texto
                c35.Stringbuilder(); // ejemplo de stringbuilder .append cadenas de texto
                c35.ejemplo(); // ejemplo de ambas en ejecucion y su diferencia de tiempo
                // en resumen es mas rapido usar Stringbuilder frente a concadenar un string cuando la cantidad de datos es muy grande
                break;
            case 36:
                System.out.println(separador);
//-------------------------------Clase 36 Colecciones + iterator -----------------------------------------------------------------------------------------
                Clase_36_colecciones_iterator c36 = new Clase_36_colecciones_iterator();
                c36.Array(); // recorrido de una lista array
                c36.iterator(); // coleccion de objeto persona
                break;
            case 37:
                System.out.println(separador);
//-------------------------------Clase 37 ArrayList + optimizacion ---------------------------------------------------------------------------------------
                Clase_37_arraylist c37 = new Clase_37_arraylist();
                c37.arraylist();  
                break;
            case 38:
                System.out.println(separador);
//-------------------------------Clase 38 LinkedList -----------------------------------------------------------------------------------------------------
                Clase_38_linkedlist c38 = new Clase_38_linkedlist();
                c38.lista_enlazada(); // ejemplo de una lista enlazada
                c38.comparativa_linkedlist_arraylist();
                break;
            case 39:
                System.out.println(separador);
//-------------------------------Clase 39 HashMap --------------------------------------------------------------------------------------------------------
                Clase_39_hashmap c39 = new Clase_39_hashmap();
                c39.diccionario();
                break;
            case 40:
                System.out.println(separador);
//-------------------------------Clase 40 HashSet --------------------------------------------------------------------------------------------------------
                Clase_40_hasset c40 = new Clase_40_hasset();
                c40.desordenado();
                break;
            case 41:
                System.out.println(separador);
//-------------------------------Clase 41 Excepciones ----------------------------------------------------------------------------------------------------
                new Clase_41_excepciones();
                break;
            case 42:
                System.out.println(separador);
//-------------------------------Clase 42 Jerarquia Excepciones ------------------------------------------------------------------------------------------
                new Clase_42_jerarquia_excepciones();
                break;
            case 43:
                System.out.println(separador);
//-------------------------------Clase 43 throw y throws -------------------------------------------------------------------------------------------------
                new Clase_43_throw_throws();
                break;
            case 44:
                System.out.println(separador);
//-------------------------------Clase 44 Excepciones Personalizadas -------------------------------------------------------------------------------------
                new Clase_44_Excepciones_personalizadas();
                break;
            case 45:
                System.out.println(separador);
//-------------------------------Clase 45 archivo --------------------------------------------------------------------------------------------------------
                Clase_45_file c45 = new Clase_45_file();
                c45.archivo_existe(); //metodo file
                break;
            case 46:
                System.out.println(separador);
//-------------------------------Clase 46 Lectura de archivos --------------------------------------------------------------------------------------------
                Clase_46_file_read c46 = new Clase_46_file_read(); 
                c46.lectura(); // lectura mediante filereader
                c46.lectura_en_byte(); // lectura mediante fileinputstream
                break;
            case 47:
                System.out.println(separador);
//-------------------------------Clase 47 escritura de archivos ------------------------------------------------------------------------------------------
                Clase_47_file_write c47 = new Clase_47_file_write();
                c47.escritura(); // escritura mediente filewriter y printwriter
                break;
            case 48:
                System.out.println(separador);
//-------------------------------Clase 48 try with resources jdk1.7 --------------------------------------------------------------------------------------
                Clase_47_file_write c48 = new Clase_47_file_write();
                c48.try_with_resources();
                break;
            case 49:
                System.out.println(separador);
//-------------------------------Clase 49 Conexion a Base de Datos ---------------------------------------------------------------------------------------
                Clase_49_conexion c49 = new Clase_49_conexion();
                c49.conexion_defecto();
                break;
            case 50:
                System.out.println(separador);
//-------------------------------Clase 50 Insercion de datos con peticion de parametros ------------------------------------------------------------------
                Clase_50_insertar c50 = new Clase_50_insertar();
                c50.insertar_persona();
                break;
            case 51:
                System.out.println(separador);
//-------------------------------Clase 51 Listar de Base de Datos ----------------------------------------------------------------------------------------
                Clase_51_lista_datos c51 = new Clase_51_lista_datos();
                c51.lista();
                break;
            case 52:
                System.out.println(separador);
//-------------------------------Clase 52 Patron Data Access Object --------------------------------------------------------------------------------------    
           Clase_get_set_persona db51 =  new Clase_get_set_persona();
           db51.setId(9);
           db51.setNombre("Javifast");
           db51.setCodigo("12122017");
           try{
            Clase_52_DAO_impl dao52 = new Clase_52_DAO_impl();
            //dao52.insertar(db51); 
            //dao52.modificar(db51);
            //dao52.borrar(db51);
            for(Clase_get_set_persona db : dao52.listar() ){
              System.out.println(db.getNombre()+"-"+db.getCodigo());
           } 
           }catch(Exception e){
               System.out.println(e.getMessage());
           }
                break;
            case 53:
                System.out.println(separador);
//-------------------------Clase 53_a_56_Swing -----------------------------------------------------------------------------------------------------------
            new Clase_53_a_55_swing();           
                break;
            case 54:
                System.out.println(separador);
            new Clase_53_a_55_swing();    
                break;
            case 55:
                System.out.println(separador);
            new Clase_53_a_55_swing();    
                break;
            case 56:
                System.out.println(separador);
            new Clase_56_swing().setVisible(true);    
                break;
            case 57:
                System.out.println(separador);
//-------------------------------Clase 57 Hilos ----------------------------------------------------------------------------------------------------------
            new Clase_57_hilos();
            //iniciaciones
                break;
            default:
                System.out.println(separador);
//-------------------------------En caso de no encontrarse -----------------------------------------------------------------------------------------------
                System.out.println("El valor ingresado no coincide, porfavor ingrese uno valido");
                break;
        }}while(elejir <= 57);
    }

}

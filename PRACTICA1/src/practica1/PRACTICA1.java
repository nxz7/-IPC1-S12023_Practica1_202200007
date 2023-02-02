/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author natalia
 */
public class PRACTICA1 {
    
    
    static String[] articulo = new String[20]; /// nombre
    static String NombreCliente = "";
    static String NIT = "";
    static double[] precio = new double[20];
    static int[] Cantidad = new int[20];  // cantidad TOTAL 
    static double[] cantDESCUENTO = new double[20];
    static String[] codigoDESCUENTO = new String[20];
     //DINERO QUE SE DESCUENTA
    static double suma=0; //con descuento
    static double sumaSINdescuento=0;
    static double SumaReporte=0;
    static boolean terminar=true;
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] CantidadLOCAL = new int[20];
        String opcion1 = "1.AGREGAR NUEVOS PRODUCTOS";
     String opcion2 = "2.AGREGAR CUPONES DE DESCUENTO";
     String opcion3 = "3.REALIZAR VENTAS";
     String opcion4 = "4.REPORTE";
     String opcion5 = "5.salir del programa";
        System.out.println("************* MENU INICIAL *************");
        System.out.println(opcion1+"\n" +opcion2+ "\n" +opcion3+"\n"+opcion4+"\n"+opcion5);
        System.out.println("Para habilitar las distintas funciones es necesario que:");
        String usuario="";
        String contra="";
       do{ 
        System.out.println("ingrese su usuario: ");
         usuario = input.nextLine();
       System.out.println("ingrese su contraseña: ");
         contra = input.nextLine();
         
         
       if(usuario.equals("cajero_202200007")&& contra.equals("ipc1_202200007")) {
      System.out.println("BIENVENIDA"); 
      
      
          
          int OPCION = 0;
    
       while(OPCION!=5){ 
           
     
      System.out.println(opcion1+"\n" +opcion2+ "\n" +opcion3+"\n"+opcion4+"\n"+opcion5);
          
          
     System.out.println("QUE DESEA HACER?");
            OPCION = input.nextInt();
 
            
            switch (OPCION) {
 
                
                case 1:
                    
                    System.out.println("1.AGREGAR NUEVOS PRODUCTOS");
                    INTROUDCIR();
                    break;
 
                
                case 2:
                    System.out.println("2.AGREGAR CUPONES DE DESCUENTO");
                    DESCUENTO();
                    break;
 
                
                case 3:
                    System.out.println("3.REALIZAR VENTAS");
                    seleccionar();
                    
                    break;
 
                
                case 4:
                    System.out.println("4.REPORTE");
                    REPORTE();
                    break;
 
                
                case 5:
                    System.exit(0);
 
                
                default:
                    System.out.println("OPCION INVALIDA - ELIGA UNA DE LAS OPCIONES DISPONIBLES");
           }
             }  
              } 
               else{
      System.out.println("usurio o contraseña incorrecto");
        
       }
    }while((contra!=("ipc1_202200007")) && usuario!=("cajero_202200007"));
    }     
    
        
         
         
    
    
    public static void INTROUDCIR(){
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("1. INTRODUZCA LOS PRODUCTOS");
       
            
                  for(int i=0;i<5;i++){
        System.out.println("ingrese el nombre: ");
         articulo[i] = input.nextLine();
         //verificar producto
         if (articulo[i]!= null ){ 
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (articulo[i].equals(articulo[j])){
                             System.out.println("ARTICULO YA EXISTENTE - INGRESAR NUEVO");
                             articulo[i] = input.nextLine();
                         
                         }
                             
                 }
             }            
             else{
                 
             }
         
         }
         
         
        System.out.println("ingrese precio: ");
         precio[i]  = input.nextDouble();
         
         
         input.nextLine();
             if (precio[i]==0){ 
                 System.out.println("PRECIO INVALIDO - INGRESAR DE NUEVO ");
                 precio[i]  = input.nextDouble();
                 input.nextLine();      
             }
             else{   
             }  
         System.out.println("------------------------"); 
             }
         System.out.println("DESEA AGREGAR 5 ARTICULOS MAS? - ingrese si o no");      
         String seguir = input.nextLine();  
         
         
         if (seguir.equals("si")){
             for(int i=5;i<10;i++){
        System.out.println("ingrese el nombre: ");
         articulo[i] = input.nextLine();
         //verificar producto
         if (articulo[i]!= null ){ 
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (articulo[i].equals(articulo[j])){
                             System.out.println("ARTICULO YA EXISTENTE - INGRESAR NUEVO");
                             articulo[i] = input.nextLine();
                         
                         }
                             
                 }
             }            
             else{
                 
             }
         
         }
         
         
        System.out.println("ingrese precio: ");
         precio[i]  = input.nextDouble();
         
         // verificar ceros en el precio
         input.nextLine();
             if (precio[i]==0){ 
                 System.out.println("PRECIO INVALIDO - INGRESAR DE NUEVO ");
                 precio[i]  = input.nextDouble();
                 input.nextLine();      
             }
             else{   
             }  
         System.out.println("------------------------");
             }
             
         }
         else {
             System.out.println("articulo"+"\t\tPrecio");
		for(int i=0;i<20;i++){
                    if(articulo[i]!=("null") && precio[i]!=0.0) 
                    {
        System.out.println((i+1)+"."+articulo[i]+"\t\t"+precio[i]);
                    }
    }
             return;
         }
         
         System.out.println("DESEA AGREGAR 5 ARTICULOS MAS? - ingrese si o no");      
         seguir = input.nextLine();  
         
         if (seguir.equals("si")){
             for(int i=10;i<15;i++){
        System.out.println("ingrese el nombre: ");
         articulo[i] = input.nextLine();
         //verificar producto
         if (articulo[i]!= null ){ 
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (articulo[i].equals(articulo[j])){
                             System.out.println("ARTICULO YA EXISTENTE - INGRESAR NUEVO");
                             articulo[i] = input.nextLine();
                         
                         }
                             
                 }
             }            
             else{
                 
             }
         
         }
         
         
        System.out.println("ingrese precio: ");
         precio[i]  = input.nextDouble();
         
         // verificar ceros en el precio
         input.nextLine();
             if (precio[i]==0){ 
                 System.out.println("PRECIO INVALIDO - INGRESAR DE NUEVO ");
                 precio[i]  = input.nextDouble();
                 input.nextLine();      
             }
             else{   
             }  
         System.out.println("------------------------");
             }
             
         }
         else {
             System.out.println("articulo"+"\t\tPrecio");
		for(int i=0;i<20;i++){
                    if(articulo[i]!=("null") && precio[i]!=0.0) 
                    {
        System.out.println((i+1)+"."+articulo[i]+"\t\t"+precio[i]);
                    }
    }
             
             return;
         
         }
         
         System.out.println("DESEA AGREGAR 5 ARTICULOS MAS? - ingrese si o no" );      
         seguir = input.nextLine();  
         
         if (seguir.equals("si")){
             for(int i=15;i<20;i++){
        System.out.println("ingrese el nombre: ");
         articulo[i] = input.nextLine();
         //verificar producto
         if (articulo[i]!= null ){ 
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (articulo[i].equals(articulo[j])){
                             System.out.println("ARTICULO YA EXISTENTE - INGRESAR NUEVO");
                             articulo[i] = input.nextLine();
                         
                         }
                             
                 }
             }            
             else{
                 
             }
         
         }
         
         
        System.out.println("ingrese precio: ");
         precio[i]  = input.nextDouble();
         
         // verificar ceros en el precio
         input.nextLine();
             if (precio[i]==0){ 
                 System.out.println("PRECIO INVALIDO - INGRESAR DE NUEVO ");
                 precio[i]  = input.nextDouble();
                 input.nextLine();      
             }
             else{   
             }  
         System.out.println("------------------------");
             }
             
         }
        
        
               
        System.out.println("articulo"+"\t\tPrecio");
		for(int i=0;i<20;i++){
                    if(articulo[i]!=("null") && precio[i]!=0.0) 
                    {
        System.out.println((i+1)+"."+articulo[i]+"\t\t"+precio[i]);
                    }
    }
                }
    //EDITAR AGREGAR LOS CODIGOS DE DESCUENTO
    public static void seleccionar(){
        Scanner input = new Scanner(System.in);
        //CREAR ARREGLO DE CANTIDAD
        System.out.println("---------------------------");
        int[] CantidadLOCAL = new int[20];
        System.out.println("Nombre del cliente: ");
        NombreCliente = input.nextLine();
        
        System.out.println("¿Cual es su numero de NIT? ------ MARQUE 0 si no posee o no desea agregarlo ");
        NIT = input.nextLine();
        if(NIT.equals("0")) {
               System.out.println("NIT: C/F");
            }
        else{System.out.println("NIT: "+ NIT); }
        System.out.println("------------productos---------------");
        
        System.out.println("articulo"+"\t\tPrecio");
		for(int i=0;i<20;i++){
                    if(articulo[i]!=("null") && precio[i]!=0.0) 
                    {
        System.out.println((i+1)+"."+articulo[i]+"\t\t"+precio[i]);
                    }
    }
             
        do { 
    System.out.println("Que articulo desea comprar? [presione cualquier numero que no corresponde al menu de \n artuculos si ya concluyo su seleccion de articulos *QUE NO SEA 0*]");
    int CodigodeArt = Integer.parseInt(input.nextLine());
    if (CodigodeArt <= 20 && CodigodeArt >= 1) {
        if (articulo[CodigodeArt - 1] != ("null") && precio[CodigodeArt - 1] != 0.0) {
            System.out.println("Cantidad que desea comprar de:" + articulo[CodigodeArt - 1]);
            int CANT = Integer.parseInt(input.nextLine());
            CantidadLOCAL[CodigodeArt - 1] += CANT;
            Cantidad[CodigodeArt - 1] += CANT;
        } else {
            System.out.println("***CODIGO DE ARTICULO INVALIDO***");
            terminar = false;
        }
    } else {
        System.out.println("****CODIGO DE ARTICULO INVALIDO****");
        terminar = false;
    }
          } while (terminar);
        terminar=true; 
        sumaSINdescuento=0;
        for(int i=0;i< 20 ;i++)
	    {
             if(CantidadLOCAL[i]!=0)
	     {
	      sumaSINdescuento+=CantidadLOCAL[i]*precio[i];
              System.out.println(articulo[i]+"*   "+CantidadLOCAL[i]+" -----------  Q. "+CantidadLOCAL[i]*precio[i]);
	     }
	    }
         //
        System.out.println("---------------------------");
        System.out.println("Total= Q."+sumaSINdescuento);
        System.out.println("---------------------------");
         
        
        System.out.println("Posee algun codigo de descuento que desee ingresar? \n Indique: si o no ");
        String lol = input.next();
        double dinDESC=0;
        
        if(lol.equals("si")) {
                     System.out.println("INGRESE EL CODIGO DE DESCUENTO");
                     String CODIGO_INGRESADO = input.next();
                     input.nextLine();
                     if(CODIGO_INGRESADO!=null){
               
            
	             if(CODIGO_INGRESADO.equals(codigoDESCUENTO[0]))
	               {
		          System.out.println("codigo: "+ CODIGO_INGRESADO + " es valido y tiene un descuento de: "+ cantDESCUENTO[0]+ "%");
                           dinDESC=(cantDESCUENTO[0]/100)*sumaSINdescuento;
                           suma= sumaSINdescuento-dinDESC;
                
                         System.out.println("Nuevo total:" + suma );
		
	                   }
                      else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[1])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[1]+ "%");
                       dinDESC=(cantDESCUENTO[1]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[2])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[2]+ "%");
                       dinDESC=(cantDESCUENTO[2]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                         }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[3])){
                        System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[3]+ "%");
                        dinDESC=(cantDESCUENTO[3]/100)*sumaSINdescuento;
                        suma= sumaSINdescuento-dinDESC;
                        System.out.println("Nuevo total:" + suma );
                
                      }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[4])){
                        System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[4]+ "%");
                        dinDESC=(cantDESCUENTO[4]/100)*sumaSINdescuento;
                        suma= sumaSINdescuento-dinDESC;
                        System.out.println("Nuevo total:" + suma );
                
                      }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[5])){
                        System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[5]+ "%");
                        dinDESC=(cantDESCUENTO[5]/100)*sumaSINdescuento;
                        suma= sumaSINdescuento-dinDESC;
                        System.out.println("Nuevo total:" + suma );
                
                      }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[6])){
                        System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[6]+ "%");
                        dinDESC=(cantDESCUENTO[6]/100)*sumaSINdescuento;
                        suma= sumaSINdescuento-dinDESC;
                        System.out.println("Nuevo total:" + suma );
                
                      }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[7])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[7]+ "%");
                       dinDESC=(cantDESCUENTO[7]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[8])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[8]+ "%");
                       dinDESC=(cantDESCUENTO[8]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[9])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[9]+ "%");
                       dinDESC=(cantDESCUENTO[9]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[10])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[10]+ "%");
                       dinDESC=(cantDESCUENTO[10]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[11])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[11]+ "%");
                       dinDESC=(cantDESCUENTO[11]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[12])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[12]+ "%");
                       dinDESC=(cantDESCUENTO[12]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[13])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[13]+ "%");
                       dinDESC=(cantDESCUENTO[13]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[14])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[14]+ "%");
                       dinDESC=(cantDESCUENTO[14]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[15])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[15]+ "%");
                       dinDESC=(cantDESCUENTO[15]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[16])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[16]+ "%");
                       dinDESC=(cantDESCUENTO[16]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[17])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[17]+ "%");
                       dinDESC=(cantDESCUENTO[17]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[18])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[18]+ "%");
                       dinDESC=(cantDESCUENTO[18]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
                     else if(CODIGO_INGRESADO.equals(codigoDESCUENTO[19])){
                       System.out.println("codigo: "+ CODIGO_INGRESADO + "es valido y tiene un descuento de: "+ cantDESCUENTO[19]+ "%");
                       dinDESC=(cantDESCUENTO[19]/100)*sumaSINdescuento;
                       suma= sumaSINdescuento-dinDESC;
                       System.out.println("Nuevo total:" + suma );
                
                          }
	            else
	               {
                        System.out.println("codigo: "+ CODIGO_INGRESADO + "es invalido o esta fuera de fecha valida");
                     
                        }
               
                 }
        else{
                  terminar=false;  
        
                   }
        
        System.out.println("**************COMPRA FINALIZADA************");
        }
        System.out.println("**************facturando************");
        
	System.out.println("*------------------FACTURA------------------------*");
        System.out.println("---> SUPER-25");
        System.out.println("Cajero: Natalia Calderon");
	System.out.println("cliente:"+ NombreCliente); 
        if(NIT.equals("0")) {
               System.out.println("NIT: C/F");
            }
        else{System.out.println("NIT: "+ NIT); }
        System.out.println("FECHA: ");
        java.util.Date date = new java.util.Date();
        System.out.println(date);
        System.out.println("--> LISTADO DE PRODUCTOS:");
        System.out.println("articulo--------cantidad----------precio c/u--------TOTAL");
	    for(int i=0;i< 20 ;i++)
	    {
             if(CantidadLOCAL[i]!=0)
	     {
	      
              System.out.println(articulo[i]+"*        "+CantidadLOCAL[i]+" -----" + precio[i]+ "------  Q. "+CantidadLOCAL[i]*precio[i]);
	     }
	    }
         //
        System.out.println("---------------------------");
        System.out.println("SUBTotal= Q."+sumaSINdescuento);
        System.out.println("---------------------------");
        double porcentaje=(dinDESC/sumaSINdescuento)*100 ;
        System.out.println("PORCENTAJE DE DESCUENTO: "+ porcentaje +" %");
	 suma= sumaSINdescuento-dinDESC;
         System.out.println("---------------------------");
         System.out.println("Total= Q."+suma);
    }
    

    public static void DESCUENTO(){
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESE LOS CODIGOS DE DESCUENTO");
        
        
        /// VERIFICAR SI ES DE 4 CARACTERES O REPETIDO
        for(int i=0;i<5;i++){
         System.out.println("ingrese el codigo de descuento: ");
         codigoDESCUENTO[i] = input.nextLine();
             if (codigoDESCUENTO[i]!= null ){ 
                 if(codigoDESCUENTO[i].length()==4){
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (codigoDESCUENTO[i].equals(codigoDESCUENTO[j])){
                             System.out.println("EL CODIGO YA EXISTENTE - INGRESE DE NUEVO");
                             codigoDESCUENTO[i] = input.nextLine();
                         
                         }
                   }          
                 }
             }            
             else{
                 System.out.println("EL CODIGO INVALIDO ** RECUERDE: 4 caracteres \n - INGRESE DE NUEVO");
                 codigoDESCUENTO[i] = input.nextLine();
             }
         
         }
             // asignar y verificar porcentaje
          System.out.println("ingrese porcentaje de descuento: ");
          cantDESCUENTO[i]  = input.nextDouble();
          input.nextLine();
             
             if (cantDESCUENTO[i]<=0 || cantDESCUENTO[i]>=100){ 
                 System.out.println("PORCENTAJE INVALIDO - tiene que estar entre 0 y 100 \n **** INGRESE DE NUEVO **** ");
                 cantDESCUENTO[i]= input.nextDouble();
                 input.nextLine();      
             }
             else{
                 
             }
         }
        System.out.println("DESEA AGREGAR 5 codigos MAS? - escriba si o no");      
        String seguir2 = input.nextLine();  
         
         
         if (seguir2.equals("si")){
        
        for(int i=5;i<10;i++){
         System.out.println("ingrese el codigo de descuento: ");
         codigoDESCUENTO[i] = input.nextLine();
             if (codigoDESCUENTO[i]!= null ){ 
                 if(codigoDESCUENTO[i].length()==4){
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (codigoDESCUENTO[i].equals(codigoDESCUENTO[j])){
                             System.out.println("EL CODIGO YA EXISTENTE - INGRESE DE NUEVO");
                             codigoDESCUENTO[i] = input.nextLine();
                         
                         }
                   }          
                 }
             }            
             else{
                 System.out.println("EL CODIGO INVALIDO ** RECUERDE: 4 caracteres \n - INGRESE DE NUEVO");
                 codigoDESCUENTO[i] = input.nextLine();
             }
         
         }
             // asignar y verificar porcentaje
          System.out.println("ingrese porcentaje de descuento: ");
          cantDESCUENTO[i]  = input.nextDouble();
          input.nextLine();
             
             if (cantDESCUENTO[i]<=0 || cantDESCUENTO[i]>=100){ 
                 System.out.println("PORCENTAJE INVALIDO - tiene que estar entre 0 y 100 \n **** INGRESE DE NUEVO **** ");
                 cantDESCUENTO[i]= input.nextDouble();
                 input.nextLine();      
             }
             else{
                 
             }
         }
        } else {
             System.out.println("CODIGO"+"\t\t % de descuento");
		for(int i=0;i<20;i++){
                    if(codigoDESCUENTO[i]!=("null") && cantDESCUENTO[i]!=0.0){
        System.out.println((i+1)+"."+codigoDESCUENTO[i]+"\t\t"+cantDESCUENTO[i]+"%");
        
                }
                }
             return;
         }
         
         System.out.println("DESEA AGREGAR 5 CODIGOS MAS? - escriba si o no");      
         seguir2 = input.nextLine(); 
         
         if (seguir2.equals("si")){
        
        for(int i=10;i<15;i++){
         System.out.println("ingrese el codigo de descuento: ");
         codigoDESCUENTO[i] = input.nextLine();
             if (codigoDESCUENTO[i]!= null ){ 
                 if(codigoDESCUENTO[i].length()==4){
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (codigoDESCUENTO[i].equals(codigoDESCUENTO[j])){
                             System.out.println("EL CODIGO YA EXISTENTE - INGRESE DE NUEVO");
                             codigoDESCUENTO[i] = input.nextLine();
                         
                         }
                   }          
                 }
             }            
             else{
                 System.out.println("EL CODIGO INVALIDO ** RECUERDE: 4 caracteres \n - INGRESE DE NUEVO");
                 codigoDESCUENTO[i] = input.nextLine();
             }
         
         }
             // asignar y verificar porcentaje
          System.out.println("ingrese porcentaje de descuento: ");
          cantDESCUENTO[i]  = input.nextDouble();
          input.nextLine();
             
             if (cantDESCUENTO[i]<=0 || cantDESCUENTO[i]>=100){ 
                 System.out.println("PORCENTAJE INVALIDO - tiene que estar entre 0 y 100 \n **** INGRESE DE NUEVO **** ");
                 cantDESCUENTO[i]= input.nextDouble();
                 input.nextLine();      
             }
             else{
                 
             }
         }
        } else {
             System.out.println("CODIGO"+"\t\t % de descuento");
		for(int i=0;i<20;i++){
                    if(codigoDESCUENTO[i]!=("null") && cantDESCUENTO[i]!=0.0){
        System.out.println((i+1)+"."+codigoDESCUENTO[i]+"\t\t"+cantDESCUENTO[i]+"%");
        
                }
                }
             return;
         }
         
         System.out.println("DESEA AGREGAR 5 CODIGOS MAS? - escriba si o no");      
         seguir2 = input.nextLine(); 
         
         if (seguir2.equals("si")){
        
        for(int i=15;i<20;i++){
         System.out.println("ingrese el codigo de descuento: ");
         codigoDESCUENTO[i] = input.nextLine();
             if (codigoDESCUENTO[i]!= null ){ 
                 if(codigoDESCUENTO[i].length()==4){
                 if(i>0){
                     for(int j=0;j<i;j++){
                         if (codigoDESCUENTO[i].equals(codigoDESCUENTO[j])){
                             System.out.println("EL CODIGO YA EXISTENTE - INGRESE DE NUEVO");
                             codigoDESCUENTO[i] = input.nextLine();
                         
                         }
                   }          
                 }
             }            
             else{
                 System.out.println("EL CODIGO INVALIDO ** RECUERDE: 4 caracteres \n - INGRESE DE NUEVO");
                 codigoDESCUENTO[i] = input.nextLine();
             }
         
         }
             // asignar y verificar porcentaje
          System.out.println("ingrese porcentaje de descuento: ");
          cantDESCUENTO[i]  = input.nextDouble();
          input.nextLine();
             
             if (cantDESCUENTO[i]<=0 || cantDESCUENTO[i]>=100){ 
                 System.out.println("PORCENTAJE INVALIDO - tiene que estar entre 0 y 100 \n **** INGRESE DE NUEVO **** ");
                 cantDESCUENTO[i]= input.nextDouble();
                 input.nextLine();      
             }
             else{
                 
             }
         }
        } else {
             
         }
        
        System.out.println("CODIGO"+"\t\t % de descuento");
		for(int i=0;i<20;i++){
                    if(codigoDESCUENTO[i]!=("null") && cantDESCUENTO[i]!=0.0){
        System.out.println((i+1)+"."+codigoDESCUENTO[i]+"\t\t"+cantDESCUENTO[i]+"%");
        
                }
                }
    }
    public static void REPORTE(){
        System.out.println("----------REPORTE DE VENTAS ----------");
        System.out.println("CANTIDAD --------- PRODUCTO");
        for (int i = 0; i < 20; i++) {
        for (int j = i + 1; j < 20; j++) {
            int tmp = 0;
            if (Cantidad[i] < Cantidad[j]) //DESCIENDIENTE MAS GRANDE MAS PEQUEÑO
            {
                tmp = Cantidad[i];
                Cantidad[i] = Cantidad[j];
                Cantidad[j] = tmp;
                String tmp2 = articulo[i]; 
                articulo[i] = articulo[j]; 
                articulo[j] = tmp2;
            }
        }
        if(articulo[i]!=("null") && precio[i]!=0.0) 
                    {
        System.out.println((i+1)+"."+Cantidad[i]+"\t\t"+articulo[i]);
                    }
    }
    }
    
    
}

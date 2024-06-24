import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class modainfa {
    //FUNCION DE OECHSLE

    String [] OPCIONES ={"RECIEN NACIDO ==> S/ 34.95","PERSONAJES FAVORITOS ==> S/.39.95", "ZAPATOS NIÑOS ==> S/111.00"};
    double [] precio_OPCIONES ={34.95,39.95,111.00};
    double[] subtotal_combos={0,0,0,0,0};
    double igv, subtotal,subtotal0,totalpagar;
    int [] carrito =new int[OPCIONES.length];
    String respuesta;
    Double IGV = 0.18;
    String metodo_pago_seleccionado ;
    int op,cantidad;

    Scanner MODAINFA = new Scanner(System.in);

    public String oechsle () {

        System.out.println("------PRENDAS-----");
        System.out.println("ESCOJA ENTRE LAS SIGUIENTES OPCIONES:");
        for(int i = 0 ; i<OPCIONES.length ; i++ ){
            System.out.println("Opción "+(i+1)+":"+OPCIONES[i]);
        }
        op = MODAINFA.nextInt();

        switch (op) {
            case 1:
                RECIEN_NACIDO();
                break;

            case 2:
                PERSONAJES_FAVORITOS();
                break;
            case 3:
                ZAPATOS ();
                break;
        }
        return null;
    }
    // FUNCION DE RECIEN NACIDO OP 1
    public String RECIEN_NACIDO() {

        System.out.println("BUENA OPCION ");
        System.out.println(OPCIONES[0]);
        System.out.println("LA PRENDA MAS PEDIDA ES ");
        System.out.println("PIJAMA 2 PIEZAS PARA RECEIN NACIDO BABY CIRCUS PANTALON");
        System.out.println("ELIJA EL METODO DE PAGO");
        System.out.println("1. TARJETA");
        System.out.println("2. EFECTIVO");
        op = MODAINFA.nextInt();

        switch (op) {


            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= MODAINFA.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+" "+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= MODAINFA.nextInt();
                MODAINFA.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo a la opción de MODA INFANTIL");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantas prendas? Ingrese la cantidad");
                cantidad= MODAINFA.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= MODAINFA.nextInt();
                MODAINFA.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo a la opción de combos");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
        }
        return null;
    }
    // FUNCION DE PERSONAJES OP 2
    public String PERSONAJES_FAVORITOS() {

        System.out.println(" buena eleccion");
        System.out.println("la mas pedida es :");
        System.out.println("POLO DE NIÑA BARBIE COLOR BLANCO");
        System.out.println("ELIJA LA OPCIÓN DE METODO DE PAGO");
        System.out.println("1. TARJETA");
        System.out.println("2." + " EFECTIVO ");
        op = MODAINFA.nextInt();

        switch (op) {

            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= MODAINFA.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= MODAINFA.nextInt();
                MODAINFA.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo ");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= MODAINFA.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= MODAINFA.nextInt();
                MODAINFA.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo ");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMENU();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
        }
        return null;
    }
    // FUNCION DE ZAPATOS OP 3
    public String ZAPATOS() {

        System.out.println("ELIGIO ZAPATOS");
        System.out.println("EL MAS PEDIDO ES ");
        System.out.println("ZAPATO ESCOLAR CUERO PAR&SS.MV24-2068 NEGRO");
        System.out.println("ELIJA LA OPCIÓN DE METODO DE PAGO");
        System.out.println("1. TARJETA");
        System.out.println("2. EFECTIVO");
        op = MODAINFA.nextInt();
        switch (op) {
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad= MODAINFA.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+OPCIONES[0]);
                System.out.println("¿Desea elegir otra opcion más?  1 SI/ 2 NO / 3 Menu Principal");
                op= MODAINFA.nextInt();
                MODAINFA.nextLine();
                if(op==1)
                {
                    System.out.println("Volviendo ");
                    this.oechsle();
                }
                else if (op==2){
                    this.PagoMODA();

                }
                else if (op==3){
                    //this.FMODA();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;
            case 2:
                double precio_tienda= 24.90;
                double total_pagartienda;
                double IGV = 0.18;
                double factura;
                int cantidad_tienda;

                System.out.println("CUANTAS PRENDAS DESEA LLEVAR");
                cantidad_tienda = MODAINFA.nextInt();
                total_pagartienda = precio_tienda * cantidad_tienda;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                System.out.println("EL TOTAL ES :");
                factura = total_pagartienda * IGV;
                factura = factura + total_pagartienda ;
                System.out.println("Subtotal es de: " + total_pagartienda + " soles");
                System.out.println("IGV = 18%");
                System.out.println("Por favor su pedido, tiene un total de: " + total_pagartienda+ " soles");
                System.out.println("GRACIAS POR PREFERIRNOS CONTIGO SIEMPRE OECHSLE");
                break;
        }
        return null;
    }

    //EXPORTAR BOLETA
    public String ExportarBoleta() {
        try {
            File archivo = new File("C1:\\boleta.txt");
            FileWriter escritor = new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------");
            escritor.write(" SUBTOTAL :" + subtotal);
            escritor.write(" IGV :" + igv);
            escritor.write(" TOTAL :" + totalpagar);
            escritor.close();
        } catch (IOException e) {
            System.out.println("Error al exportar la factura.");
            e.printStackTrace();

        }
        return null;
    }
    // pago MODAS
    public double PagoMODA(){
        double cantidadtotalmenus=Arrays.stream(carrito).sum();


        igv= subtotal0* precio_OPCIONES[1];
        subtotal=subtotal0-igv;
        totalpagar=subtotal+igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :"+subtotal);
        System.out.println(" IGV :"+igv);
        System.out.println(" TOTAL :"+totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }
    public static void main (String[]args){
        modainfa moda = new modainfa();
        moda.oechsle();

    }

}


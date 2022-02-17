import complementos.Apoyos;
import secciones.BarraCircular;
import secciones.Viga;
import secciones.VigaRectangular;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        VigaRectangular v1 = new VigaRectangular(20, 10, 500, 210, 80);
        v1.baricentro();

        Apoyos vf = new Apoyos(2, "Fijo", 0);
        Apoyos vm = new Apoyos(1 , "Móvil", v1.getLargo());

        System.out.println("Esfuezo normal en Viga1 :" + v1.solicitacionAxil(100, "N", "z") + " N/cm2");

        System.out.println("Esfuerzo a Flexion Recta en direccion Y: " + v1.solicitacionAFlexion(50, "Nm", "y"));

        Viga viga = new VigaRectangular(20, 10, 500, 210, 80);

        /*
        * bolsa de gatos de tamaño fijo y con posiciones
        * Es una lista fija en longitud
        * Ventajas: cuando busco algo, lo hace inmediato
        * Desventaja: es de longitud fija.
        * Cuando lo uso: cuando sé la cantidad de elementos que voy a usar. Y cuando voy a consultar muchas veces
        * los valores.
        * */
        List<Integer> enteros = new ArrayList<>(2);
        enteros.add(2);
        enteros.add(3);
        enteros.add(5);
        enteros.add(2);
        System.out.println(enteros.get(0));
        System.out.println(enteros);


        /*
         * bolsa de gatos de tamaño variable y con posiciones
         * Es una lista dinámica
         * Ventajas: no es necesario saber la cantidad de elementos con la que voy a trabajar
         * Desventaja: para buscar algun dato, tengo que recorrer toda la lista.
         * Cuando lo uso: cuando tengo que hacer pocas consultas, pero muchas escrituras / agregados
         * */
        List<Integer> enterosLinkedList = new LinkedList<>();
        enterosLinkedList.add(2);
        enterosLinkedList.add(3);

        /*
        * bolsa de gatos que no se repiten y sin posiciones
        * */
        Set<Integer> set = new LinkedHashSet<>();
        set.add(3);
        set.add(3);
        System.out.println(set);

        /*
        * Nombre a las posiciones
        * Cuando queres acceder a un valor directamente
        * */
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("willi", 9);
        mapa.put("gerito", 6);

        System.out.println(mapa.get("willi"));


        List<Viga> vigas = new LinkedList<>();
        vigas.add(new VigaRectangular(20, 10, 500, 210, 80));
        vigas.add(new VigaRectangular(10, 5, 300, 210, 80));
        vigas.add(new VigaRectangular(15, 7, 150, 210, 80));
        vigas.add(new BarraCircular(10, 20, 10, 10));

        for(int i = 0; i < vigas.size(); i++){
            System.out.println("Este es una valor de la lista " + vigas.get(i).getLargo());
        }


//        System.out.println("");
//
//        BarraCircular v2 = new BarraCircular(5, 500, 210, 80);
//
//        v2.baricentro();
//        v2.momentosPolarDeInercia();
//        v2.rigidezAxial();
//        v2.condicionRigidezFlexional();
//        v2.condicionRigidezTorsional();
//
//        System.out.println("");
//
//        IPNDobleT v3 = new IPNDobleT(22, 9.8F, 500, 210, 85, "220");
//        v3.baricentro();
//        v3.momentosDeInercia();
//        v3.rigidezAxial();
//        v3.condicionRigidezFlexional();


        List<Repartidor> repartidores = new LinkedList<>();

        Repartidor juan = new Repartidor("juan", 40d, 60d);
        repartidores.add(juan);


        List<Producto> productoList = new ArrayList<>();
        productoList.add(new Producto("Hamburguesa"));
        productoList.add(new Producto("Coca"));

        List<Pedido> pedidos = new LinkedList<>();

        Pedido pedido = new Pedido(productoList, 20d, 70d);
        Pedido pedido2 = new Pedido(productoList, 50d, 80d);

        pedidos.add(pedido);
        pedidos.add(pedido2);

        for(Repartidor repartidor : repartidores){
            repartidor.asignarPedido(pedidos);
        }

        List<Pedido> pedidosDeJuan = juan.quePedidosTenes();
        System.out.println(pedidosDeJuan);
    }
}

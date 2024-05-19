package SERVIDOR;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import ENTIDADES.Categoria;
import ENTIDADES.Compra;
import ENTIDADES.Producto;
import ENTIDADES.Venta;
import RMI.RemoteInterface;

public class MainCliente {
	public static void main(String[]args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Se ingresaran los valores del arreglo local");

			Registry registroCliente = LocateRegistry.getRegistry("192.168.43.58", 1234);
			RemoteInterface rmi = (RemoteInterface) registroCliente.lookup("Costos");

			//lista datos
			List<Categoria> listCategoria = new ArrayList<>();
			listCategoria.add(new Categoria(1, "Celular", "Dispositivo móvil para realizar llamadas y otras funciones"));
			listCategoria.add(new Categoria(2, "Televisor", "Dispositivo de entretenimiento con pantalla para visualizar contenido audiovisual"));
			listCategoria.add(new Categoria(3, "Parlante", "Dispositivo para reproducir sonido de manera amplificada"));
			listCategoria.add(new Categoria(4, "Auriculares", "Dispositivo para escuchar sonido de manera personal"));
			listCategoria.add(new Categoria(5, "Computadora", "Dispositivo electrónico para procesar y manipular datos"));

			List<Producto> listProducto = new ArrayList<>();
			listProducto.add(new Producto(1, "Smartphone", "Teléfono inteligente de última generación", 699.99, 0.2, listCategoria.get(0)));
			listProducto.add(new Producto(2, "Laptop", "Computadora portátil con procesador de alta velocidad", 1299.99, 2.5, listCategoria.get(4)));
			listProducto.add(new Producto(3, "Smart TV", "Televisor con pantalla LED de 55 pulgadas y funciones inteligentes", 899.99, 15, listCategoria.get(1)));
			listProducto.add(new Producto(4, "Tablet", "Dispositivo móvil con pantalla táctil de 10 pulgadas", 399.99, 0.7, listCategoria.get(0)));
			listProducto.add(new Producto(5, "Cámara digital", "Cámara compacta de alta resolución con zoom óptico", 499.99, 0.5, listCategoria.get(0)));
			listProducto.add(new Producto(6, "Auriculares inalámbricos", "Auriculares Bluetooth con cancelación de ruido", 149.99, 0.1, listCategoria.get(3)));
			listProducto.add(new Producto(7, "Altavoz Bluetooth", "Altavoz portátil con conexión inalámbrica y batería recargable", 79.99, 0.3, listCategoria.get(2)));
			listProducto.add(new Producto(8, "Router WiFi", "Dispositivo para redes inalámbricas con tecnología de doble banda", 89.99, 0.4, listCategoria.get(4)));
			listProducto.add(new Producto(9, "Impresora multifunción", "Impresora láser con escáner y copiadora integrados", 299.99, 8, listCategoria.get(4)));
			listProducto.add(new Producto(10, "Reproductor de Blu-ray", "Reproductor de discos Blu-ray con capacidad de reproducción en 4K", 129.99, 2.2, listCategoria.get(1)));

			List<Venta> listVenta = new ArrayList<>();
			listVenta.add(new Venta(1, new Date(2024, 5, 15), 4, listProducto.get(0).getPrecioUnitario()*4, listProducto.get(0)));
			listVenta.add(new Venta(2, new Date(2024, 5, 16), 3,  listProducto.get(1).getPrecioUnitario()*3, listProducto.get(1)));
			listVenta.add(new Venta(3, new Date(2024, 5, 17), 2, listProducto.get(2).getPrecioUnitario()*2, listProducto.get(2)));
			listVenta.add(new Venta(4, new Date(2024, 5, 18), 4, listProducto.get(3).getPrecioUnitario()*4, listProducto.get(3)));
			listVenta.add(new Venta(5, new Date(2024, 5, 19), 3, listProducto.get(4).getPrecioUnitario()*3, listProducto.get(4)));
			listVenta.add(new Venta(6, new Date(2024, 5, 20), 2, listProducto.get(5).getPrecioUnitario()*2, listProducto.get(5)));
			listVenta.add(new Venta(7, new Date(2024, 5, 21), 4, listProducto.get(6).getPrecioUnitario()*4, listProducto.get(6)));
			listVenta.add(new Venta(8, new Date(2024, 5, 22), 3, listProducto.get(7).getPrecioUnitario()*3, listProducto.get(7)));
			listVenta.add(new Venta(9, new Date(2024, 5, 23), 2, listProducto.get(8).getPrecioUnitario()*2, listProducto.get(8)));
			listVenta.add(new Venta(10, new Date(2024, 5, 24), 4, listProducto.get(9).getPrecioUnitario()*4, listProducto.get(9)));

			List<Compra> listCompra = new ArrayList<>();
			listCompra.add(new Compra(1, new Date(2024, 5, 5), 5, (listProducto.get(0).getPrecioUnitario() - 30) * 5, listProducto.get(0)));
			listCompra.add(new Compra(2, new Date(2024, 5, 6), 4, (listProducto.get(1).getPrecioUnitario() - 30) * 4, listProducto.get(1)));
			listCompra.add(new Compra(3, new Date(2024, 5, 7), 6, (listProducto.get(2).getPrecioUnitario() - 30) * 6, listProducto.get(2)));
			listCompra.add(new Compra(4, new Date(2024, 5, 8), 7, (listProducto.get(3).getPrecioUnitario() - 30) * 7, listProducto.get(3)));
			listCompra.add(new Compra(5, new Date(2024, 5, 9), 4, (listProducto.get(4).getPrecioUnitario() - 30) * 4, listProducto.get(4)));
			listCompra.add(new Compra(6, new Date(2024, 5, 10), 5, (listProducto.get(5).getPrecioUnitario() - 30) * 5, listProducto.get(5)));
			listCompra.add(new Compra(7, new Date(2024, 5, 11), 8, (listProducto.get(6).getPrecioUnitario() - 30) * 8, listProducto.get(6)));
			listCompra.add(new Compra(8, new Date(2024, 5, 12), 5, (listProducto.get(7).getPrecioUnitario() - 30) * 5, listProducto.get(7)));
			listCompra.add(new Compra(9, new Date(2024, 5, 13), 6, (listProducto.get(8).getPrecioUnitario() - 30) * 6, listProducto.get(8)));
			listCompra.add(new Compra(10, new Date(2024, 5, 14), 5, (listProducto.get(9).getPrecioUnitario() - 30) * 5, listProducto.get(9)));


			// Llamada a métodos remotos
			System.out.println("Bienvenido al sistema, seleccione una de las siguientes opciones:");
			int opcion = 0;
			while (opcion!=7){
				System.out.println("1.Enviar y mostrar en el servidor la lista de las categorias.");
				System.out.println("2.Enviar y mostrar en el servidor la lista de las productos.");
				System.out.println("3.Enviar y mostrar en el servidor la lista de las ventas.");
				System.out.println("4.Enviar y mostrar en el servidor la lista de las compras.");
				System.out.println("5.Mostrar en el servidor el total de compras del mes de mayo.");
				System.out.println("6.Mostrar en el servidor el total de ganancias del mes de mayo.");
				System.out.println("7.salir");

				opcion = sc.nextInt();
				switch (opcion){
					case 1:
						rmi.leerListaCategoria(listCategoria);
						break;
					case 2:
						rmi.leerListaProducto(listProducto);
						break;
					case 3:
						rmi.leerListaVenta(listVenta);
						break;
					case 4:
						rmi.leerListaCompra(listCompra);
						break;
					case 5:
						rmi.calcularTotalComprasMes(5,listVenta);
						break;
					case 6:
						rmi.calcularGananciasMes(5,listCompra,listVenta);
						break;
					case 7:
						System.out.println("Gracias por utilizar nuestros servicios");
						break;

					default:
						System.out.println("Opcion no valida");
				}
			}


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

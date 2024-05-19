package RMI;

import ENTIDADES.Categoria;
import ENTIDADES.Compra;
import ENTIDADES.Producto;
import ENTIDADES.Venta;

import java.rmi.Remote;
import java.util.List;

public interface RemoteInterface extends Remote {
	public void leerListaCategoria(List<Categoria> listCategoria) throws Exception;
	public Categoria buscarCategoria(int idCategoria, List<Categoria> listCategoria)throws Exception;
	public void leerListaCompra(List<Compra> listCompra) throws Exception;
	public Compra buscarCompra(int idCompra, List<Compra> listCompra)throws Exception;
	public void leerListaProducto(List<Producto> listProducto) throws Exception;
	public Producto buscarProducto(int idProducto, List<Producto> listProducto)throws Exception;
	public void leerListaVenta(List<Venta> listVenta) throws Exception;
	public Venta buscarVenta(int idVenta, List<Venta> listVenta)throws Exception;
	public void calcularGananciasMes(int mes, List<Compra> compras, List<Venta> ventas);
	public void calcularTotalComprasMes(int mes, List<Venta> ventas);
}


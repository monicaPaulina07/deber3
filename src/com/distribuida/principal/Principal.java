package com.distribuida.principal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.DatosEmpresa;
import com.distribuida.entities.DetalleFactura;
import com.distribuida.entities.Factura;
import com.distribuida.entities.Libro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Cliente cliente = context.getBean("cliente",Cliente.class);
		Factura factura = context.getBean("factura",Factura.class);
		DetalleFactura detalleFactura = context.getBean("detalleFactura",DetalleFactura.class);
		Libro libro = context.getBean("libro",Libro.class);
		Categoria categoria = context.getBean("categoria",Categoria.class);
		Autor autor = context.getBean("autor",Autor.class);
		DatosEmpresa datosEmpresa= context.getBean("datosEmpresa", DatosEmpresa.class);
		
		//CLIENTE
		cliente.setIdCliente(1);
		cliente.setCedula("1751286087");
		cliente.setNombre("Daniel");
		cliente.setApellido("Chicaiza");
		cliente.setDireccion("Quito, Buenavista");
		cliente.setTelefono("098745632");
		cliente.setCorreo("danielchicaiza15@gmail.com");
		
		//FACTURA
		factura.setIdFactura(1);
		factura.setNumFactura("001");
		factura.setFecha("28/11/2023");
		factura.setTotalNeto(17.85);
		factura.setIva(1.12);
		factura.setTotal(factura.getTotalNeto()*factura.getIva());
		
		//LIBRO
		libro.setIdLibro(1);
		libro.setTitulo("LA BIBLIA");
		libro.setEditorial("Diosito");
		libro.setNumPaginas(320);
		libro.setEdicion(2);
		libro.setIdioma("Español");
		libro.setFechaPublicacion("700 a.C");
		libro.setDescripcion("La Biblia es el conjunto de libros canónicos del judaísmo y el cristianismo. La canonicidad de cada libro varía dependiendo de la tradición adoptada. Según las religiones judía y cristiana, transmite la palabra de Dios.");
		libro.setNumEjemplares(400);
		libro.setPortada("Original");
		libro.setPresentacion("Se puede decir que la Biblia es una obra colectiva, es decir, obra de todo un pueblo que, a través del tiempo, ha plasmado en ella su tradición. De ahí se explica por qué la mayoría de los autores del Antiguo Testamento son anónimos, es decir, desconocidos, para que se pusiera de manifiesto este carácter colectivo. Estos autores se basaron en la tradición oral.");
		libro.setPrecio(15.75);
		
		
		//CATEGORIA
		categoria.setIdCategoria(1);
		categoria.setCategoria("HISTORIA");
		categoria.setDescripcion("La biblia");
		
		//AUTOR
		autor.setIdAutor(1);
		autor.setNombre("Diosito");
		autor.setApellido("Jesús de Nazaret o Jesús de Galilea");
		autor.setPais("Jerusalen");
		autor.setDireccion("Egipto");
		autor.setTelefono("6734689");
		autor.setCorreo("Diosito@gmail.com");
		
		
		//IMPRIMIR
		System.out.println(datosEmpresa.toString());
		System.out.println(autor.toString());
		System.out.println(categoria.toString());
		System.out.println(libro.toString());
		System.out.println(factura.toString());
		System.out.println(cliente.toString());
		System.out.println(detalleFactura.toString());
		
		context.close();
	}

}

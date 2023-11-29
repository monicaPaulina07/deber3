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
		cliente.setNombre("Dimas");
		cliente.setApellido("Vera");
		cliente.setDireccion("Quito, Buenavista");
		cliente.setTelefono("098745632");
		cliente.setCorreo("dimasv@hotmail.com");
		
		//FACTURA
		factura.setIdFactura(1);
		factura.setNumFactura("001");
		factura.setFecha("29/11/2023");
		factura.setTotalNeto(17.85);
		factura.setIva(1.12);
		factura.setTotal(factura.getTotalNeto()*factura.getIva());
		
		//LIBRO
		libro.setIdLibro(1);
		libro.setTitulo("OPIO EN LAS NUBES");
		libro.setEditorial("Santillana");
		libro.setNumPaginas(320);
		libro.setEdicion(2);
		libro.setIdioma("Español");
		libro.setFechaPublicacion("2010");
		libro.setDescripcion("Es una novela que se basa en las experiencias y estilo de vida de un grupo de adictos a las drogas y fiestas");
		libro.setNumEjemplares(400);
		libro.setPortada("Original");
		libro.setPresentacion("La historia es contada por tres narradores en un mundo paralelo que recrea la fantasía de una época surrealista enmarcada en una ciudad tan propia como la Bogotá de esos años");
		libro.setPrecio(15.75);
		
		
		//CATEGORIA
		categoria.setIdCategoria(1);
		categoria.setCategoria("Aventura");
		categoria.setDescripcion("Opio en las nubes");
		
		//AUTOR
		autor.setIdAutor(1);
		autor.setNombre("Rafael");
		autor.setApellido("Chaparro Madiedo");
		autor.setPais("Colombia");
		autor.setDireccion("Bogota");
		autor.setTelefono("56793");
		autor.setCorreo("MadiedoCha@hotmail.com");
		
		
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

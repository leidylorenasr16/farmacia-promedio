# Promedio de ventas farmacia

---

### Ejercicio:
En su labor como programador de software ha sido elegido para el desarrollo de una aplicación que necesita un farmaceuta que desea calcular el promedio de las 3 (tres) últimas compras de un cliente. Esta farmacia evalúa las ventas a los clientes de forma permanente y calcula el promedio general de ventas en la farmacia. Como informacion básica de cada cliente se debe registar el número de identificacion, su nombre y sede donde hizo la compra.

---

##### Aclaración

- Se supondrá que la aplicación solo se requiere para calcular el promedio de un único periodo de tiempo.
- Para efectos de mantener la simplicidad del ejemplo no se contemplan manejar persistencia en el almacenamiento de los datos.
- No se realiza validacion, ni se verifica calidad en los datos ingresados.


### Análisis del ejercicio
##### Aproximación Plantilla Historia de usuario
![](/images/HUF1.jpg)
![](/images/HUF2.jpg)

---

![](/images/AproximacionCasoDeUso.png)

---

##### Aproximación Diagrama de flujo
![](/images/DiagramaDeFlujo.png)

---

##### Aproximación Seudocódigo

Inicio  
    Caracteres: identificaciones[50], nombres[50], sucursales[50]
	Real: comprauno[50], comprados[50], compratres[50]
	Caracteres: identificacion, nombre, sucursal
	Entero: numClientes, i
	Real: compra1, compra2 compra3, promedio <- 0
	Imprimir: ‘Digite el numero de clientes’
	Asignar: numClientes
	Para i=0 hasta numClientes -1, 1
	Imprimir: ‘Digite la identificacion del cliente’
	Asignar: identificacion
	Imprimir: ‘Digite el nombre del cliente’
	Asignar: nombre
	Imprimir: ‘Digite la sucursal del cliente’
	Asignar: sucursal
	Imprimir: ‘Digite la compra uno del cliente’
	Asignar: compra1
	Imprimir: ‘Digite la compra dos del cliente’
	Asignar: compra2
    Imprimir: ‘Digite la compra tres del cliente’
	Asignar: compra3
	identificaciones[i] <- identificacion
	nombres[i] <- nombre
	sucursales[i] <- sucursal
	comprauno[i] <- compra1
	comprados[i] <- compra2
	compratres[i] <- compra3
	finPara
	Para i=0 hasta numClientes -1, 1
	promedio <- promedio + ((comprauno[i]+comprados[i]+compratres[i])/3)/numClientes
	finPara
	Imprimir: ‘El promedio es: ‘ + promedio
Fin



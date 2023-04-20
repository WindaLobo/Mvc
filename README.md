># MVC: 
>Patrón MVC en Java.
El patrón MVC (Modelo, Vista, Controlador), es un patrón de arquitectura de software que separa los datos de una aplicación, la interfaz que ve el usuario de la logica del negocio en tres componentes distintos. Es más frecuente en aplicaciones Web que en aplicaciones de escritorio, sin embargo es aplicable tambien a este, sin ningun problema, Java ya contaba hace rato con Observer y Observable, herramientas que nos ayudan a la interacción entre la interfaz y el modelo, sin embargo, el ejemplo que dejamos a continuación no hace uso de estas herramientas.

## La descripción del patrón MVC es:
> - #### Vista (View):
 >Representa la interfaz de usuario y todas las herramientas con las cuales el usario hace uso del programa.

> - #### Modelo (Model): 
>Es donde esta toda la lógica del negocio, la representación de todo el sistema incluido la interacción con una base de datos, si es que el programa asi lo requiere.

> - #### Controlador (Controller):
>Este componente es el que responde a la interacción (eventos) que hace el usuario en la interfaz y realiza las peticiones al modelo para pasar estos a la vista. Aún no esta del todo claro, pero con el siguiente ejemplo, lo comprenderemos mejor.

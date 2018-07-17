#language: es

  Característica: Enviar Correo
    @adjunto
    Escenario: Enviar Correo con datos adjuntos
      Dado un correo electrónico "juliancarvajal@seven4n.com"
      Cuando ingrese al dominio del correo "https://mail.google.com/mail/u/0/#inbox"
      Entonces deseo enviar un correo electronico con el adjunto de la siguiente ruta "/home/s4n/practicaAutomatizacion/practicaAutomatizacion/src/test/java/archivos/adjunto.odt" o con el nombre del archivo "adjunto"
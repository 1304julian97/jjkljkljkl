#language: es

  Característica: ArchivoJson

    @json
    Escenario: Probando un Json
      Dado un archivo json recuperado de la siguiente ruta "/home/s4n/practicaAutomatizacion/practicaAutomatizacion/src/test/java/jsons/persona.json"
      Cuando cuando se convierta en un objeto Java
      Entonces imprimir las caracterisiticas
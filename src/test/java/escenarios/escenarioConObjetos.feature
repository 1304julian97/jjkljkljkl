#language: es

Característica: EscenarioConObjetos


  @ejemploObjetos
Escenario: Un escenerio que utilice Objetos
  Dado las siguientes personas:
    |Julian   |Carvajal |1997       |
    |Alejandra|Cadavid  |1995       |
  Cuando Su anio de nacimiento sea mayor a 1994
  Entonces imprima el nombre de la persona con mas edad
    Y también imprima su edad
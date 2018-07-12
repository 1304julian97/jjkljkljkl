$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("escenarios/escenario1.feature");
formatter.feature({
  "name": "Primer Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Este es mi primer escenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ejemplo1"
    }
  ]
});
formatter.step({
  "name": "Dado que yo soy algo",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCucumberEscenario1.dado_que_yo_soy_algo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "tenga el \"Selenide\" valido",
  "keyword": "When "
});
formatter.match({
  "location": "TestCucumberEscenario1.tenga_el_valido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "buscar el \"Selenide\" en google",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCucumberEscenario1.buscar_el_en_google(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Buscar mi nombre en google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ejemplo3"
    }
  ]
});
formatter.step({
  "name": "dado el nombre \"Julian\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCucumberEscenario1.dado_el_nombre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ingrese a \"http://www.google.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCucumberEscenario1.ingresehkhjhjkkjjkkjl_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "deseo buscar el nombre \"Julian\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCucumberEscenario1.deseo_bukjjnnjkjljkkjlkjlljkscar_el_nombre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("escenarios/escenario2.feature");
formatter.feature({
  "name": "Con table",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Compras",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ejemplo2"
    }
  ]
});
formatter.step({
  "name": "Yo compro un \u003carticulo\u003e en una tienda",
  "keyword": "Given "
});
formatter.step({
  "name": "Cuando ingrese a \"http://www.google.com\"",
  "keyword": "When "
});
formatter.step({
  "name": "yo busco su descripción \u003creferencia\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "Ropa",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "articulo",
        "referencia"
      ]
    },
    {
      "cells": [
        "Camisa deportiva Nike",
        "PoliesterXYZ"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Compras",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ejemplo2"
    }
  ]
});
formatter.step({
  "name": "Yo compro un Camisa deportiva Nike en una tienda",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCucumberEscenario2.yo_compro_un_Camisa_deportiva_Nike_en_una_tienda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cuando ingrese a \"http://www.google.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCucumberEscenario2.cuando_ingresssssssssssssssssssssssse_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "yo busco su descripción PoliesterXYZ",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCucumberEscenario2.yo_busco_su_descripción_PoliesterXYZ()"
});
formatter.result({
  "status": "passed"
});
formatter.examples({
  "name": "Consumer Electronics",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "articulo",
        "referencia"
      ]
    },
    {
      "cells": [
        "iPhone",
        "X"
      ]
    },
    {
      "cells": [
        "Huawei",
        "P10Lite"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Compras",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ejemplo2"
    }
  ]
});
formatter.step({
  "name": "Yo compro un iPhone en una tienda",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCucumberEscenario2.yo_compro_un_iPhone_en_una_tienda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cuando ingrese a \"http://www.google.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCucumberEscenario2.cuando_ingresssssssssssssssssssssssse_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "yo busco su descripción X",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCucumberEscenario2.yoLaDescripcionDeUnIphoneX()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Compras",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ejemplo2"
    }
  ]
});
formatter.step({
  "name": "Yo compro un Huawei en una tienda",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCucumberEscenario2.yo_compro_un_Huawei_en_una_tienda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cuando ingrese a \"http://www.google.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCucumberEscenario2.cuando_ingresssssssssssssssssssssssse_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "yo busco su descripción P10Lite",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCucumberEscenario2.yo_busco_su_descripción_P_Lite(int)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("escenarios/escenarioConObjetos.feature");
formatter.feature({
  "name": "EscenarioConObjetos",
  "description": "",
  "keyword": "Característica"
});
formatter.scenario({
  "name": "Un escenerio que utilice Objetos",
  "description": "",
  "keyword": "Escenario",
  "tags": [
    {
      "name": "@ejemploObjetos"
    }
  ]
});
formatter.step({
  "name": "las siguientes personas:",
  "rows": [
    {
      "cells": [
        "Julian",
        "Carvajal",
        "1997"
      ]
    },
    {
      "cells": [
        "Alejandra",
        "Cadavid",
        "1995"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "TestEscenarioConObjetos.las_siguientes_personas(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Su anio de nacimiento sea mayor a 1994",
  "keyword": "Cuando "
});
formatter.match({
  "location": "TestEscenarioConObjetos.su_anio_de_nacimiento_sea_mayor_a(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "imprima el nombre de la persona con mas edad",
  "keyword": "Entonces "
});
formatter.match({
  "location": "TestEscenarioConObjetos.imprima_el_nombre_de_la_persona_con_mas_edad()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "también imprima su edad",
  "keyword": "Y "
});
formatter.match({
  "location": "TestEscenarioConObjetos.también_imprima_su_edad()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("escenarios/escenarioParaJava8.feature");
formatter.feature({
  "name": "Ensyando java8",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "suma de dos numeros",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ejemploJava8"
    }
  ]
});
formatter.step({
  "name": "un 1",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "se suma con otro 2",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "me debe de arrojar la respuesta correcta 3",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
Feature: Primer Feature


  Scenario: Este es mi primer escenario
    Given Dado que yo soy algo
    When tenga el "Selenide" valido
    Then buscar el "Selenide" en google


    Scenario: Buscar mi nombre en google
      Given dado el nombre "Julian"
      When Ingrese a "http://www.google.com"
      Then deseo buscar el nombre "Julian"
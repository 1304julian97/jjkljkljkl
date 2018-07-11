Feature: Con table

  Scenario Outline: Compras
    Given Yo compro un <articulo> en una tienda
    When Cuando ingrese a "http://www.google.com"
    Then yo busco su descripción <referencia>

    Examples: Ropa
      | articulo              | referencia          |
      | Camisa deportiva Nike | PoliesterXYZ        |

    Examples: Consumer Electronics
      | articulo      | referencia    |
      | iPhone        | X             |
      | Huawei        | P10Lite       |
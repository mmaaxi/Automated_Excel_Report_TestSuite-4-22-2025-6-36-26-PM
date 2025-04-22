Feature: Validar Existencia y Correcto Llenado de la Columna 'IVA exento'

  Scenario: Verificación de la columna 'IVA exento' en el Excel exportado
    Given la aplicación ha exportado el archivo Excel
    When localizo la columna 'IVA exento'
    Then la columna 'IVA exento' se encuentra presente

  Scenario: Verificación de los montos en la columna 'IVA exento'
    Given la columna 'IVA exento' está presente en el documento
    When verifico que los montos se registren correctamente
    Then la columna muestra los montos exentos correctamente

  Scenario: Comparación de resultados con los requisitos especificados
    Given la información de la columna 'IVA exento'
    When comparo con las especificaciones del documento de requisitos
    Then la información cumple las especificaciones de la historia de usuario
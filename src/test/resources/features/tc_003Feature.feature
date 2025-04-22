Feature: Validar Adición de Columna 'Estado Código' al Lado de la Columna 'i'

  Scenario: Verificación de la nueva columna 'Estado Código' en el documento Excel
    Given El archivo Excel exportado está abierto
    When Localizo la columna inmediatamente a la derecha de la columna 'i'
    Then Observo la nueva columna titulada 'Estado Código'

  Scenario: Verificación de la ubicación de la columna 'Estado Código'
    Given El archivo Excel exportado está abierto
    When Verifico la ubicación de la columna 'Estado Código'
    Then La columna 'Estado Código' se encuentra en la posición esperada

  Scenario: Confirmación del nombre y posición con la HU
    Given El archivo Excel exportado está abierto
    When Comparo la columna con el anexo de la historia de usuario
    Then El nombre y posición cumplen con el requerimiento descrito
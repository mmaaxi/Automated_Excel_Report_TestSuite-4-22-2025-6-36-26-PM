Feature: Validar Existencia y Correcto Llenado de la Columna 'IVA 0%'

  Scenario: Verificar columna 'IVA 0%' en archivo Excel
    Given El usuario tiene acceso al archivo Excel
    When El usuario revisa el archivo Excel en búsqueda de la columna 'IVA 0%'
    Then La columna 'IVA 0%' se muestra en el documento

  Scenario: Validar montos apropiados en columna 'IVA 0%'
    Given La columna 'IVA 0%' está presente en el documento
    When El usuario valida los montos correspondientes a operaciones con tasa del 0% de IVA
    Then Los valores en la columna 'IVA 0%' son correctos y corresponden a las operaciones registradas

  Scenario: Comparar con documentación de la HU
    Given El usuario tiene acceso a la documentación de la HU
    When El usuario compara la propiedad y ubicación de la columna con la HU
    Then La propiedad y ubicación de la columna coinciden con lo especificado en la HU
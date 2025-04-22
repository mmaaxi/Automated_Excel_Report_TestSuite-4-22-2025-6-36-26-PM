Feature: Validar Cambio de Nombre de Columna

  Scenario: Cambiar el nombre de la columna de 'Monto Acumulado Folio OPC' a 'Monto Acumulado Folio OPC (2121)'
    Given El archivo Excel exportado está abierto
    When Localizo la columna titulada originalmente 'Monto Acumulado Folio OPC'
    Then La columna se ha visualmente renombrado
    And Verifico que el nuevo título sea 'Monto Acumulado Folio OPC (2121)'
    And Comparo con la especificación en la HU y el anexo correspondiente
    Then El cambio de nombre cumple con el requerimiento
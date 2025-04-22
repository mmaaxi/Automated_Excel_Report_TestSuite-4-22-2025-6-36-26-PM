Feature: Validar Existencia y Correcto Llenado de la Columna 'IVA retenido'

  Scenario: Verificar columna y su correcto llenado
    Given que el archivo Excel de la transacción está disponible
    When verifico la presencia de la columna "IVA retenido"
    Then la columna "IVA retenido" se muestra correctamente
    When confirmo que los montos retenidos están registrados en la columna "IVA retenido"
    Then los valores en la columna coinciden con los montos retenidos calculados
    When realizo pruebas de exactitud de IVA retenido
    Then los cálculos y registros son precisos
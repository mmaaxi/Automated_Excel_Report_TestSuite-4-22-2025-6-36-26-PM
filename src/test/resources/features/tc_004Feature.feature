Feature: Validar Actualización de Campos en la Columna 'estado'

  Scenario: Revisión y validación de la columna 'estado'
    Given el archivo exportado está disponible
    When reviso la columna 'estado'
    Then la columna se muestra y contiene valores actualizados

  Scenario: Comparación de valores con la especificación
    Given los valores actuales de la columna 'estado'
    When comparo estos valores con la especificación del anexo HU Sabana Contable_V3
    Then los valores han sido actualizados de acuerdo con los requerimientos

  Scenario: Pruebas de consistencia con datos variados
    Given diferentes conjuntos de datos para la columna 'estado'
    When realizo pruebas para validar la consistencia de la actualización
    Then la columna 'estado' presenta la información correcta en todas las filas
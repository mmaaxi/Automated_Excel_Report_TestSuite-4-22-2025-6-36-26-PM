Feature: Validación de fórmula de llave concatenada en Columna C

  Scenario: Validar fórmula de llave concatenada para cada fila
    Given El usuario abre el archivo Excel exportado
    When El usuario localiza la Columna C
    Then La Columna C contiene la llave generada para cada fila
    And La fórmula utilizada en cada celda de Columna C coincide con "=CONCATENATE(D2, "_", H2, "_", U2, "_", O2, "_", E2)"
    When El usuario realiza pruebas con datos de prueba
    Then Cada llave se genera correctamente basado en los valores de las celdas indicadas
Feature: Validar Creación y Cálculo de la Columna 'Monto acumulado Folio Reserva 5401'

  Scenario: Validar la existencia y cálculo de la columna 'Monto acumulado Folio Reserva 5401'
    Given Estoy en la pantalla de Reservas
    When Localizo la columna 'Monto (reserva)'
    Then Verifico la existencia de la columna 'Monto acumulado Folio Reserva 5401'
    When Verifico que la fórmula sume el monto de reserva acumulado y el monto de reserva actual
    Then La fórmula de suma opera correctamente
    When Realizo pruebas con datos de reserva
    Then La columna muestra los montos acumulados correctamente
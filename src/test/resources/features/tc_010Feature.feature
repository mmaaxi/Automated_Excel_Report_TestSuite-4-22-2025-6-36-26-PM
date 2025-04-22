Feature: Validation of the Formula Update in 'Monto Acumulado Folio OPC (2121)' for the Payment Movement

  Scenario: Verify formula and calculation in 'Monto Acumulado Folio OPC (2121)'
    Given I am on the payment movements section
    When I identify the cell for 'Monto Acumulado Folio OPC (2121)'
    Then the cell is located in the designated payment section

    When I verify the formula in the cell
    Then the formula should be "=Z4+AD5+AE5+AH5+AC5+AB5+AM5"

    When I execute the formula with different IVA values
    Then the result should be consistent with the sum of the given values
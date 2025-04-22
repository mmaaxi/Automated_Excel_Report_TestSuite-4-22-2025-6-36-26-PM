Feature: Validate Excel Export of Claim Accounting Report

  Scenario: Verify Export Functionality of Claim Accounting Report
    Given I navigate to Canned Reports > Module Claim > Report Code > Claim Accounting Report
    When I select 'Submit' and then 'View Log'
    Then the system should start the Excel file export process
    And the exported Excel file should reflect the requested modifications
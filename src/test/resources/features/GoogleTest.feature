Feature: Google Test




  @regression @google
  Scenario: Open Google page
    Given Launch Google Home Page
  @regression @facebook
  Scenario: Launch Facebook
  Given Open Facebook Page

  @regression @nsw
  Scenario Outline: Search for Plate Result
    Given Launch NswPage
    And User enters <plateNumber>
    And User tick the checkbox
    When User click on Next
    Then User is redirected to Plate result page
    Examples:
      | plateNumber |
      | KFS44       |
      | KTB86       |
      | KIE33       |


@stories
  Feature: Fill out Utest form to create an user
    As user, I want to create a new user account on Utest
    @challenge
    Scenario: Fill out the form to create an user
    Given than Carlos wants to create and user account on Utest
    When he complete the form with his information
      | strFirstName  | strLastName | strEmailAddress             | strBirthMonth | strBirthDay | strBirthYear | strUserLanguage | strCity | strPostalCode  | strCountry | strComputerOS | strOSVersion       | strDevicesLanguage | strMobileDevice | strDeviceModel | strDeviceOS | strPassword     | strPasswordConfirmation |
      | Carlos        | Perez       | xyzTest2@example.com.co     | December      | 2           | 1999         | Spanish         | Bogotá  | 111111         | Colombia   | Windows       | Windows 10 Pro     | Spanish            | Apple           | iPhone 13 mini | iOS 15.0.1  | _22Qur_dhP8L:zF | _22Qur_dhP8L:zF         |
    Then the web page redirects Carlos to the page with the a welcome message if a Captcha is not required
      | strWelcomeMessage                                                       |
      | Welcome to the world's largest community of freelance software testers! |

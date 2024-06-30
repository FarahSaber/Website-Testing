@smoke
  Feature: FO7 | user could open follow us links (Facebook, Twitter, RSS, YouTube)

    Scenario: User could open Facebook link
      When  User scroll down and click on FacebookIcon
      Then  User should be directed to Facebook Website "https://www.facebook.com/nopCommerce"

    Scenario: User could open Twitter link
      When  User scroll down and click on TwitterIcon
      Then  User should be directed to Twitter Website "https://twitter.com/nopCommerce"

    Scenario: User could open RSS link
      When  User scroll down and click on RSSIcon
      Then  User should be directed to RSS Website "https://demo.nopcommerce.com/new-online-store-is-open"

    Scenario: User could open YouTube link
      When  User scroll down and click on YouTubeIcon
      Then  User should be directed to YouTube Website "https://www.youtube.com/user/nopCommerce"



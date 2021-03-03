Feature: Login into RahulShetty academy application


Scenario: forgot password
Given user try to login with the valid username "Pramodvgwd600@gmail.com" and invalid Password "Pramod"
Then user should be able to redirected to the appropriate page when clicking on Forgot Password link
And navigate to Gmail with the new window and refresh the mails
And select the proper mail with the title Rahul Shetty having a current date and fetch the OTP
Then redirect to Rahul Sheety academy and click on submit by giving valid OTP
And By giving the new password and Confirm Password user must able to login





Feature: This is a test to verify Subscribe To Newsletter functionality

@Next4
Scenario: Verify Success message is displaying after sent with email
Given Launch NEXTeTICKET <"URL">
Then Scroll down till STNL Enter Email adress and click Send button
And Verify Success message is displaying after sent with email
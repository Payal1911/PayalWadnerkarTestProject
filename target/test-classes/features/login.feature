Feature:  Borrowing calculator

Scenario: Validate borrowing estimate is calculated correctly
Given Initialize the browser with chrome
And Navigate to "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" Site
And Select Application type as "Single"
And Select Number of dependants as "0"
And Select Property you would like to buy as "Home to live in"
And Enter Your annual income "80000"
And Enter Your annual other income "10000"
And Enter Monthly living expenses "500"
And Enter Current home loan monthly repayments "0"
And Enter Other loan monthly repayments "100"
And Enter Other monthly commitments "0"
And Total credit card limits "10000"
And Click on Borrow calculator
Then Verify borrowing estimate is "$482,000"
And close browsers

Scenario: Verify that entering only $1 for Living expenses, and leaving all other fields as zero, clicking ‘Work out how much I could borrow’ returns the error message
Given Initialize the browser with chrome
And Navigate to "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" Site
And Select Application type as "Single"
And Select Number of dependants as "0"
And Select Property you would like to buy as "Home to live in"
And Enter Your annual income "0"
And Enter Your annual other income "0"
And Enter Monthly living expenses "1"
And Enter Current home loan monthly repayments "0"
And Enter Other loan monthly repayments "0"
And Enter Other monthly commitments "0"
And Total credit card limits "0"
And Click on Borrow calculator
Then Verify error message is displayed
And close browsers

Scenario: Verify that clicking on the ‘start over’ button clears the form
Given Initialize the browser with chrome
And Navigate to "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/" Site
And Select Application type as "Single"
And Select Number of dependants as "0"
And Select Property you would like to buy as "Home to live in"
And Enter Your annual income "80000"
And Enter Your annual other income "10000"
And Enter Monthly living expenses "500"
And Enter Current home loan monthly repayments "0"
And Enter Other loan monthly repayments "100"
And Enter Other monthly commitments "0"
And Total credit card limits "10000"
And Click on Borrow calculator
Then Verify borrowing estimate is "$482,000"
When user click on start over button
Then Verify clicking the start over button clears the form
And close browsers
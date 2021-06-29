<h2>Java/Selenium/Cucumber</h2>
<br>

<b>TEST CASES</b>

- <i>[AssertQA] - Contact form validation	</i>

1) Navigate to "https://assertqa.com/"
2) Click on the "CONTACT US" button
3) In the "Full Name" field enter "Jovan Jovanovic"
4) In the "Email" field enter "jjovanovictest@gmail.com"
5) In the "Message" field enter "Test"
6) Click on the "SEND MESSAGE" button

Expected result: The "Thank You! Your message has been sent." message is displayed.


- <i>[AssertQA] - Contact form validation	</i>

1) Navigate to "https://assertqa.com/"
2) Click on the "CONTACT US" button
3) Leave the "Full Name" field empty"Full Name"
4) In the "Email" field enter "jjovanovictest@gmail.com"
5) In the "Message" field enter "Test"
6) Click on the "SEND MESSAGE" button

Expected result: The "Invalid name" message is displayed.


- <i>[AssertQA] - Contact form validation</i>

1) Navigate to "https://assertqa.com/"
2) Click on the "CONTACT US" button
3) In the "Full Name" field enter "Jovan Jovanovic"
4) Leave the "Email" field empty
5) In the "Message" field enter "Test"
6) Click on the "SEND MESSAGE" button

Expected result: The "Incorrect mail" message is displayed.


- <i>[AssertQA] - Contact form validation</i>

1) Navigate to "https://assertqa.com/"
2) Click on the "CONTACT US" button
3) In the "Full Name" field enter "Jovan Jovanovic"
4) In the "Email" field enter "jjovanovictest@gmail.com"
5) Leave the "Message" field empty
6) Click on the "SEND MESSAGE" button

Expected result: The "Oops! There was a problem with your submission. Please complete the form and try again." message is displayed.

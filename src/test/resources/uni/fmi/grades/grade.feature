Feature: Parent check grade for a certain student and subject

Background: 
    Given Parent is logged in

   Scenario Outline: Parent check grade for a certain student and subject
    Given Parent open student grade screen
    And inputs student id: "<studentId>"
    And inputs subject: "<subject>"
    And clicks submit button
		Then show message: "<message>"
		
		Examples: 
		| studentId      |  subject   |  message  							 													 |
		| 1901321105     | 	Java			|  Succesfully gets grade  													 |
		| 1901321105     | 	Java			|  You haven't permission to get this user grade		 |					
		| 1901321105     | 	Java			|  Student doesn't exist	 													 |
		| 1901321105     | 	Ftas			|  Subject doesn't exist   													 |
		| 1901321105     | 	Java			|  The student does not have a grade in this subject |
		



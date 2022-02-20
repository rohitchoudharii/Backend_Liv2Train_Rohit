# Liv2Train Internship Assignment.

## Dependencies
- spring-boot-web
- spring-bot-starter-data-jpa
- Hibernate Validator Engine
- H2 Database

## Assignment
First API
- Create a POST api to create and save a new training center with the following
fields.
  - CenterName (text)* (less than 40 characters)
  - CenterCode (text)* (exactly 12 character alphanumeric)
  - Address (object)*
    -Detailed Address
    - City
    - State
    - Pincode
  - Student Capacity (number)
  - Courses Offered (List<text>)
  - CreatedOn (Epoch time generated by System, not by user)
  - ContactEmail (text) (If present, email should be validated)
  - ContactPhone (text)* (Phone number validation )
- Api should accept data in json.
- Validations for mandatory fields should be done, along with phone, email and size
validations wherever mentioned in the aforementioned fields should be done
- As mentioned above with the fields, createdOn field should be populated from the
server based on the server timestamp, and the user’s input if present for this field
should be discarded.
- On validation failure, an appropriate error message should be shown. This should
be handled by Spring ExceptionHandler.
- On success, the api should return the newly saved TraningCenter information in
json format

 Second API
- Create a GET api to get list of all stored training centers information.
- Api should return the result in json format.
- In the absence of any training centers, we need to return an empty list in response

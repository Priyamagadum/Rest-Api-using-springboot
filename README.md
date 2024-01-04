# Rest-Api-using-springboot
Voting System API

## Usage Guide
1. Clone the repository.
2. Run the application using `./mvnw spring-boot:run` or `mvnw.cmd spring-boot:run`.
3. Access the APIs using the provided endpoints

### API Endpoints

- **Enter Candidate:**
  - Method: GET
  - URL: http://localhost:8080/entercandidate?name=ashu

- **Cast Vote:**
  - Method: GET
  - URL: http://localhost:8080/castvote?name=ashu

- **Count Vote:**
  - Method: GET
  - URL: http://localhost:8080/countvote?name=ashu

- **List Votes:**
  - Method: GET
  - URL: http://localhost:8080/listvote

- **Get Winner:**
  - Method: GET
  - URL: http://localhost:8080/getwinner
  
# Project Architecture and Design

This project follows a simple Spring Boot architecture with the following components:

1. **Controller (`CandidateController`):
   - Handles incoming HTTP requests.
   - Maps HTTP requests to corresponding methods in the `CandidateService`.

2. **Model (`Candidate`):
   - Represents the candidate entity with name and vote count.

3. **Service (`CandidateService`):
   - Implements business logic.
   - Uses local variables to store data.

4. **Application Entry Point (`YourApplication`):
   - Contains the main method to start the Spring Boot application.

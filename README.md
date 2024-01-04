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


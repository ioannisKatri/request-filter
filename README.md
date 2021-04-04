# Request Filter

A microservice that filters out Customers requests (badly formatted, containing invalid values, missing required fields, …).
Keeps a history on a day-by-day basis so that we can properly charge customers for the traffic they send.

`Under Construction`

## Utilizes

- Spring boot
- Spring Data
- Flyway database migration
- Controller Advices

## Criteria

### Invalid Requests:
* malformed JSON
* missing one or more fields
* with a customer ID not found in the database or for a customer which is disabled
* with a remote IP address which is in the blacklist
* with a user agent which is in the blacklist
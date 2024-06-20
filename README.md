
# TechHouse

Web application developed in Java with SpringBoot as framework for the back-end. Front-end developed in JS with React as framework.
In local usage, it is used MySQL for the Database.


## Use Cases
1. In-app user registration
2. In-app lock registration
3. Data collection of access attempts

## Screenshots

![App Screenshot](https://github.com/felixgespinosa/ioCasas/assets/115037849/8d4eb75c-1bad-4408-9a97-81803a2e7166)


## Data Models
1. User: userId (PK), user_Type, user_name, password, and token.

2. User_locks: user_lock_id (PK), lock_id, user_id, and state.

3. Record: record_id (PK), user_id, lock_id, and date_off_register.

4. Lock: lock_id (PK), and lock_name.

5. Relations:

    user (1:N) user_locks

    user (1:N) record

    user_locks (N:1) lock

    record_id (N:1) lock

 

 

# orm-self-edu
Main goal of the project is to create demo for common Java ORM frameworks and get practical skills during development. Ideally project will include profiles activating one of framework-specific interchangeable set of DAOs, to learn about technology limitations and strong/weak sides.

---------------------------

Database itself will be imitation of part of management system of Bus Depot.
It will include data on depot's assets: buses (characteristics like passenger capacity and fuel usage and real vehicles references), city routes, drivers, and some daily routine log to do SQL math.

---------------------------
Phase 1. Implement Hibernate representation.
Education:
https://docs.jboss.org/hibernate/orm/current/quickstart/html_single/#tutorial_annotations
http://docs.jboss.org/hibernate/orm/current/userguide/html_single/Hibernate_User_Guide.html

suggested by grow matrix
Hibernate and JPA
- Hibernate relation to JPA
- Difference between Hibernate and JPA

https://vladmihalcea.com/tutorials/hibernate/
https://www.manning.com/books/java-persistence-with-hibernate-second-edition

Multitenance 
- Separate database, separate schema, partitioned data
- Connection provider
- Identifier resolver, tenant id
- Cache levels, unique ids

Hibernate specifics
- HQL
- HBM files
- Byte-code enhancements

Envers
- Versioning strategy, audit schema, logging
- Extended primary key, revision id
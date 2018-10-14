---
# Spring Boot MongoDB

- C:\Users\silve>docker run -p 27017:27017 --name mongo_boot -d mongo
- C:\Users\silve>docker exec -i -t mongo_boot bash
> - root@73bd405cc301:/# mongo
  >> - db
  >> - use test
  >> - db.accounts.find({})

- embeded mongodb 사용하여 TEST
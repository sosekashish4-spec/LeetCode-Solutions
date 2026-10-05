# Write your MySQL query statement below
Select Person.firstname,Person.lastname,Address.city,Address.state
from Person Left Join Address
ON Person.personId=Address.personId;
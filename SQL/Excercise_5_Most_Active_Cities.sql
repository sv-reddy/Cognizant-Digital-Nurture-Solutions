select u.city, count(distinct u.user_id) as distinct_users
from users u
join registrations r on r.user_id = u.user_id
group by u.city
order by distinct_users DESC 
limit 5;
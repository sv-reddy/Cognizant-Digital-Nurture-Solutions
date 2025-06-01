select u.user_id , u.full_name, e.title, count(r.registration_id) as registration_count
from users u
join registrations r on r.user_id = u.user_id
join events e on e.event_id = r.event_id
group by r.user_id, u.full_name, e.title
having registration_count > 1;


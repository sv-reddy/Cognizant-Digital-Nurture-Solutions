select e.event_id, e.title
from events e
join registrations r on r.event_id = e.event_id
join users u on r.user_id = u.user_id
where e.status = 'upcoming' and e.city = u.city
order by e.start_date ASC;



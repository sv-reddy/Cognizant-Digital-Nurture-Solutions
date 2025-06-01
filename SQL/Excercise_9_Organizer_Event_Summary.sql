select e.organizer_id, u.full_name, e.status, count(distinct e.event_id) as event_count
from events e
join users u on u.user_id = e.organizer_id
GROUP BY e.organizer_id, u.full_name, e.status
ORDER BY e.organizer_id, e.status;

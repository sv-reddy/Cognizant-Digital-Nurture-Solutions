select e.event_id, e.title, count(s.session_id) as session_count
from events e
join sessions s on s.event_id = e.event_id
group by event_id,e.title;

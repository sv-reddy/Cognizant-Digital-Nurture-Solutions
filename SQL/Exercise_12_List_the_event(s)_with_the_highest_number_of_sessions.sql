select e.event_id, e.title, count(s.session_id) as sessions_max_count
from events e
join sessions s on s.event_id = e.event_id
group by e.event_id, e.title
order by sessions_max_count DESC
limit 1;

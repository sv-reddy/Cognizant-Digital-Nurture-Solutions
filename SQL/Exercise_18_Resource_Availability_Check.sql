select e.event_id, e.title
from events e
join resources r on r.event_id = e.event_id
where r.event_id is null;
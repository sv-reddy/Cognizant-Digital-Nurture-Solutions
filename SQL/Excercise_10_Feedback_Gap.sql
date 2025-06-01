select e.event_id, e.title
from events e
left join feedback f on f.event_id = e.event_id
left join registrations r on r.event_id = e.event_id
where f.event_id is null and r.registration_id is not null;
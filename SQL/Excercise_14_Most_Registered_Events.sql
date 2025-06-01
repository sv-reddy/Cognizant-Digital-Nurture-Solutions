-- most registered events
select e.event_id, e.title, count(r.registration_id) as registration_count
from events e
join registrations r on r.event_id = e.event_id
group by e.event_id, e.title
order by registration_count DESC
limit 3;
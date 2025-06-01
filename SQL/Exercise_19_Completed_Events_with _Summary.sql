select e.event_id, e.title,e.status, count(r.registration_id) as registraion_count, avg(f.rating) as avg_rating
from events e
join registrations r on r.event_id = e.event_id
join feedback f on f.event_id = e.event_id
where e.status = 'completed'
group by e.event_id, e.title,e.status;
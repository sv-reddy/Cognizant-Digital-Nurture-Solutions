select e.event_id,e.title, count(distinct r.registration_id) as attended_count, count(distinct f.feedback_id) as feedback_count
from events e
left join registrations r on r.event_id = e.event_id
left join feedback f on e.event_id = f.event_id
where e.status = 'completed'
group by e.event_id, e.title;
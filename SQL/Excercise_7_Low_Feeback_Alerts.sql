select u.user_id, u.full_name, e.event_id, e.title, f.comments
from events e
join feedback f on f.event_id = e.event_id
join users u on u.user_id = f.user_id
where f.rating < 3;
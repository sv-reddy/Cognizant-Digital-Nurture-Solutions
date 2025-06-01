select e.city, avg(f.rating) as avg_rating
from feedback f
join events e on e.event_id = f.event_id
group by e.city
order by avg_rating DESC;

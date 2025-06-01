select u.user_id, u.full_name
from users u
left join registrations r on r.user_id = u.user_id
where datediff(u.registration_date, current_date()) < 30
and r.registration_date is null;
select u.user_id, u.full_name, count(f.feedback_id) as feedback_entries
from users u
left join feedback f on f.user_id = u.user_id
group by u.user_id, u.full_name
order by feedback_entries desc
limit 5;
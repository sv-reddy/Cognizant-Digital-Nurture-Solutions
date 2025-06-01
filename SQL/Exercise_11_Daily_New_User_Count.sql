select registration_date, count(user_id) as user_count
from users
where datediff(current_date(),registration_date) < 7
group by registration_date 
order by registration_date DESC;
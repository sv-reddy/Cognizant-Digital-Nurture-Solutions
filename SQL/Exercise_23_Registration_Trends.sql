select month(registration_date) as months, count(registration_id) as registration_count
from registrations
group  by months
order by months;
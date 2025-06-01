select s.event_id, count(session_id) as session_count 
from sessions s
where time(s.start_time) < '12:00:00' and time(s.end_time) > '10:00:00'
group by s.event_id;

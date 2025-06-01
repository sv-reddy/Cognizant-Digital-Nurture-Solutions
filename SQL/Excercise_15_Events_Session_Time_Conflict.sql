select e.title, s1.session_id as session1, s2.session_id as session2
from sessions s1
join sessions s2 on s1.event_id = s2.event_id
join events e on s1.event_id = e.event_id
where s1.session_id < s2.session_id
and s1.start_time < s2.end_time
and s2.start_time < s1.end_time;
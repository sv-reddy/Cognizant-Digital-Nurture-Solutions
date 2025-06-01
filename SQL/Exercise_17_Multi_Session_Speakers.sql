select speaker_name, count(session_id) as session_count
from sessions 
group by speaker_name
having session_count > 1;
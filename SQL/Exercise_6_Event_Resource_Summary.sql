select re.event_id, e.title, count(distinct re.resource_type) as distinct_resources
from resources re
join events e on re.event_id = e.event_id
group by re.event_id;
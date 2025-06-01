SELECT e.event_id, e.title, AVG(f.rating) AS avg_rating, COUNT(f.rating) AS feedback_count
FROM events e
JOIN feedback f ON f.event_id = e.event_id
GROUP BY e.event_id, e.title
HAVING COUNT(f.rating) >= 10
ORDER BY avg_rating DESC;
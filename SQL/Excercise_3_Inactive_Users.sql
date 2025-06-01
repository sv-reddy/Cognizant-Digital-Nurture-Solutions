SELECT *  
FROM users u  
LEFT JOIN registrations r ON r.user_id = u.user_id  
WHERE r.registration_date IS NULL OR r.registration_date < DATE_SUB(CURRENT_DATE, INTERVAL 90 DAY);
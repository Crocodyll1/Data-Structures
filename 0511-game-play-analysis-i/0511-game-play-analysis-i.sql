SELECT
    DISTINCT player_id,
    (
        SELECT MIN(event_date)
        FROM Activity a2
        WHERE a2.player_id = a1.player_id
    ) AS first_login
FROM Activity a1;
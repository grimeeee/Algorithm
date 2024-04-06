-- 코드를 작성해주세요
SELECT ROUND(AVG(AA.LENGTH),2) AS AVERAGE_LENGTH 
FROM (
    SELECT 
          ID
        , FISH_TYPE
        , CASE WHEN LENGTH IS NULL 
               THEN 10
               ELSE LENGTH
               END AS LENGTH
        , TIME
    FROM FISH_INFO
    ) AA
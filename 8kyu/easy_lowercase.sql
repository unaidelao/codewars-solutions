/*
Given a demographics table in the following format:

== demographics table schema ==
    id
    name
    birthday
    race

you need to return the same table where all letters are lowercase in the race column.
*/
SELECT id, name, birthday, LOWER(race) as race FROM demographics;

-- Variant.
UPDATE demographics SET race = LOWER(race);
SELECT * FROM demographics;
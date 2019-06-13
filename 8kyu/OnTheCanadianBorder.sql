/*
 * On the Canadian border - SQL
 *
 * You are a border guard sitting on the Canadian border. You were given a list of travelers who
 * have arrived at your gate today. You know that American, Mexican, and Canadian citizens don't
 * need visas, so they can just continue their trips. You don't need to check their passports for
 * visas! You only need to check the passports of citizens of all other countries!
 *
 * Select names, and countries of origin of all the travelers, excluding anyone from Canada,
 * Mexico, or The US.
 *
 * travelers table schema
 *   name
 *   country
 *
 * NOTE: The United States is written as 'USA' in the table.
 * NOTE: Your solution should use pure SQL. Ruby is used within the test cases to do the actual testing.
 *
 * Author: Unai de la O
 */
SELECT name, country
FROM travelers
WHERE country NOT LIKE 'Canada' AND country NOT LIKE 'Mexico' AND country NOT LIKE 'USA';
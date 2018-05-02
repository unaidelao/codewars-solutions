/*
 * SQL Basics: Mod kata - SQL
 *
 * Given the following table 'decimals':
 *
 *    decimals table schema
 *      -id
 *      -number1
 *      -number2
 *
 * Return a table with one column (mod) which is the output of number1 modulus
 * number2.
 *
 * @author Unai de la O
 */

SELECT mod(number1, number2) AS mod FROM decimals
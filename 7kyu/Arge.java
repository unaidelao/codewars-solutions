/*
 * Growth of population kata - Java
 *
 * In a small town the population is p0 = 1000 at the beginning of a year. The
 * population regularly increases by 2 percent per year and moreover 50 new
 * inhabitants per year come to live in the town. How many years does the town
 * need to see its population greater or equal to p = 1200 inhabitants?
 *
 * Author: Unai de la O
 */

class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 0;
        int population = p0;
        
        while (population < p) {
          population += (population * (percent / 100)) + aug;
          years ++;
        }
        
        return years;
    }
}
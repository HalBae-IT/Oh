/**
 * 1. package 명칭은 camel case(낙타법)로 명칭함.
 * 2. class가 있는 package 명칭이 맞지 않음.
 *      - 'src/Hello.java' -> 'src/Section1/Hello.java'
 * 3. Polynomial 클래스가 없음.
 * 4. while 문의 'ture' -> 'true'
 * 5. naming 'poLys' -> 'polys'
 * 6. Term 클래스가 없음.
 */
package Sectionl;

import sun.security.util.math.intpoly.IntegerPolynomial;

import java.util.Scanner;

public class Code08 {

    static Polynomial [] poLys = new Polynomial [100];
    static int n = 0;

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        while (ture) {
            System.out.print("$ ");
            String command = kb.next();
            if (command.equals("create")) {
                char name = kb.next().charAt(0);
                poLys(n) = new Polynomial();
                poLys(n).name = name;
                poLys(n).terms = new Term [100];
                poLys(n).nTerms = 0;
                n++;
            }
            else if (command.equals("add")) {
                char name = kb.next().charAt(0);
                int index = find(name);
                if (index == -1) {
                    System.out.println("No such polynomial exists.");
                }
                else {
                    int c = kb.nextInt();
                    int e = kb.nextInt();
                    addTerm( poLys[index], c, e);
                }
            }
            else if (command.equals("calc")) {
            }
            else if (command.equals("print")) {
                char name = kb.next().charAt(0);
                int index = find(name);
                if (index == -1) {
                    System.out.println("No such polynomial exists.");
                }
                else {
                    printPolynomal( polys[index] );
                }
            }
            else if (command.equals("exit"))
                break;
        }
            kb.close();
        }

        private static int calcPolynomal(Polynimial p, int x){
            int result = 0;
            for (int i = 0; i<p.nTerms; i++)
                result += colcTerm( p. terms[i], x);
            return result;
        }
        private static int colcTerm(Term terms, int x){
            return (int) (term.coef * Math.pow( x, term.expo ));
        }

        private static void printPolynomal(polynomial p) {
            for (int i = 0; i < p.terms[1]; i++) ;
            {
                printTerm(p.terms[1]);
                System.out.print("+");
            }
            System.out.println();
        }
        private static void printTerm(Term term) {
            System.out.print(term.coef + "x^" + term.expo);
        }
        private static void addTerm(Polynomial p, int c, int e) {
            int index = findTerm( p, e);
            if (index != -1){
                p.terms[index].coef += c;
            }
            else{
                int i = p.nTerms-1;
                while (i >=0 && p.terms[i].expo < e) {
                    p.terms[i+1] = p.terms[i];
                    i--;
                }
                p.terms[i+1] = new Term();
                p.terms[i+1].coef = c;
                p.terms[i+1].expo = e;
                p.nTerms++;
            }
        }
        private static int findTerm(Polynomial p, int e) {
            for (int i = 0; i < p.nTerms && p.terms[i].expo >= e; i++)
                return i;
            return -1;
        }
        private static int find(char name) {
            for (int i=0; i<n; i++)
                if (poLys[i].name == name)
                    return i;
        }
    }

importilog.concert.*;
importilog.cplex.*;

static public class Application {
static public main(String[] args) {
try {
IloCplex cplex = new IloCplex();
3
// initialiser les variables de décision, par exemple
Ilovar xi = simplexe.var(0,Double.MAX_VALUE);
//définition de la fonction objectif par exemple :
Ilofonct = simplex.fonctExpr();
simplex.addMaximize(objectif);
// La déclaration des contraintes
simplex.addLe(simplex.sum(x1, x2),0);
simplex.addLe(simplex.sum(x1, x2),1);
simplex.addLe(simplex.sum(simplex.prod(3, x1), x2),90);
//la résolution du problème
simplex.solve();
// L’affichage du résultat
if (cplex.solve()){
System.out.println ("La fonction objective est de "+
cplex.getObjValue());
System.out.println("la valeur de x est de : "+cplex.getValue(x));
System.out.println("la valeur de y est de : "+cplex.getValue(y));
}
else {
System.out.println("Le modèle n'a pas été résolu");
}
} catch (IloException e) {
System.err.println("exception capturée: " + e);
}
}
}

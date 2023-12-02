public class Pile {
    // Déclarations des attributs de la pile
    static final int MAX = 8;
    char t[];
    int top;

    // Programmation des méthodes de la pile
    public Pile() { // Déclaration du construsteur, le nom du constructeur est le meme aue la clase,
        // Initialise une pile vide
        t = new char[MAX]; // on va creé un tableau t pour stocker les elements de la pile et qui a un
                           // taille MAX égale à 8
        top = -1; // initialisation du variable top à -1 signifie aue la pile est vide
    }

    public void empiler(char c) { // le type de retour est void signifie aue la methode renvoie aucune valeure
        // Empile le caractere donné en parametre
        if (!estPleine()) {
            top++; // incrimentation de la variable top pour pointer sur la nouvelle position
            t[top] = c; // on place le nouvel caratere c à laposition acuelle de la pile
        } else {
            System.out.println("La pile est pleine");
        }
    }

    public char sommet() {
        // Retourne le caractere en sommet de la pile
        if (estVide()) {
            return ' '; // renvoie un espace signifie aue la pile est vide
        } else {
            return t[top]; // sinon la methode renvoie le sommet de la pile qui est situé à la position
                           // top. En d'autre mots: le dernier caractere de la pile
        }
    }

    public void depiler() {
        // retire le sommet de la pile
        if (estVide()) {
            System.out.println("pile est vide");
        } else {
            top--; // décrémentation de la variable top. Retirer le sommet de la pile
        }

    }

    private boolean estPleine() {
        return top == MAX - 1; // retourne TRUE si top est égale MAX-1 qui est la position maximale de la pile
    }

    public boolean estVide() {
        // retourne true si la pile est vide
        return top == -1; // on a deja initialiser top avec -1. alors si top=-1 donc on a pas ajouter une
                          // nouvelle valeur à la pile alors la pile est vide
    }

    // CLASS MAIN:

    public static void main(String args[]) {
        Pile p = new Pile();
        p.empiler('A'); // empilation de la pile avec 3 nouvelles variables A,B et C
        p.empiler('B');
        p.empiler('C');

        // affichage du sommet de la pile:
        System.out.println("Le sommet de la pile: " + p.sommet());// le sommet est :C
        // retire le sommet de la pile:
        p.depiler(); // on retirer le sommet qui est dans ce cas la derniere valeur qu'on a ajouter
                     // :C
        System.out.println("Le somment de la pile après suppression :" + p.sommet());// alors ici le sommet
                                                                                     // automatiquement devenir B parce
                                                                                     // que on a retirer C
        // verifier si la pile est vide:
        if (p.estVide()) {// dans ce la pile n'est pas vide car il y a 2 variables A et B
            System.out.println("La pile est vide");
        } else {
            System.out.println("La pile n'est pas vide");
        }
        // verifier si la pile est pleine:
        if (p.estPleine()) { // dans ce cas la pile n'est pas plaine parce que on a juste 2 variables est la
                             // taille maximal de la pile est 8
            System.out.println("La pile est pleine");
        } else {
            System.out.println("La pile n'est pas pleine");

        }

        // on va empiler d'une autre fois des nouvelles variables dans la pile
        p.empiler('D');
        p.empiler('E');
        p.empiler('F');
        p.empiler('G');
        p.empiler('H');
        p.empiler('I');
        p.empiler('J');

        System.out.println("\n\nLe sommet de la pile: " + p.sommet()); // comme vous voyez que l'incrementation de J est n'est réussie car la taille maximale de la pile est 8

        //verifier si la pile est vide:
        if(p.estVide()){
            System.out.println("La pile est vide");
        }else{
            System.out.println("La pile n'est pas vide");
        }

        //verifier si la pile est pleine:
        if(p.estPleine()){
            System.out.println("La pile est pleine");
        }else{
            System.out.println("La pile n'est pas pleine");

        }
    }

}

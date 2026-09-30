const prompt = require("prompt-sync")();

const longueur = parseFloat(prompt("Longueur de la pièce ? "));
const largeur = parseFloat(prompt("Largeur de la pièce ? "));
const hauteur = parseFloat(prompt("Hauteur de la pièce ? "));
const marge = 20;
const prixPot = 29.90;

let surfaceNette =
  (((longueur + largeur) * 2) * hauteur) * ((100 - marge) / 100);

console.log("La surface nette est de :", surfaceNette.toFixed(1), "m²");

let nbPots = Math.ceil(surfaceNette / 10);

let prixTotal = nbPots * prixPot;

console.log("Nombre de pots nécessaire :", nbPots);
console.log("Prix total :", prixTotal.toFixed(2), "euros");

/*DEBUT

    VARIABLE longueur: REEL
    VARIABLE largeur: REEL
    VARIABLE hauteur: REEL
    VARIABLE surfaceNette: REEL
    VARIABLE nbPots: ENTIER
    VARIABLE prixTotal: REEL
    VARIABLE marge: ENTIER <- 20
    VARIABLE prixPot: REEL <- 29.90

    ECRIRE("Longueur de la pièce?")
    LIRE(longueur)
    ECRIRE("Largeur de la pièce ?")
    LIRE(largeur)
    ECRIRE("Hauteur de la pièce?")
    LIRE(hauteur)
    surfaceNette <- (((longueur + largeur) * 2) * hauteur) * ((100 - marge) / 100)
    ECRIRE("La surface nette est de: ", surfaceNette)
    nbPots <- ARRONDI SUP (surfaceNette / 10)
    prixTotal <- nbPots * prixPot
    ECRIRE("Nombre de pots nécéssaire: ", nbPots)
    ECRIRE("Prix total: ", prixTotal)

FIN*/
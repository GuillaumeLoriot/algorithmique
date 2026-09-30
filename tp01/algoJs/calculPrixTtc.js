console.log("calcule du prix remisé TTC");

const prompt = require("prompt-sync")();

const prixHt = parseFloat(prompt("Prix hors taxe ? "));
const remise = parseFloat(prompt("Pourcentage de remise ? "));
const tva = parseFloat(prompt("Pourcentage de TVA ? "));

let montantTva = prixHt * (tva / 100);
console.log(`Montant de la TVA : ${montantTva}`);
let montantRemise = (prixHt + montantTva) * (remise
     / 100);
console.log(`Montant de la remise : ${montantRemise}`);

let prixTotal = prixHt + montantTva - montantRemise;
console.log(`Prix total : ${prixTotal} `);






/*DEBUT

    VARIABLE prixht: REEL
    VARIABLE remise: ENTIER
    VARIABLE tva: REEL
    VARIABLE montantRemise: REEL
    VARIABLE montantTva: REEL
    VARIABLE prixTotal: REEL

    ECRIRE("Prix hors taxe?")
    LIRE(prixht)
    ECRIRE("Pourcentage de remise?")
    LIRE(remise)
    ECRIRE("Pourcentage de TVA?")
    LIRE(tva)
    montantTva <- prixht * (tva / 100)
    montantRemise <- (prixht + montantTva) * (remise / 100)
    prixTotal <- prixht + montantTva - montantRemise
    ECRIRE("Le prix remisé ttc est de: ", prixTotal)

FIN*/
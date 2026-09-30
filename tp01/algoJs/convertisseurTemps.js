console.log("Convertisseur de temps");

const prompt = require("prompt-sync")();

const totalSecondes = parseInt(prompt("Nombre de secondes ? "));

let heures = Math.floor(totalSecondes / 3600);
let reste = totalSecondes % 3600;

let minutes = Math.floor(reste / 60);
let secondes = reste % 60;

console.log(`${heures}h ${minutes}m ${secondes}s`);

/*DEBUT

    CONSTANTE totalSecondes: ENTIER
    VARIABLE heures: ENTIER
    VARIABLE minutes: ENTIER
    VARIABLE secondes: ENTIER
    VARIABLE reste: ENTIER

    ECRIRE("nombre de secondes ?")
    LIRE(totalSecondes)

    heures <- DIVISION ENTIERE(totalSecondes / 3600)
    reste <- totalSecondes % 3600

    minutes <- DIVISION ENTIERE(reste / 60) 
    secondes <- reste % 60

    ECRIRE(heures, "h ", minutes, "m ", secondes, "s")

FIN*/
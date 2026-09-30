console.log("Calcul de l'IMC");

const prompt = require("prompt-sync")();

const poids = parseFloat(prompt("Poids ? "));
const taille = parseFloat(prompt("Taille ? "));

let imc = poids / (taille * taille);
imc = Math.round(imc * 10) / 10;
console.log("Votre IMC est de :", imc);

if (imc < 18.5) {
  console.log("Insuffisance pondérale");
} else if (imc >= 18.5 && imc <= 24.9) {
  console.log("Poids normal");
} else if (imc > 24.9 && imc <= 29.9) {
  console.log("Surpoids");
} else {
  console.log("Obésité");
}



/*DEBUT
    VARIABLE poids: REEL
    VARIABLE taille: REEL
    VARIABLE imc: REEL

    ECRIRE("Poids ?")
    LIRE(poids)
    ECRIRE("Taille ?")
    LIRE(taille)

    imc <- ARRONDI 1 DECIMAL (poids / (taille * taille))
    ECRIRE("Votre IMC est de:", imc)

    SI imc < 18.5
        ECRIRE("Insuffisance pondérale")
    SINON SI imc >= 18.5 ET imc <= 24.9
        ECRIRE("Poids normal")
    SINON SI imc > 24.9 ET imc <= 29.9
        ECRIRE("Surpoids")
    SINON 
        ECRIRE("Obésité")
    FIN SI
FIN*/
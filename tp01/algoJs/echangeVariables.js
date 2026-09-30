console.log("----------Echange de variables partie A------------");

const prompt = require("prompt-sync")();

let a = parseFloat(prompt("premier chiffre ? "));
let b = parseFloat(prompt("deuxième chiffre ? "));
console.log("Vos chiffres :", a, b);

let temp = a;
a = b;
b = temp;

console.log("Chiffres inversés :", a, b);

console.log("----------Echange de variables partie B------------");


let c = parseFloat(prompt("premier chiffre ? "));
let d = parseFloat(prompt("deuxième chiffre ? "));
console.log("Vos chiffres :", c, d);

c = c + d
d = c - d
c = c - d

console.log("Chiffres inversés :", c, d);

console.log("----------Echange de variables partie C------------");

let e = parseFloat(prompt("premier chiffre ? "));
let f = parseFloat(prompt("deuxième chiffre ? "));

console.log("Vos chiffres :", e, f);

[e, f] = [f, e];

console.log("Chiffres inversés :", e, f);



/*Partie A

DEBUT
    VARIABLE a: REEL
    VARIABLE b: REEL
    VARIABLE temp: REEL

    ECRIRE("inverser les chiffres")
    ECRIRE("premier chiffre ?")
    LIRE(a)
    ECRIRE("deuxième chiffre ?")
    LIRE(b)
    ECRIRE("Vos chiffres: ", a, b)
    temp <- a
    a <- b
    b <- temp
    ECRIRE("Chiffres inversés: ", a, b)
FIN


Partie B

DEBUT
    VARIABLE a: REEL
    VARIABLE b: REEL

    ECRIRE("inverser les chiffres")
    ECRIRE("premier chiffre ?")
    LIRE(a)
    ECRIRE("deuxième chiffre ?")
    LIRE(b)
    ECRIRE("Vos chiffres: ", a, b)
    a <- a + b
    b <- a - b
    a <- a - b
    ECRIRE("Chiffres inversés: ", a, b)
FIN

Partie C*/
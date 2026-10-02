// Fonction A
function somme(tab) {
  let s = 0;
  for (let i = 0; i < tab.length; i++) {
    s += tab[i];
  }
  return s;
}
// Fonction B
function contientDoublon(tab) {
  for (let i = 0; i < tab.length; i++) {
    for (let j = i + 1; j < tab.length; j++) {
      if (tab[i] === tab[j]) return true;
    }
  }
  return false;
}
// Fonction C
function mystere(n) {
  let count = 0;
  let i = n;
  while (i > 1) {
    i = Math.floor(i / 2);
    count++;
  }
  return count;
}
// Fonction D
function tripleImbrication(n) {
  let count = 0;
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      for (let k = 0; k < n; k++) {
        count++;
      }
    }
  }
  return count;
}
// Fonction E
function deuxBouclesSuccessives(tab) {
  let max = tab[0];
  for (let i = 1; i < tab.length; i++) {
    if (tab[i] > max) max = tab[i];
  }
  let count = 0;
  for (let i = 0; i < tab.length; i++) {
    if (tab[i] === max) count++;
  }
  return count;
}
// Fonction F
function rechDichotomique(tab, cible) {
  let debut = 0;
  let fin = tab.length - 1;
  while (debut <= fin) {
    let milieu = Math.floor((debut + fin) / 2);
    if (tab[milieu] === cible) return milieu;
    if (tab[milieu] < cible) debut = milieu + 1;
    else fin = milieu - 1;
  }
  return -1;
}

console.log("Conplexité fonction A : O(n)");
console.log("Conplexité fonction B : O(n²)");
console.log("Conplexité fonction C : O(log n)");
console.log("Conplexité fonction D : O(n3)");
console.log("Conplexité fonction E : O(n)");
console.log("Conplexité fonction F : O(log n)");

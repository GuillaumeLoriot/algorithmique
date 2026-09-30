const readline = require("readline");
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let farenheit;

console.log("convertir celcius en farenheit");
rl.question("degrée celcius? ", (celcius) => {
  farenheit = celcius * (9 / 5) + 32;
  console.log(
    `${celcius} degrée celcius corespond à ${farenheit} degrée farenheit `,
  );
  rl.close();
});


/*DEBUT

    VARIABLE farenheit: REEL
    VARIABLE celcius: REEL

    ECRIRE("convertir celcius en farenheit")
    ECRIRE("degree celcius?")
    LIRE(celcius) 
    farenheit <- celcius * (9/5) +32
    ECRIRE (celcius, " degrée celcius corespond à ", farenheit, "degrée farenheit"  )
FIN*/


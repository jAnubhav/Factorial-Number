let factorial = (num) => {
    let fac = 1;
    for (let i = 1; i != num + 1; i++) {
        fac *= i;
    }
    return fac;
}

let num = 5;
let fac = factorial(num);
console.log("The factorial of the number is " + fac);

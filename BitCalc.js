function calculate(num1, num2) {
    if (num1.length < 4 || num2.length < 4) {
        for (let i = num1.length; i < 4; i++) {
            num1 = "0" + num1
        }
        for (let i = num2.length; i < 4; i++) {
            num2 = "0" + num2
        }
    }
    let result1 = +num1[0] * 2 + +num1[1];
    let result2 = +num2[0] * 2 + +num2[1];

    for (let i = 2; i < num1.length; i++) {
        result1 = result1 * 2 + +num1[i];
    }
    for (let i = 2; i < num2.length; i++) {
        result2 = result2 * 2 + +num2[i];
    }
    return result1 + result2;
}
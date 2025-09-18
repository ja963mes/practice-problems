function bit_calc(num1, num2) {
    if (num1.length < 4 || num2.length < 4) {
        for (i = num1.length; i < 4; i++) {
            num1 = "0" + num1
        }
        for (i = num2.length; i < 4; i++) {
            num2 = "0" + num2
        }
    }


    let result1 = parseInt(num1[0]) * 2 + parseInt(num1[1]);
    let result2 = parseInt(num2[0]) * 2 + parseInt(num2[1]);

    ;
    for (i = 2; i < 4; i++) {
        result1 = result1 * 2 + parseInt(num1[i]);
    }

    for (i = 2; i < 4; i++) {
        result2 = result2 * 2 + parseInt(num2[i]);
    }

    return result1 + result2;
}
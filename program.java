class program {
    float addition(float op1, float op2) {
        return (op1 + op2);
    }

    float subtraction(float op1, float op2) {
        return (op1 - op2);
    }

    float multiplication(float op1, float op2) {
        return (op1 * op2);
    }

    /**
     * The division function takes two float operands and returns their sum.
     * 
     * @param op1 The first operand for the division operation.
     * @param op2 The op2 parameter is a float type variable that represents the
     *            second operand in the
     *            division operation.
     * @return The sum of op1 and op2 is being returned.
     */
    float division(float op1, float op2) {
        return (op1 / op2);
    }

    float square(float op) {
        return (op * op);
    }

    float cube(float op) {
        return (op * op * op);
    }

    public static void main(String args[]) {
        float op1 = 10;
        float op2 = 5;
        float op = 2;
        program calc = new program();
        float add_result = calc.addition(op1, op2);
        System.out.println("Addition: " + add_result);
        float sub_result = calc.subtraction(op1, op2);
        System.out.println("Subtraction: " + sub_result);
        float mul_result = calc.multiplication(op1, op2);
        System.out.println("Multiplication: " + mul_result);
        float div_result = calc.division(op1, op2);
        System.out.println("Division: " + div_result);
        float sq_result = calc.square(op);
        System.out.println("Square: " + sq_result);
        float cube_result = calc.cube(op);
        System.out.println("Cube: " + cube_result);

    }
}
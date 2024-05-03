package Testes;

import static org.junit.jupiter.api.Assertions.*;

import Classes.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    @DisplayName("Teste da Soma")
    void soma() {
        // Arrange
        int num1 = 3;
        int num2 = 4;

        // Act
        int resultado = calc.soma(num1,num2);

        // Assert
        assertEquals(7,resultado);
    }

    @Test
    @DisplayName("Teste da Subtração")
    void subtracao() {
        assertAll(() -> assertEquals(-2,calc.subtracao(4,6)),
                () -> assertEquals(10, calc.subtracao(4,-6)));

        // Arrange
        //int num1 = 3;
        //int num2 = 4;

        // Act
        //int resultado = calc.subtracao(num1, num2);

        // Assert
        //assertEquals(-1, resultado);
    }

    @Test
    @DisplayName("Teste da Multiplicação")
    void multiplicacao() {
        // Arrange
        int num1 = 3;
        int num2 = 4;

        // Act
        int resultado = calc.multiplicacao(num1, num2);

        // Assert
        assertEquals(12, resultado);
    }
}

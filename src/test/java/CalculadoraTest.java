import org.example.Calculadora;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private static Calculadora cal;
    @BeforeAll
    static void setUpBeforeAll(){
        //Este metod é estático e será chamado antes da execução dos testes
        System.out.println("Ajustando os recursos antes dos testes começarem");
        cal = new Calculadora();
    }

    @BeforeEach
    void setUP(){
        System.out.println("Carregando os recursos");

        // Instancia a Calculadora antes de cada teste
        cal = new Calculadora();
    }
    @Test
    void deveSomardDoisNumeros(){
        int resultado = cal.soma(5,2);
        assertEquals(7, resultado);
        System.out.println("resultado: "+ resultado);
    }
    // Metdo que será executado após cada teste
    @AfterEach
    void clearTasks() {
        // O metdo @AfterEach pode ser usado para limpar ou liberar recursos após cada teste.
        System.out.println("Limpando após o teste.");
    }
    @AfterAll
    static void clearTaskAfterAll(){
        System.out.println("Liberando recursos pesados");
        // A grande diff desse para o AfterEach é que ele serve para liberar recursos ou limpar, apos os testes
        // Como conexão com um Banco de dados ou ate mesmo deletar Cache
    }

}

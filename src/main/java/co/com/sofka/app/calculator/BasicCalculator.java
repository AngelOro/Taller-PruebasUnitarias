package co.com.sofka.app.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    //Loger -> Imprime en un consola lo que está pasando
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    // {} reemplaza los valores
    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long resta(Long number1, Long number2) {
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplicacion(Long number1, Long number2) {
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2) {
        logger.info( "Dividing {} / {}", number1, number2 );
        if(number2 == 0){
            logger.info( "División por 0" );
        }
        return (number2 == 0) ? null : number1 / number2;
    }
}

import java.text.DecimalFormat;

public class TripVehicles {
    public static void main(String[] args) {
        //mediumSpeed = displacement / timeInterval;
        double carSpeed = 110;
        double truckSpeed = 80;
        double displacement = 100;
        double truckSpentTime = 10;
        double carPosition = 0;
        double truckPosition = 100;
        double carTime = 0;
        double truckTime = 0;

        double truckObstacle = truckSpentTime / 60; //Dez minutos gastos pelo caminhão nos pedágios.
        System.out.println("truckObstacle -->" + truckObstacle);

        double truckInterval = displacement / truckSpeed + truckObstacle; //Intervalo para o caminhão percorrer a
        // distância.
        System.out.println("truckInterval -->" + truckInterval);

        double correctedTruckSpeed = displacement / truckInterval; // Velocidade média do caminhão corrigida com a
        //perda dos 10 minutos.
        System.out.println("correctedTruckSpeed -->" + correctedTruckSpeed);

        double carInterval = displacement / carSpeed; // Intervalo para o carro percorrer a distância.
        System.out.println("carInterval -->" + carInterval);

        //carHourlyFunction = truckHourlyFunction --> Cruzamento dos veículos. Obtenção do instante de tempo do
        //cruzamento e posterior determinação no ponto de cruzamento.

        carTime = truckPosition / (carSpeed + correctedTruckSpeed); // Instante de tempo do cruzamento.
        System.out.println("carTime -->" + carTime);

        double carHourlyFunction = (carPosition + carSpeed) * carTime; // Função horária para definir a posição.
        // s1 = s2.
        System.out.println("carHourlyFunction -->" + carHourlyFunction);
        double truckHourlyFunction = (truckPosition - correctedTruckSpeed) * truckTime;
        // Os veículos se encontram aos 60.9120 quilômetros de Ribeirão Preto, portanto, ambos estão a mesma distância.

        //Explique como chegou no resultado.
        //Primeiro foi considerado e averiguado o tempo gasto pelo caminhão nos pedágios, depois o intervalo gasto pelo
        //caminhão sem obstáculos e após isso foi feita a correção levando em conta o tempo perdido. Depois foi
        //calculado o intervalo de tempo do carro e por fim o instante de tempo e o ponto de cruzamento.



    }
}

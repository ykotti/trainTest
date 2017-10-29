package ru.test.ykotti.ArrList;

/**
 * Created by Юлия Коткова on 29.10.2017.
 */
public class TrainService {
    private static TrainService ourInstance = new TrainService();

    public static TrainService getInstance() {
        return ourInstance;
    }

    private TrainService() {
    }
    public void addCarriage(Train train, Carriage carriage){

        train.carriages.add(carriage);
        carriage.myTrain = train;
    }
    public void addCarriageAtIndex(Train train, Carriage carriage, int index){
        train.carriages.add(index,carriage);
        carriage.myTrain = train;
    }
    public void removeCarriage(Train train, Carriage carriage){
        train.carriages.remove(carriage);
        carriage.myTrain = null;
    }
}

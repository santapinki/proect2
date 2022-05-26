package proect2.GenerateMap;

import proect2.AllAnimal.Animal;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Circle {
    public static OneMap [][] test (OneMap[][] oneMaps) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (OneMap[] one : oneMaps) {
            for (OneMap oneOne : one) {
                executorService.submit(oneOne);
            }
        }



        executorService.shutdown();
        if (executorService.awaitTermination(10, TimeUnit.MINUTES)) {
//            for (OneMap[] one : oneMaps) {
//                for (OneMap oneOne : one) {
//                    CheckMap.check(oneOne.map,oneOne.grass.getGrass());
//                    Thread.sleep(10);
//                }
//            }

        }
        RunRun.RunR(oneMaps);
        Statistics.stats(oneMaps);
        return oneMaps;
    }
}

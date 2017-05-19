package Services;

import DataModel.Application;
import DataModel.Insurance;
import Interfaces.ILogger;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kwitkowski on 2017-04-06.
 */
public class MainService extends AbstractService {

    private ApplicationService appSrv;

    public MainService(ILogger log) {
        super(log);

        appSrv = new ApplicationService(log);
    }

    /**
     * Procesuje wniosek
     *
     * @throws Exception
     */
    public void startProcessing() throws Exception {
        log.debug("startProcessing START");

        System.out.println("Java rulez yo");

        // przygotowujemy wniosek
        Application w = appSrv.prepareApplication("kris", "xxx");

        // wypisujemy ubezpieczenia
        for (Insurance i : w.getInsurances()) {

            System.out.println(String.format("Code = '%s' Amount = '%f' Period = '%d'",
                    i.getCode(), i.getAmount(), i.getPeriod()));
        }

        System.out.println(w.getAllInfo());

        // ubezpieczenia z kwota powyzej 1200
        List<Insurance> overList = w.getInsurances().stream()
                .filter(x -> x.getAmount() > 1200)
                .collect(Collectors.toList());

        long overThousandCount = overList.size();

        System.out.println(String.format("Liczba ubezpieczen = '%d', liczba ubezpieczen powyzej 1200 = '%d'",
                w.getInsurances().size(), overThousandCount));

        boolean ipuExists = w.getInsurances().stream().anyMatch(y -> y.getCode().equals("IPU"));
        boolean ubpExists = w.getInsurances().stream().anyMatch(y -> y.getCode().equals("UBP"));

        System.out.println(String.format("ipuExists = '%b | ubpExists = '%b'", ipuExists, ubpExists));
        if (1 == 1) {
            throw new IndexOutOfBoundsException("Exception kontrolowany...");
        }

        log.debug("startProcessing END");
    }
}

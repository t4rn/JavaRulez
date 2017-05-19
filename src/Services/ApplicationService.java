package Services;

import DataModel.Application;
import DataModel.Insurance;
import Interfaces.ILogger;

import java.util.List;

/**
 * Created by kwitkowski on 2017-04-06.
 */
public class ApplicationService extends AbstractService {

    private InsuranceService insurSrv;

    public ApplicationService(ILogger log) {
        super(log);
        insurSrv = new InsuranceService(log);
    }

    /**
     * Przygotowuje wniosek
     * @return wniosek wypelniony danymi
     * @param owner
     * @param firm
     */
    public Application prepareApplication(String owner, String firm) {

        Application w = new Application();
        w.setAmount(1000);
        w.setOwner(owner);
        w.setFirm(firm);
        w.setOk(true);
        w.setLevel(19);
        w.setActive(false);

        List<Insurance> insurs = insurSrv.prepareInsurances();
        w.setInsurances(insurs);

        return  w;
    }
}

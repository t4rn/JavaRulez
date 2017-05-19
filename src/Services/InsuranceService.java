package Services;

import DataModel.Insurance;
import Interfaces.ILogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kwitkowski on 2017-04-06.
 */
public class InsuranceService extends AbstractService {
    public InsuranceService(ILogger log) {
        super(log);
    }

    public List<Insurance> prepareInsurances() {
        List<Insurance> insurs = new ArrayList<Insurance>();

        Insurance i1 = new Insurance("UBP_F", 1000, 5);
        insurs.add(i1);
        Insurance i2 = new Insurance("UBPM", 2500, 12);
        insurs.add(i2);
        Insurance i3 = new Insurance("IPU", 666, 56);
        insurs.add(i3);

        return  insurs;
    }
}

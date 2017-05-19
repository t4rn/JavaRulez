package Services;

import Interfaces.ILogger;

/**
 * Created by kwitkowski on 2017-04-06.
 */
public abstract class AbstractService {
    protected ILogger log;

    public AbstractService(ILogger log) {
        this.log = log;
    }
}

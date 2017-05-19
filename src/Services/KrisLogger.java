package Services;

import Interfaces.ILogger;

/**
 * Created by kwitkowski on 2017-04-05.
 */
public class KrisLogger implements ILogger {

    public enum EnumLogType {
        KNT, IBAX
    }

    protected String log;

    public KrisLogger(EnumLogType type) {
        switch (type) {
            case KNT:
                log = "KNT";
                break;
            case IBAX:
                log = "IBAX";
                break;
        }
    }

    public void debug(String msg) {
        System.out.println(msg);
    }

    public void error(String msg) {
        System.out.println(String.format("ERROR: %s", msg));
    }
}

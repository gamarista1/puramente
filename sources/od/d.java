package Od;

public class d extends a {
    public d(String str) {
        super("Module '" + str + "' not found. Are you sure all modules are linked correctly?");
    }

    public String a() {
        return "E_MODULE_NOT_FOUND";
    }
}

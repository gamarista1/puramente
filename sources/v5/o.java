package v5;

public enum o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f48854a;

    private o(String str) {
        this.f48854a = str;
    }

    public final String b() {
        return this.f48854a;
    }
}

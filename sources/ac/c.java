package Ac;

public enum c {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");
    

    /* renamed from: a  reason: collision with root package name */
    private String f50231a;

    private c(String str) {
        this.f50231a = str;
    }

    public String toString() {
        return this.f50231a;
    }
}

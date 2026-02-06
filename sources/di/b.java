package di;

public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    

    /* renamed from: a  reason: collision with root package name */
    private int f67450a;

    /* renamed from: b  reason: collision with root package name */
    private String f67451b;

    private b(int i10, String str) {
        this.f67450a = i10;
        this.f67451b = str;
    }

    public String toString() {
        return this.f67451b;
    }
}

package Ac;

public enum b {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");
    

    /* renamed from: a  reason: collision with root package name */
    private String f50223a;

    private b(String str) {
        this.f50223a = str;
    }

    public String toString() {
        return this.f50223a;
    }
}

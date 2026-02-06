package Ze;

public enum f {
    QUEUE_OVERFLOW("queue_overflow"),
    CACHE_OVERFLOW("cache_overflow"),
    RATELIMIT_BACKOFF("ratelimit_backoff"),
    NETWORK_ERROR("network_error"),
    SAMPLE_RATE("sample_rate"),
    BEFORE_SEND("before_send"),
    EVENT_PROCESSOR("event_processor"),
    BACKPRESSURE("backpressure");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f66925a;

    private f(String str) {
        this.f66925a = str;
    }

    public String b() {
        return this.f66925a;
    }
}

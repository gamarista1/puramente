package Dc;

import ub.m;

public class p extends m {

    /* renamed from: a  reason: collision with root package name */
    private final a f50591a;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f50598a;

        private a(int i10) {
            this.f50598a = i10;
        }
    }

    public p(String str) {
        super(str);
        this.f50591a = a.UNKNOWN;
    }

    public a a() {
        return this.f50591a;
    }

    public p(String str, Throwable th2) {
        super(str, th2);
        this.f50591a = a.UNKNOWN;
    }

    public p(String str, a aVar) {
        super(str);
        this.f50591a = aVar;
    }

    public p(String str, Throwable th2, a aVar) {
        super(str, th2);
        this.f50591a = aVar;
    }
}

package Ac;

public enum k {
    TERABYTES(1099511627776L) {
    },
    GIGABYTES(1073741824) {
    },
    MEGABYTES(1048576) {
    },
    KILOBYTES(1024) {
    },
    BYTES(1) {
    };
    

    /* renamed from: a  reason: collision with root package name */
    long f50256a;

    public long b(long j10) {
        return (j10 * this.f50256a) / KILOBYTES.f50256a;
    }

    private k(long j10) {
        this.f50256a = j10;
    }
}

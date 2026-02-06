package We;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

public enum c1 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(RCHTTPStatusCodes.NOT_FOUND),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(RCHTTPStatusCodes.FORBIDDEN),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(RCHTTPStatusCodes.UNAUTHORIZED);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f65837a;

    /* renamed from: b  reason: collision with root package name */
    private final int f65838b;

    public static final class a {
    }

    private c1(int i10) {
        this.f65837a = i10;
        this.f65838b = i10;
    }

    private c1(int i10, int i11) {
        this.f65837a = i10;
        this.f65838b = i11;
    }
}

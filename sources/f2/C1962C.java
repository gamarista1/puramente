package f2;

import android.os.Bundle;
import i2.L;

/* renamed from: f2.C  reason: case insensitive filesystem */
public abstract class C1962C extends Exception {

    /* renamed from: d  reason: collision with root package name */
    private static final String f19697d = L.y0(0);

    /* renamed from: e  reason: collision with root package name */
    private static final String f19698e = L.y0(1);

    /* renamed from: f  reason: collision with root package name */
    private static final String f19699f = L.y0(2);

    /* renamed from: g  reason: collision with root package name */
    private static final String f19700g = L.y0(3);

    /* renamed from: h  reason: collision with root package name */
    private static final String f19701h = L.y0(4);

    /* renamed from: i  reason: collision with root package name */
    private static final String f19702i = L.y0(5);

    /* renamed from: a  reason: collision with root package name */
    public final int f19703a;

    /* renamed from: b  reason: collision with root package name */
    public final long f19704b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f19705c;

    protected C1962C(String str, Throwable th2, int i10, Bundle bundle, long j10) {
        super(str, th2);
        this.f19703a = i10;
        this.f19705c = bundle;
        this.f19704b = j10;
    }
}

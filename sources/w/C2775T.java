package w;

import androidx.collection.C;
import androidx.collection.C1602p;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.T  reason: case insensitive filesystem */
public abstract class C2775T {

    /* renamed from: a  reason: collision with root package name */
    private int f27244a;

    /* renamed from: b  reason: collision with root package name */
    private int f27245b;

    /* renamed from: c  reason: collision with root package name */
    private final C f27246c;

    public /* synthetic */ C2775T(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a() {
        return this.f27245b;
    }

    public final int b() {
        return this.f27244a;
    }

    public final C c() {
        return this.f27246c;
    }

    public final void d(int i10) {
        this.f27244a = i10;
    }

    public final C2773Q e(C2773Q q10, C2760D d10) {
        q10.c(d10);
        return q10;
    }

    private C2775T() {
        this.f27244a = 300;
        this.f27246c = C1602p.b();
    }
}

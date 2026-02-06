package lf;

import androidx.concurrent.futures.b;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

final class x implements Lazy, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final a f71844d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f71845e = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "b");

    /* renamed from: a  reason: collision with root package name */
    private volatile C6787a f71846a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f71847b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f71848c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public x(C6787a aVar) {
        C6496s.h(aVar, "initializer");
        this.f71846a = aVar;
        C6510I i10 = C6510I.f71807a;
        this.f71847b = i10;
        this.f71848c = i10;
    }

    private final Object writeReplace() {
        return new C6526j(getValue());
    }

    public boolean e() {
        if (this.f71847b != C6510I.f71807a) {
            return true;
        }
        return false;
    }

    public Object getValue() {
        Object obj = this.f71847b;
        C6510I i10 = C6510I.f71807a;
        if (obj != i10) {
            return obj;
        }
        C6787a aVar = this.f71846a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            if (b.a(f71845e, this, i10, invoke)) {
                this.f71846a = null;
                return invoke;
            }
        }
        return this.f71847b;
    }

    public String toString() {
        if (e()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

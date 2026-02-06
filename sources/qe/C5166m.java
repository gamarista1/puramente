package qe;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: qe.m  reason: case insensitive filesystem */
public final class C5166m extends C5173u {

    /* renamed from: a  reason: collision with root package name */
    private final Object f61448a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5166m(Object obj) {
        super((DefaultConstructorMarker) null);
        C6496s.h(obj, "convertedValue");
        this.f61448a = obj;
    }

    public final Object a() {
        return this.f61448a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C5166m) && C6496s.c(this.f61448a, ((C5166m) obj).f61448a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f61448a.hashCode();
    }

    public String toString() {
        Object obj = this.f61448a;
        return "ConvertedValue(convertedValue=" + obj + ")";
    }
}

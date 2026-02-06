package Ug;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qf.C6655a;
import qf.g;

public final class J extends C6655a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f65317c = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final String f65318b;

    public static final class a implements g.c {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public J(String str) {
        super(f65317c);
        this.f65318b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof J) && C6496s.c(this.f65318b, ((J) obj).f65318b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f65318b.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f65318b + ')';
    }

    public final String z1() {
        return this.f65318b;
    }
}

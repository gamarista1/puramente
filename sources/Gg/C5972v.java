package gg;

import Bg.A;
import eg.C5830g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg.C6577e;
import ng.b;

/* renamed from: gg.v  reason: case insensitive filesystem */
public interface C5972v extends A {

    /* renamed from: gg.v$a */
    public static abstract class a {

        /* renamed from: gg.v$a$a  reason: collision with other inner class name */
        public static final class C1003a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final C5974x f67825a;

            /* renamed from: b  reason: collision with root package name */
            private final byte[] f67826b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1003a(C5974x xVar, byte[] bArr) {
                super((DefaultConstructorMarker) null);
                C6496s.h(xVar, "kotlinJvmBinaryClass");
                this.f67825a = xVar;
                this.f67826b = bArr;
            }

            public final C5974x b() {
                return this.f67825a;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C1003a(C5974x xVar, byte[] bArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(xVar, (i10 & 2) != 0 ? null : bArr);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5974x a() {
            C1003a aVar;
            if (this instanceof C1003a) {
                aVar = (C1003a) this;
            } else {
                aVar = null;
            }
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }

        private a() {
        }
    }

    a a(C5830g gVar, C6577e eVar);

    a b(b bVar, C6577e eVar);
}

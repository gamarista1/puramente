package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.G;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42032a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollTo(obj, new c(Math.round(G.g(readableArray.getDouble(0))), Math.round(G.g(readableArray.getDouble(1))), readableArray.getBoolean(2)));
        }

        private final void e(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollToEnd(obj, new d(readableArray.getBoolean(0)));
        }

        public final Map a() {
            return O.k(C6502A.a("scrollTo", 1), C6502A.a("scrollToEnd", 2), C6502A.a("flashScrollIndicators", 3));
        }

        public final void b(b bVar, Object obj, int i10, ReadableArray readableArray) {
            C6496s.h(bVar, "viewManager");
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        bVar.flashScrollIndicators(obj);
                        return;
                    }
                    String simpleName = bVar.getClass().getSimpleName();
                    throw new IllegalArgumentException("Unsupported command " + i10 + " received by " + simpleName + ".");
                } else if (readableArray != null) {
                    e(bVar, obj, readableArray);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (readableArray != null) {
                d(bVar, obj, readableArray);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }

        public final void c(b bVar, Object obj, String str, ReadableArray readableArray) {
            C6496s.h(bVar, "viewManager");
            C6496s.h(str, "commandType");
            if (obj != null) {
                int hashCode = str.hashCode();
                if (hashCode != -402165208) {
                    if (hashCode != 28425985) {
                        if (hashCode == 2055114131 && str.equals("scrollToEnd")) {
                            if (readableArray != null) {
                                e(bVar, obj, readableArray);
                                return;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (str.equals("flashScrollIndicators")) {
                        bVar.flashScrollIndicators(obj);
                        return;
                    }
                } else if (str.equals("scrollTo")) {
                    if (readableArray != null) {
                        d(bVar, obj, readableArray);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                String simpleName = bVar.getClass().getSimpleName();
                throw new IllegalArgumentException("Unsupported command " + str + " received by " + simpleName + ".");
            }
            throw new IllegalStateException("Required value was null.");
        }

        private a() {
        }
    }

    public interface b {
        void flashScrollIndicators(Object obj);

        void scrollTo(Object obj, c cVar);

        void scrollToEnd(Object obj, d dVar);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f42033a;

        /* renamed from: b  reason: collision with root package name */
        public final int f42034b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f42035c;

        public c(int i10, int i11, boolean z10) {
            this.f42033a = i10;
            this.f42034b = i11;
            this.f42035c = z10;
        }
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f42036a;

        public d(boolean z10) {
            this.f42036a = z10;
        }
    }

    public static final Map a() {
        return f42032a.a();
    }

    public static final void b(b bVar, Object obj, int i10, ReadableArray readableArray) {
        f42032a.b(bVar, obj, i10, readableArray);
    }

    public static final void c(b bVar, Object obj, String str, ReadableArray readableArray) {
        f42032a.c(bVar, obj, str, readableArray);
    }
}

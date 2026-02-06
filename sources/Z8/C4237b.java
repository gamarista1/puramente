package z8;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;

/* renamed from: z8.b  reason: case insensitive filesystem */
public final class C4237b {

    /* renamed from: a  reason: collision with root package name */
    public static final C4237b f50091a = new C4237b();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f50092b;

    /* renamed from: z8.b$a */
    public static abstract class a {
        public abstract a a(String str, int i10);

        public abstract a b(String str, Object obj);

        public abstract void c();
    }

    /* renamed from: z8.b$b  reason: collision with other inner class name */
    private static final class C0759b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final long f50093a;

        public C0759b(long j10) {
            this.f50093a = j10;
        }

        public a a(String str, int i10) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            return this;
        }

        public a b(String str, Object obj) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            return this;
        }

        public void c() {
            C4236a.i(this.f50093a);
        }
    }

    /* renamed from: z8.b$c */
    private static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        private final long f50094a;

        /* renamed from: b  reason: collision with root package name */
        private final String f50095b;

        /* renamed from: c  reason: collision with root package name */
        private final List f50096c = new ArrayList();

        public c(long j10, String str) {
            C6496s.h(str, "sectionName");
            this.f50094a = j10;
            this.f50095b = str;
        }

        private final void d(String str, String str2) {
            List list = this.f50096c;
            list.add(str + ": " + str2);
        }

        public a a(String str, int i10) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            d(str, String.valueOf(i10));
            return this;
        }

        public a b(String str, Object obj) {
            C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
            C6496s.h(obj, "value");
            d(str, obj.toString());
            return this;
        }

        public void c() {
            String str;
            long j10 = this.f50094a;
            String str2 = this.f50095b;
            if (!C4237b.f50092b || this.f50096c.isEmpty()) {
                str = "";
            } else {
                str = " (" + C4238c.a(", ", this.f50096c) + ")";
            }
            C4236a.c(j10, str2 + str);
        }
    }

    private C4237b() {
    }

    public static final a a(long j10, String str) {
        C6496s.h(str, "sectionName");
        return new c(j10, str);
    }

    public static final a b(long j10) {
        return new C0759b(j10);
    }
}

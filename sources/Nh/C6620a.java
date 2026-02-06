package nh;

import gh.C5978b;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6798l;

/* renamed from: nh.a  reason: case insensitive filesystem */
public abstract class C6620a {

    /* renamed from: nh.a$a  reason: collision with other inner class name */
    public static final class C1043a extends C6620a {

        /* renamed from: a  reason: collision with root package name */
        private final C5978b f72416a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1043a(C5978b bVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(bVar, "serializer");
            this.f72416a = bVar;
        }

        public C5978b a(List list) {
            C6496s.h(list, "typeArgumentsSerializers");
            return this.f72416a;
        }

        public final C5978b b() {
            return this.f72416a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1043a) || !C6496s.c(((C1043a) obj).f72416a, this.f72416a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f72416a.hashCode();
        }
    }

    /* renamed from: nh.a$b */
    public static final class b extends C6620a {

        /* renamed from: a  reason: collision with root package name */
        private final C6798l f72417a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C6798l lVar) {
            super((DefaultConstructorMarker) null);
            C6496s.h(lVar, "provider");
            this.f72417a = lVar;
        }

        public C5978b a(List list) {
            C6496s.h(list, "typeArgumentsSerializers");
            return (C5978b) this.f72417a.invoke(list);
        }

        public final C6798l b() {
            return this.f72417a;
        }
    }

    public /* synthetic */ C6620a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C5978b a(List list);

    private C6620a() {
    }
}

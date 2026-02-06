package androidx.work;

import P3.u;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;

public abstract class F {

    /* renamed from: d  reason: collision with root package name */
    public static final b f18650d = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final UUID f18651a;

    /* renamed from: b  reason: collision with root package name */
    private final u f18652b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f18653c;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f18654a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f18655b;

        /* renamed from: c  reason: collision with root package name */
        private UUID f18656c;

        /* renamed from: d  reason: collision with root package name */
        private u f18657d;

        /* renamed from: e  reason: collision with root package name */
        private final Set f18658e;

        public a(Class cls) {
            C6496s.h(cls, "workerClass");
            this.f18654a = cls;
            UUID randomUUID = UUID.randomUUID();
            C6496s.g(randomUUID, "randomUUID()");
            this.f18656c = randomUUID;
            String uuid = this.f18656c.toString();
            C6496s.g(uuid, "id.toString()");
            String name = cls.getName();
            C6496s.g(name, "workerClass.name");
            this.f18657d = new u(uuid, name);
            String name2 = cls.getName();
            C6496s.g(name2, "workerClass.name");
            this.f18658e = Y.h(name2);
        }

        public final F a() {
            boolean z10;
            F b10 = b();
            C1838e eVar = this.f18657d.f5100j;
            if (eVar.e() || eVar.f() || eVar.g() || eVar.h()) {
                z10 = true;
            } else {
                z10 = false;
            }
            u uVar = this.f18657d;
            if (uVar.f5107q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (uVar.f5097g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID randomUUID = UUID.randomUUID();
            C6496s.g(randomUUID, "randomUUID()");
            i(randomUUID);
            return b10;
        }

        public abstract F b();

        public final boolean c() {
            return this.f18655b;
        }

        public final UUID d() {
            return this.f18656c;
        }

        public final Set e() {
            return this.f18658e;
        }

        public abstract a f();

        public final u g() {
            return this.f18657d;
        }

        public final a h(C1838e eVar) {
            C6496s.h(eVar, "constraints");
            this.f18657d.f5100j = eVar;
            return f();
        }

        public final a i(UUID uuid) {
            C6496s.h(uuid, "id");
            this.f18656c = uuid;
            String uuid2 = uuid.toString();
            C6496s.g(uuid2, "id.toString()");
            this.f18657d = new u(uuid2, this.f18657d);
            return f();
        }

        public final a j(C1840g gVar) {
            C6496s.h(gVar, "inputData");
            this.f18657d.f5095e = gVar;
            return f();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public F(UUID uuid, u uVar, Set set) {
        C6496s.h(uuid, "id");
        C6496s.h(uVar, "workSpec");
        C6496s.h(set, "tags");
        this.f18651a = uuid;
        this.f18652b = uVar;
        this.f18653c = set;
    }

    public UUID a() {
        return this.f18651a;
    }

    public final String b() {
        String uuid = a().toString();
        C6496s.g(uuid, "id.toString()");
        return uuid;
    }

    public final Set c() {
        return this.f18653c;
    }

    public final u d() {
        return this.f18652b;
    }
}

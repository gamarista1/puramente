package androidx.work;

import R3.b;
import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f18665a;

    /* renamed from: b  reason: collision with root package name */
    private C1840g f18666b;

    /* renamed from: c  reason: collision with root package name */
    private Set f18667c;

    /* renamed from: d  reason: collision with root package name */
    private a f18668d;

    /* renamed from: e  reason: collision with root package name */
    private int f18669e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f18670f;

    /* renamed from: g  reason: collision with root package name */
    private b f18671g;

    /* renamed from: h  reason: collision with root package name */
    private G f18672h;

    /* renamed from: i  reason: collision with root package name */
    private y f18673i;

    /* renamed from: j  reason: collision with root package name */
    private k f18674j;

    /* renamed from: k  reason: collision with root package name */
    private int f18675k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List f18676a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List f18677b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f18678c;
    }

    public WorkerParameters(UUID uuid, C1840g gVar, Collection collection, a aVar, int i10, int i11, Executor executor, b bVar, G g10, y yVar, k kVar) {
        this.f18665a = uuid;
        this.f18666b = gVar;
        this.f18667c = new HashSet(collection);
        this.f18668d = aVar;
        this.f18669e = i10;
        this.f18675k = i11;
        this.f18670f = executor;
        this.f18671g = bVar;
        this.f18672h = g10;
        this.f18673i = yVar;
        this.f18674j = kVar;
    }

    public Executor a() {
        return this.f18670f;
    }

    public k b() {
        return this.f18674j;
    }

    public UUID c() {
        return this.f18665a;
    }

    public C1840g d() {
        return this.f18666b;
    }

    public Network e() {
        return this.f18668d.f18678c;
    }

    public y f() {
        return this.f18673i;
    }

    public int g() {
        return this.f18669e;
    }

    public Set h() {
        return this.f18667c;
    }

    public b i() {
        return this.f18671g;
    }

    public List j() {
        return this.f18668d.f18676a;
    }

    public List k() {
        return this.f18668d.f18677b;
    }

    public G l() {
        return this.f18672h;
    }
}

package androidx.work.impl;

import P3.m;
import androidx.work.C1836c;
import java.util.List;
import java.util.concurrent.Executor;

public final /* synthetic */ class x implements C1846f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f19007a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f19008b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1836c f19009c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f19010d;

    public /* synthetic */ x(Executor executor, List list, C1836c cVar, WorkDatabase workDatabase) {
        this.f19007a = executor;
        this.f19008b = list;
        this.f19009c = cVar;
        this.f19010d = workDatabase;
    }

    public final void b(m mVar, boolean z10) {
        this.f19007a.execute(new y(this.f19008b, mVar, this.f19009c, this.f19010d));
    }
}

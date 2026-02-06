package androidx.work.impl;

import P3.m;
import androidx.work.C1836c;
import java.util.List;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f19011a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f19012b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1836c f19013c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f19014d;

    public /* synthetic */ y(List list, m mVar, C1836c cVar, WorkDatabase workDatabase) {
        this.f19011a = list;
        this.f19012b = mVar;
        this.f19013c = cVar;
        this.f19014d = workDatabase;
    }

    public final void run() {
        z.d(this.f19011a, this.f19012b, this.f19013c, this.f19014d);
    }
}

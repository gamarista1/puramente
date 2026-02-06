package com.th3rdwave.safeareacontext;

import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import kotlin.jvm.internal.C6496s;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final l f60030a;

    /* renamed from: b  reason: collision with root package name */
    private final l f60031b;

    /* renamed from: c  reason: collision with root package name */
    private final l f60032c;

    /* renamed from: d  reason: collision with root package name */
    private final l f60033d;

    public m(l lVar, l lVar2, l lVar3, l lVar4) {
        C6496s.h(lVar, VerticalAlignment.TOP);
        C6496s.h(lVar2, BlockAlignment.RIGHT);
        C6496s.h(lVar3, VerticalAlignment.BOTTOM);
        C6496s.h(lVar4, BlockAlignment.LEFT);
        this.f60030a = lVar;
        this.f60031b = lVar2;
        this.f60032c = lVar3;
        this.f60033d = lVar4;
    }

    public final l a() {
        return this.f60032c;
    }

    public final l b() {
        return this.f60033d;
    }

    public final l c() {
        return this.f60031b;
    }

    public final l d() {
        return this.f60030a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f60030a == mVar.f60030a && this.f60031b == mVar.f60031b && this.f60032c == mVar.f60032c && this.f60033d == mVar.f60033d;
    }

    public int hashCode() {
        return (((((this.f60030a.hashCode() * 31) + this.f60031b.hashCode()) * 31) + this.f60032c.hashCode()) * 31) + this.f60033d.hashCode();
    }

    public String toString() {
        l lVar = this.f60030a;
        l lVar2 = this.f60031b;
        l lVar3 = this.f60032c;
        l lVar4 = this.f60033d;
        return "SafeAreaViewEdges(top=" + lVar + ", right=" + lVar2 + ", bottom=" + lVar3 + ", left=" + lVar4 + ")";
    }
}

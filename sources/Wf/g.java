package wf;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final File f73706a;

    /* renamed from: b  reason: collision with root package name */
    private final List f73707b;

    public g(File file, List list) {
        C6496s.h(file, "root");
        C6496s.h(list, "segments");
        this.f73706a = file;
        this.f73707b = list;
    }

    public final File a() {
        return this.f73706a;
    }

    public final List b() {
        return this.f73707b;
    }

    public final int c() {
        return this.f73707b.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (C6496s.c(this.f73706a, gVar.f73706a) && C6496s.c(this.f73707b, gVar.f73707b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f73706a.hashCode() * 31) + this.f73707b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f73706a + ", segments=" + this.f73707b + ')';
    }
}

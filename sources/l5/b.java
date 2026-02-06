package L5;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f32516b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final File f32517a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(File file) {
            C6496s.h(file, "file");
            return new b(file, (DefaultConstructorMarker) null);
        }

        public final b b(File file) {
            if (file != null) {
                return new b(file, (DefaultConstructorMarker) null);
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final b b(File file) {
        return f32516b.a(file);
    }

    public static final b c(File file) {
        return f32516b.b(file);
    }

    public InputStream a() {
        return new FileInputStream(this.f32517a);
    }

    public final File d() {
        return this.f32517a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return C6496s.c(this.f32517a, ((b) obj).f32517a);
    }

    public int hashCode() {
        return this.f32517a.hashCode();
    }

    public long size() {
        return this.f32517a.length();
    }

    private b(File file) {
        this.f32517a = file;
    }
}

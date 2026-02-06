package androidx.graphics.path;

import U1.a;
import android.graphics.Path;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H ¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\u0019\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\bH ¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\fH\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/graphics/path/PathIteratorPreApi34Impl;", "LU1/a;", "Landroid/graphics/Path;", "path", "", "conicEvaluation", "", "tolerance", "", "createInternalPathIterator", "(Landroid/graphics/Path;IF)J", "internalPathIterator", "Llf/M;", "destroyInternalPathIterator", "(J)V", "", "internalPathIteratorHasNext", "(J)Z", "", "points", "offset", "internalPathIteratorNext", "(J[FI)I", "internalPathIteratorPeek", "(J)I", "internalPathIteratorRawSize", "internalPathIteratorSize", "finalize", "()V", "b", "J", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PathIteratorPreApi34Impl extends a {

    /* renamed from: b  reason: collision with root package name */
    private final long f17076b;

    private final native long createInternalPathIterator(Path path, int i10, float f10);

    private final native void destroyInternalPathIterator(long j10);

    private final native boolean internalPathIteratorHasNext(long j10);

    private final native int internalPathIteratorNext(long j10, float[] fArr, int i10);

    private final native int internalPathIteratorPeek(long j10);

    private final native int internalPathIteratorRawSize(long j10);

    private final native int internalPathIteratorSize(long j10);

    /* access modifiers changed from: protected */
    public final void finalize() {
        destroyInternalPathIterator(this.f17076b);
    }
}

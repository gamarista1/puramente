package zh;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: zh.b  reason: case insensitive filesystem */
public enum C6844b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: b  reason: collision with root package name */
    public static final a f74008b = null;

    /* renamed from: a  reason: collision with root package name */
    private final int f74024a;

    /* renamed from: zh.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6844b a(int i10) {
            for (C6844b bVar : C6844b.values()) {
                if (bVar.b() == i10) {
                    return bVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        f74008b = new a((DefaultConstructorMarker) null);
    }

    private C6844b(int i10) {
        this.f74024a = i10;
    }

    public final int b() {
        return this.f74024a;
    }
}

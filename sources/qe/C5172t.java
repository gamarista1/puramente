package qe;

import Ff.d;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import je.C5052a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;

/* renamed from: qe.t  reason: case insensitive filesystem */
public final class C5172t extends C5175w {

    /* renamed from: qe.t$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f61449a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f61449a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qe.C5172t.a.<clinit>():void");
        }
    }

    public C5172t(boolean z10) {
        super(z10);
    }

    private final LocalDate i(long j10) {
        LocalDate a10 = Instant.ofEpochMilli(j10).atZone(ZoneId.systemDefault()).toLocalDate();
        C6496s.g(a10, "toLocalDate(...)");
        return a10;
    }

    public ExpectedType b() {
        return new ExpectedType(new SingleType(C5052a.INT, (ExpectedType[]) null, 2, (DefaultConstructorMarker) null), new SingleType(C5052a.STRING, (ExpectedType[]) null, 2, (DefaultConstructorMarker) null));
    }

    public boolean c() {
        return false;
    }

    /* renamed from: g */
    public LocalDate e(Object obj, C4464a aVar) {
        C6496s.h(obj, "value");
        if (obj instanceof String) {
            LocalDate a10 = LocalDate.parse((CharSequence) obj, DateTimeFormatter.ISO_DATE_TIME);
            C6496s.g(a10, "parse(...)");
            return a10;
        } else if (obj instanceof Long) {
            return i(((Number) obj).longValue());
        } else {
            d b10 = O.b(obj.getClass());
            throw new UnexpectedException("Unknown argument type: " + b10);
        }
    }

    /* renamed from: h */
    public LocalDate f(Dynamic dynamic, C4464a aVar) {
        C6496s.h(dynamic, "value");
        int i10 = a.f61449a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            LocalDate a10 = LocalDate.parse(dynamic.asString(), DateTimeFormatter.ISO_DATE_TIME);
            C6496s.g(a10, "parse(...)");
            return a10;
        } else if (i10 == 2) {
            return i((long) dynamic.asDouble());
        } else {
            ReadableType type = dynamic.getType();
            throw new UnexpectedException("Unknown argument type: " + type);
        }
    }
}

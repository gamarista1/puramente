package a;

/* renamed from: a.b  reason: case insensitive filesystem */
public abstract class C1535b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10552a = "_COROUTINE";

    /* access modifiers changed from: private */
    public static final StackTraceElement b(Throwable th2, String str) {
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        return new StackTraceElement(f10552a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}

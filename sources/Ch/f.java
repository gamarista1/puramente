package Ch;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.C6496s;

public final class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final f f62644a = new f();

    private f() {
    }

    public void publish(LogRecord logRecord) {
        C6496s.h(logRecord, "record");
        e eVar = e.f62641a;
        String loggerName = logRecord.getLoggerName();
        C6496s.g(loggerName, "record.loggerName");
        int a10 = g.b(logRecord);
        String message = logRecord.getMessage();
        C6496s.g(message, "record.message");
        eVar.a(loggerName, a10, message, logRecord.getThrown());
    }

    public void close() {
    }

    public void flush() {
    }
}

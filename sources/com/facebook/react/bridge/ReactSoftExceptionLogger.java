package com.facebook.react.bridge;

import B7.a;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.common.Constants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "listener", "Llf/M;", "addListener", "(Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;)V", "removeListener", "clearListeners", "", "category", "", "cause", "logSoftExceptionVerbose", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "logSoftException", "message", "logNoThrowSoftExceptionWithMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "", "listeners", "Ljava/util/List;", "ReactSoftExceptionListener", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
public final class ReactSoftExceptionLogger {
    public static final ReactSoftExceptionLogger INSTANCE = new ReactSoftExceptionLogger();
    private static final List<ReactSoftExceptionListener> listeners = new CopyOnWriteArrayList();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "", "", "category", "", "cause", "Llf/M;", "logSoftException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th2);
    }

    private ReactSoftExceptionLogger() {
    }

    public static final void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        C6496s.h(reactSoftExceptionListener, "listener");
        List<ReactSoftExceptionListener> list = listeners;
        if (!list.contains(reactSoftExceptionListener)) {
            list.add(reactSoftExceptionListener);
        }
    }

    public static final void clearListeners() {
        listeners.clear();
    }

    @a
    private static final void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new ReactNoCrashSoftException(str2));
    }

    public static final void logSoftException(String str, Throwable th2) {
        C6496s.h(str, "category");
        C6496s.h(th2, "cause");
        List<ReactSoftExceptionListener> list = listeners;
        if (!list.isEmpty()) {
            for (ReactSoftExceptionListener logSoftException : list) {
                logSoftException.logSoftException(str, th2);
            }
            return;
        }
        U5.a.n(str, "Unhandled SoftException", th2);
    }

    public static final void logSoftExceptionVerbose(String str, Throwable th2) {
        C6496s.h(str, "category");
        C6496s.h(th2, "cause");
        String simpleName = th2.getClass().getSimpleName();
        String message = th2.getMessage();
        logSoftException(str + f.f37531c + simpleName + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + message, th2);
    }

    public static final void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        C6496s.h(reactSoftExceptionListener, "listener");
        listeners.remove(reactSoftExceptionListener);
    }
}

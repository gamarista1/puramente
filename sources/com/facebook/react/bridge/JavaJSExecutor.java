package com.facebook.react.bridge;

import B7.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H'¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/JavaJSExecutor;", "", "Llf/M;", "close", "()V", "", "sourceURL", "loadBundle", "(Ljava/lang/String;)V", "methodName", "jsonArgsArray", "executeJSCall", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "propertyName", "jsonEncodedValue", "setGlobalVariable", "(Ljava/lang/String;Ljava/lang/String;)V", "Factory", "ProxyExecutorException", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@a
public interface JavaJSExecutor {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/JavaJSExecutor$Factory;", "", "create", "Lcom/facebook/react/bridge/JavaJSExecutor;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        JavaJSExecutor create();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/bridge/JavaJSExecutor$ProxyExecutorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProxyExecutorException extends Exception {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProxyExecutorException(Throwable th2) {
            super(th2);
            C6496s.h(th2, "cause");
        }
    }

    void close();

    @a
    String executeJSCall(String str, String str2);

    @a
    void loadBundle(String str);

    @a
    void setGlobalVariable(String str, String str2);
}

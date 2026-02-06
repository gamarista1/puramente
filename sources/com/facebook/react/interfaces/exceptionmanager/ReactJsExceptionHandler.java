package com.facebook.react.interfaces.exceptionmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0001\u0018\u00002\u00020\u0001:\u0003\u0007\b\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;", "errorMap", "Llf/M;", "reportJsException", "(Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;)V", "ParsedError", "ParsedStackFrameImpl", "ParsedErrorImpl", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ReactJsExceptionHandler {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u001cR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;", "", "message", "", "getMessage", "()Ljava/lang/String;", "originalMessage", "getOriginalMessage", "name", "getName", "componentStack", "getComponentStack", "stack", "", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;", "getStack", "()Ljava/util/List;", "id", "", "getId", "()I", "isFatal", "", "()Z", "extraData", "Lcom/facebook/react/bridge/ReadableMap;", "getExtraData", "()Lcom/facebook/react/bridge/ReadableMap;", "StackFrame", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ParsedError {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;", "", "file", "", "getFile", "()Ljava/lang/String;", "methodName", "getMethodName", "lineNumber", "", "getLineNumber", "()Ljava/lang/Integer;", "column", "getColumn", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface StackFrame {
            Integer getColumn();

            String getFile();

            Integer getLineNumber();

            String getMethodName();
        }

        String getComponentStack();

        ReadableMap getExtraData();

        int getId();

        String getMessage();

        String getName();

        String getOriginalMessage();

        List<StackFrame> getStack();

        boolean isFatal();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;", "message", "", "originalMessage", "name", "componentStack", "stack", "Ljava/util/ArrayList;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;", "id", "", "isFatal", "", "extraData", "Lcom/facebook/react/bridge/ReadableNativeMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IZLcom/facebook/react/bridge/ReadableNativeMap;)V", "getMessage", "()Ljava/lang/String;", "getOriginalMessage", "getName", "getComponentStack", "getStack", "()Ljava/util/ArrayList;", "getId", "()I", "()Z", "getExtraData", "()Lcom/facebook/react/bridge/ReadableNativeMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ParsedErrorImpl implements ParsedError {
        private final String componentStack;
        private final ReadableNativeMap extraData;

        /* renamed from: id  reason: collision with root package name */
        private final int f40911id;
        private final boolean isFatal;
        private final String message;
        private final String name;
        private final String originalMessage;
        private final ArrayList<ParsedStackFrameImpl> stack;

        public ParsedErrorImpl(String str, String str2, String str3, String str4, ArrayList<ParsedStackFrameImpl> arrayList, int i10, boolean z10, ReadableNativeMap readableNativeMap) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            C6496s.h(arrayList, "stack");
            C6496s.h(readableNativeMap, "extraData");
            this.message = str;
            this.originalMessage = str2;
            this.name = str3;
            this.componentStack = str4;
            this.stack = arrayList;
            this.f40911id = i10;
            this.isFatal = z10;
            this.extraData = readableNativeMap;
        }

        public static /* synthetic */ ParsedErrorImpl copy$default(ParsedErrorImpl parsedErrorImpl, String str, String str2, String str3, String str4, ArrayList arrayList, int i10, boolean z10, ReadableNativeMap readableNativeMap, int i11, Object obj) {
            ParsedErrorImpl parsedErrorImpl2 = parsedErrorImpl;
            int i12 = i11;
            return parsedErrorImpl.copy((i12 & 1) != 0 ? parsedErrorImpl2.message : str, (i12 & 2) != 0 ? parsedErrorImpl2.originalMessage : str2, (i12 & 4) != 0 ? parsedErrorImpl2.name : str3, (i12 & 8) != 0 ? parsedErrorImpl2.componentStack : str4, (i12 & 16) != 0 ? parsedErrorImpl2.stack : arrayList, (i12 & 32) != 0 ? parsedErrorImpl2.f40911id : i10, (i12 & 64) != 0 ? parsedErrorImpl2.isFatal : z10, (i12 & 128) != 0 ? parsedErrorImpl2.extraData : readableNativeMap);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.originalMessage;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.componentStack;
        }

        public final ArrayList<ParsedStackFrameImpl> component5() {
            return this.stack;
        }

        public final int component6() {
            return this.f40911id;
        }

        public final boolean component7() {
            return this.isFatal;
        }

        public final ReadableNativeMap component8() {
            return this.extraData;
        }

        public final ParsedErrorImpl copy(String str, String str2, String str3, String str4, ArrayList<ParsedStackFrameImpl> arrayList, int i10, boolean z10, ReadableNativeMap readableNativeMap) {
            C6496s.h(str, MetricTracker.Object.MESSAGE);
            C6496s.h(arrayList, "stack");
            ReadableNativeMap readableNativeMap2 = readableNativeMap;
            C6496s.h(readableNativeMap2, "extraData");
            return new ParsedErrorImpl(str, str2, str3, str4, arrayList, i10, z10, readableNativeMap2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsedErrorImpl)) {
                return false;
            }
            ParsedErrorImpl parsedErrorImpl = (ParsedErrorImpl) obj;
            return C6496s.c(this.message, parsedErrorImpl.message) && C6496s.c(this.originalMessage, parsedErrorImpl.originalMessage) && C6496s.c(this.name, parsedErrorImpl.name) && C6496s.c(this.componentStack, parsedErrorImpl.componentStack) && C6496s.c(this.stack, parsedErrorImpl.stack) && this.f40911id == parsedErrorImpl.f40911id && this.isFatal == parsedErrorImpl.isFatal && C6496s.c(this.extraData, parsedErrorImpl.extraData);
        }

        public String getComponentStack() {
            return this.componentStack;
        }

        public int getId() {
            return this.f40911id;
        }

        public String getMessage() {
            return this.message;
        }

        public String getName() {
            return this.name;
        }

        public String getOriginalMessage() {
            return this.originalMessage;
        }

        public int hashCode() {
            int hashCode = this.message.hashCode() * 31;
            String str = this.originalMessage;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.componentStack;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return ((((((((hashCode3 + i10) * 31) + this.stack.hashCode()) * 31) + Integer.hashCode(this.f40911id)) * 31) + Boolean.hashCode(this.isFatal)) * 31) + this.extraData.hashCode();
        }

        public boolean isFatal() {
            return this.isFatal;
        }

        public String toString() {
            String str = this.message;
            String str2 = this.originalMessage;
            String str3 = this.name;
            String str4 = this.componentStack;
            ArrayList<ParsedStackFrameImpl> arrayList = this.stack;
            int i10 = this.f40911id;
            boolean z10 = this.isFatal;
            ReadableNativeMap readableNativeMap = this.extraData;
            return "ParsedErrorImpl(message=" + str + ", originalMessage=" + str2 + ", name=" + str3 + ", componentStack=" + str4 + ", stack=" + arrayList + ", id=" + i10 + ", isFatal=" + z10 + ", extraData=" + readableNativeMap + ")";
        }

        public ReadableNativeMap getExtraData() {
            return this.extraData;
        }

        public ArrayList<ParsedStackFrameImpl> getStack() {
            return this.stack;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ<\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;", "file", "", "methodName", "lineNumber", "", "column", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFile", "()Ljava/lang/String;", "getMethodName", "getLineNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColumn", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;", "equals", "", "other", "", "hashCode", "toString", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ParsedStackFrameImpl implements ParsedError.StackFrame {
        private final Integer column;
        private final String file;
        private final Integer lineNumber;
        private final String methodName;

        public ParsedStackFrameImpl(String str, String str2, Integer num, Integer num2) {
            C6496s.h(str2, "methodName");
            this.file = str;
            this.methodName = str2;
            this.lineNumber = num;
            this.column = num2;
        }

        public static /* synthetic */ ParsedStackFrameImpl copy$default(ParsedStackFrameImpl parsedStackFrameImpl, String str, String str2, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = parsedStackFrameImpl.file;
            }
            if ((i10 & 2) != 0) {
                str2 = parsedStackFrameImpl.methodName;
            }
            if ((i10 & 4) != 0) {
                num = parsedStackFrameImpl.lineNumber;
            }
            if ((i10 & 8) != 0) {
                num2 = parsedStackFrameImpl.column;
            }
            return parsedStackFrameImpl.copy(str, str2, num, num2);
        }

        public final String component1() {
            return this.file;
        }

        public final String component2() {
            return this.methodName;
        }

        public final Integer component3() {
            return this.lineNumber;
        }

        public final Integer component4() {
            return this.column;
        }

        public final ParsedStackFrameImpl copy(String str, String str2, Integer num, Integer num2) {
            C6496s.h(str2, "methodName");
            return new ParsedStackFrameImpl(str, str2, num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParsedStackFrameImpl)) {
                return false;
            }
            ParsedStackFrameImpl parsedStackFrameImpl = (ParsedStackFrameImpl) obj;
            return C6496s.c(this.file, parsedStackFrameImpl.file) && C6496s.c(this.methodName, parsedStackFrameImpl.methodName) && C6496s.c(this.lineNumber, parsedStackFrameImpl.lineNumber) && C6496s.c(this.column, parsedStackFrameImpl.column);
        }

        public Integer getColumn() {
            return this.column;
        }

        public String getFile() {
            return this.file;
        }

        public Integer getLineNumber() {
            return this.lineNumber;
        }

        public String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            String str = this.file;
            int i10 = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.methodName.hashCode()) * 31;
            Integer num = this.lineNumber;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.column;
            if (num2 != null) {
                i10 = num2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.file;
            String str2 = this.methodName;
            Integer num = this.lineNumber;
            Integer num2 = this.column;
            return "ParsedStackFrameImpl(file=" + str + ", methodName=" + str2 + ", lineNumber=" + num + ", column=" + num2 + ")";
        }
    }

    void reportJsException(ParsedError parsedError);
}

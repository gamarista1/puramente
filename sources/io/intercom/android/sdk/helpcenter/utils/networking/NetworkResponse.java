package io.intercom.android.sdk.helpcenter.utils.networking;

import io.branch.rnbranch.RNBranchModule;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "T", "", "<init>", "()V", "Success", "ServerError", "NetworkError", "ClientError", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ClientError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$NetworkError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ServerError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$Success;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NetworkResponse<T> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ClientError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClientError extends NetworkResponse {
        public static final int $stable = 8;
        private final Throwable error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientError(Throwable th2) {
            super((DefaultConstructorMarker) null);
            C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            this.error = th2;
        }

        public static /* synthetic */ ClientError copy$default(ClientError clientError, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = clientError.error;
            }
            return clientError.copy(th2);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final ClientError copy(Throwable th2) {
            C6496s.h(th2, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            return new ClientError(th2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientError) && C6496s.c(this.error, ((ClientError) obj).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "ClientError(error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$NetworkError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "error", "Ljava/io/IOException;", "<init>", "(Ljava/io/IOException;)V", "getError", "()Ljava/io/IOException;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkError extends NetworkResponse {
        public static final int $stable = 8;
        private final IOException error;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NetworkError(IOException iOException) {
            super((DefaultConstructorMarker) null);
            C6496s.h(iOException, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            this.error = iOException;
        }

        public static /* synthetic */ NetworkError copy$default(NetworkError networkError, IOException iOException, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iOException = networkError.error;
            }
            return networkError.copy(iOException);
        }

        public final IOException component1() {
            return this.error;
        }

        public final NetworkError copy(IOException iOException) {
            C6496s.h(iOException, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            return new NetworkError(iOException);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && C6496s.c(this.error, ((NetworkError) obj).error);
        }

        public final IOException getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "NetworkError(error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH×\u0003J\t\u0010\u000f\u001a\u00020\u0004H×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$ServerError;", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "", "code", "", "<init>", "(I)V", "getCode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ServerError extends NetworkResponse {
        public static final int $stable = 0;
        private final int code;

        public ServerError(int i10) {
            super((DefaultConstructorMarker) null);
            this.code = i10;
        }

        public static /* synthetic */ ServerError copy$default(ServerError serverError, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = serverError.code;
            }
            return serverError.copy(i10);
        }

        public final int component1() {
            return this.code;
        }

        public final ServerError copy(int i10) {
            return new ServerError(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServerError) && this.code == ((ServerError) obj).code;
        }

        public final int getCode() {
            return this.code;
        }

        public int hashCode() {
            return Integer.hashCode(this.code);
        }

        public String toString() {
            return "ServerError(code=" + this.code + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u0001HÇ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0013\u0010\u0004\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$Success;", "T", "", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "body", "<init>", "(Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse$Success;", "equals", "", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Success<T> extends NetworkResponse<T> {
        public static final int $stable = 0;
        private final T body;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(T t10) {
            super((DefaultConstructorMarker) null);
            C6496s.h(t10, "body");
            this.body = t10;
        }

        public static /* synthetic */ Success copy$default(Success success, T t10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                t10 = success.body;
            }
            return success.copy(t10);
        }

        public final T component1() {
            return this.body;
        }

        public final Success<T> copy(T t10) {
            C6496s.h(t10, "body");
            return new Success<>(t10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && C6496s.c(this.body, ((Success) obj).body);
        }

        public final T getBody() {
            return this.body;
        }

        public int hashCode() {
            return this.body.hashCode();
        }

        public String toString() {
            return "Success(body=" + this.body + ')';
        }
    }

    public /* synthetic */ NetworkResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NetworkResponse() {
    }
}

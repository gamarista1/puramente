package com.revenuecat.purchases.common.verification;

import Sg.C5541d;
import Sg.p;
import android.util.Base64;
import com.amazon.a.a.o.b.f;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.strings.NetworkStrings;
import com.revenuecat.purchases.utils.Result;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0007J,\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000e2\u001a\u0010\u000f\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0011\u0018\u00010\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJJ\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager;", "", "signatureVerificationMode", "Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "appConfig", "Lcom/revenuecat/purchases/common/AppConfig;", "apiKey", "", "(Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;Lcom/revenuecat/purchases/common/AppConfig;Ljava/lang/String;)V", "getSignatureVerificationMode", "()Lcom/revenuecat/purchases/common/verification/SignatureVerificationMode;", "createRandomNonce", "getPostParamsForSigningHeaderIfNeeded", "endpoint", "Lcom/revenuecat/purchases/common/networking/Endpoint;", "postFieldsToSign", "", "Lkotlin/Pair;", "shouldVerifyEndpoint", "", "verifyResponse", "Lcom/revenuecat/purchases/VerificationResult;", "urlPath", "signatureString", "nonce", "body", "requestTime", "eTag", "postFieldsToSignHeader", "Companion", "Parameters", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SigningManager {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;
    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";
    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Companion;", "", "()V", "NONCE_BYTES_SIZE", "", "POST_PARAMS_ALGORITHM", "", "POST_PARAMS_SEPARATOR", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ja\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0006\u0010%\u001a\u00020\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/common/verification/SigningManager$Parameters;", "", "salt", "", "apiKey", "", "nonce", "urlPath", "postParamsHashHeader", "requestTime", "eTag", "body", "([BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "getBody", "getETag", "getNonce", "getPostParamsHashHeader", "getRequestTime", "getSalt", "()[B", "getUrlPath", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toSignatureToVerify", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            C6496s.h(bArr, "salt");
            C6496s.h(str, "apiKey");
            C6496s.h(str3, "urlPath");
            C6496s.h(str5, "requestTime");
            this.salt = bArr;
            this.apiKey = str;
            this.nonce = str2;
            this.urlPath = str3;
            this.postParamsHashHeader = str4;
            this.requestTime = str5;
            this.eTag = str6;
            this.body = str7;
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
            Parameters parameters2 = parameters;
            int i11 = i10;
            return parameters.copy((i11 & 1) != 0 ? parameters2.salt : bArr, (i11 & 2) != 0 ? parameters2.apiKey : str, (i11 & 4) != 0 ? parameters2.nonce : str2, (i11 & 8) != 0 ? parameters2.urlPath : str3, (i11 & 16) != 0 ? parameters2.postParamsHashHeader : str4, (i11 & 32) != 0 ? parameters2.requestTime : str5, (i11 & 64) != 0 ? parameters2.eTag : str6, (i11 & 128) != 0 ? parameters2.body : str7);
        }

        public final byte[] component1() {
            return this.salt;
        }

        public final String component2() {
            return this.apiKey;
        }

        public final String component3() {
            return this.nonce;
        }

        public final String component4() {
            return this.urlPath;
        }

        public final String component5() {
            return this.postParamsHashHeader;
        }

        public final String component6() {
            return this.requestTime;
        }

        public final String component7() {
            return this.eTag;
        }

        public final String component8() {
            return this.body;
        }

        public final Parameters copy(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            C6496s.h(bArr, "salt");
            C6496s.h(str, "apiKey");
            C6496s.h(str3, "urlPath");
            String str8 = str5;
            C6496s.h(str8, "requestTime");
            return new Parameters(bArr, str, str2, str3, str4, str8, str6, str7);
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!C6496s.c(Parameters.class, cls)) {
                return false;
            }
            C6496s.f(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) obj;
            if (Arrays.equals(this.salt, parameters.salt) && C6496s.c(this.apiKey, parameters.apiKey) && C6496s.c(this.nonce, parameters.nonce) && C6496s.c(this.urlPath, parameters.urlPath) && C6496s.c(this.postParamsHashHeader, parameters.postParamsHashHeader) && C6496s.c(this.requestTime, parameters.requestTime) && C6496s.c(this.eTag, parameters.eTag) && C6496s.c(this.body, parameters.body)) {
                return true;
            }
            return false;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12;
            int hashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int i13 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int hashCode2 = (((hashCode + i10) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            if (str2 != null) {
                i11 = str2.hashCode();
            } else {
                i11 = 0;
            }
            int hashCode3 = (((hashCode2 + i11) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            if (str3 != null) {
                i12 = str3.hashCode();
            } else {
                i12 = 0;
            }
            int i14 = (hashCode3 + i12) * 31;
            String str4 = this.body;
            if (str4 != null) {
                i13 = str4.hashCode();
            }
            return i14 + i13;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
            if (r1 == null) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
            if (r1 == null) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
            if (r1 == null) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final byte[] toSignatureToVerify() {
            /*
                r5 = this;
                byte[] r0 = r5.salt
                java.lang.String r1 = r5.apiKey
                java.nio.charset.Charset r2 = Sg.C5541d.f65029b
                byte[] r1 = r1.getBytes(r2)
                java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
                kotlin.jvm.internal.C6496s.g(r1, r3)
                byte[] r0 = mf.C6559l.B(r0, r1)
                java.lang.String r1 = r5.nonce
                r4 = 0
                if (r1 == 0) goto L_0x001d
                byte[] r1 = android.util.Base64.decode(r1, r4)
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                if (r1 != 0) goto L_0x0022
                byte[] r1 = new byte[r4]
            L_0x0022:
                byte[] r0 = mf.C6559l.B(r0, r1)
                java.lang.String r1 = r5.urlPath
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.C6496s.g(r1, r3)
                byte[] r0 = mf.C6559l.B(r0, r1)
                java.lang.String r1 = r5.postParamsHashHeader
                if (r1 == 0) goto L_0x0040
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.C6496s.g(r1, r3)
                if (r1 != 0) goto L_0x0042
            L_0x0040:
                byte[] r1 = new byte[r4]
            L_0x0042:
                byte[] r0 = mf.C6559l.B(r0, r1)
                java.lang.String r1 = r5.requestTime
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.C6496s.g(r1, r3)
                byte[] r0 = mf.C6559l.B(r0, r1)
                java.lang.String r1 = r5.eTag
                if (r1 == 0) goto L_0x0060
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.C6496s.g(r1, r3)
                if (r1 != 0) goto L_0x0062
            L_0x0060:
                byte[] r1 = new byte[r4]
            L_0x0062:
                byte[] r0 = mf.C6559l.B(r0, r1)
                java.lang.String r1 = r5.body
                if (r1 == 0) goto L_0x0073
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.C6496s.g(r1, r3)
                if (r1 != 0) goto L_0x0075
            L_0x0073:
                byte[] r1 = new byte[r4]
            L_0x0075:
                byte[] r0 = mf.C6559l.B(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.verification.SigningManager.Parameters.toSignatureToVerify():byte[]");
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode2, AppConfig appConfig2, String str) {
        C6496s.h(signatureVerificationMode2, "signatureVerificationMode");
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(str, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode2;
        this.appConfig = appConfig2;
        this.apiKey = str;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] encode = Base64.encode(bArr, 0);
        C6496s.g(encode, "encode(bytes, Base64.DEFAULT)");
        return p.g1(new String(encode, C5541d.f65029b)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List<Pair<String, String>> list) {
        C6496s.h(endpoint, "endpoint");
        Collection collection = list;
        if (collection == null || collection.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        int i10 = 0;
        for (Object next : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            Pair pair = (Pair) next;
            if (i10 > 0) {
                instance.update((byte) 0);
            }
            byte[] bytes = ((String) pair.d()).getBytes(C5541d.f65029b);
            C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
            instance.update(bytes);
            arrayList.add(C6514M.f71813a);
            i10 = i11;
        }
        byte[] digest = instance.digest();
        C6496s.g(digest, "sha256Digest.digest()");
        String str = "";
        for (byte valueOf : digest) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(valueOf)}, 1));
            C6496s.g(format, "format(this, *args)");
            sb2.append(format);
            str = sb2.toString();
        }
        return C6565s.x0(C6565s.q(C6565s.x0(iterable, f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30, (Object) null), POST_PARAMS_ALGORITHM, str), Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        C6496s.h(endpoint, "endpoint");
        if (!endpoint.getSupportsSignatureVerification() || !this.signatureVerificationMode.getShouldVerify()) {
            return false;
        }
        return true;
    }

    public final VerificationResult verifyResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = str;
        String str9 = str2;
        C6496s.h(str8, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogUtilsKt.warnLog("Forcing signing error for request with path: " + str8);
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (str9 == null) {
            String format = String.format(NetworkStrings.VERIFICATION_MISSING_SIGNATURE, Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
            return VerificationResult.FAILED;
        } else if (str5 == null) {
            String format2 = String.format(NetworkStrings.VERIFICATION_MISSING_REQUEST_TIME, Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format2, "format(this, *args)");
            LogUtilsKt.errorLog$default(format2, (Throwable) null, 2, (Object) null);
            return VerificationResult.FAILED;
        } else if (str4 == null && str6 == null) {
            String format3 = String.format(NetworkStrings.VERIFICATION_MISSING_BODY_OR_ETAG, Arrays.copyOf(new Object[]{str}, 1));
            C6496s.g(format3, "format(this, *args)");
            LogUtilsKt.errorLog$default(format3, (Throwable) null, 2, (Object) null);
            return VerificationResult.FAILED;
        } else {
            try {
                Signature fromString$purchases_defaultsRelease = Signature.Companion.fromString$purchases_defaultsRelease(str9);
                Result<SignatureVerifier, PurchasesError> createIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(fromString$purchases_defaultsRelease);
                if (createIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                    String format4 = String.format(NetworkStrings.VERIFICATION_INTERMEDIATE_KEY_FAILED, Arrays.copyOf(new Object[]{str8, ((PurchasesError) ((Result.Error) createIntermediateKeyVerifierIfVerified).getValue()).getUnderlyingErrorMessage()}, 2));
                    C6496s.g(format4, "format(this, *args)");
                    LogUtilsKt.errorLog$default(format4, (Throwable) null, 2, (Object) null);
                    return VerificationResult.FAILED;
                } else if (createIntermediateKeyVerifierIfVerified instanceof Result.Success) {
                    if (((SignatureVerifier) ((Result.Success) createIntermediateKeyVerifierIfVerified).getValue()).verify(fromString$purchases_defaultsRelease.getPayload(), new Parameters(fromString$purchases_defaultsRelease.getSalt(), this.apiKey, str3, str, str7, str5, str6, str4).toSignatureToVerify())) {
                        String format5 = String.format(NetworkStrings.VERIFICATION_SUCCESS, Arrays.copyOf(new Object[]{str}, 1));
                        C6496s.g(format5, "format(this, *args)");
                        LogUtilsKt.verboseLog(format5);
                        return VerificationResult.VERIFIED;
                    }
                    String format6 = String.format(NetworkStrings.VERIFICATION_ERROR, Arrays.copyOf(new Object[]{str}, 1));
                    C6496s.g(format6, "format(this, *args)");
                    LogUtilsKt.errorLog$default(format6, (Throwable) null, 2, (Object) null);
                    return VerificationResult.FAILED;
                } else {
                    throw new C6535s();
                }
            } catch (InvalidSignatureSizeException e10) {
                String format7 = String.format(NetworkStrings.VERIFICATION_INVALID_SIZE, Arrays.copyOf(new Object[]{str8, e10.getMessage()}, 2));
                C6496s.g(format7, "format(this, *args)");
                LogUtilsKt.errorLog$default(format7, (Throwable) null, 2, (Object) null);
                return VerificationResult.FAILED;
            }
        }
    }
}

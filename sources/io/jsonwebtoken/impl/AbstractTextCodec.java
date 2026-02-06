package io.jsonwebtoken.impl;

import com.adjust.sdk.Constants;
import io.jsonwebtoken.lang.Assert;
import java.nio.charset.Charset;

public abstract class AbstractTextCodec implements TextCodec {
    protected static final Charset US_ASCII = Charset.forName("US-ASCII");
    protected static final Charset UTF8 = Charset.forName(Constants.ENCODING);

    public String decodeToString(String str) {
        return new String(decode(str), UTF8);
    }

    public String encode(String str) {
        Assert.hasText(str, "String argument to encode cannot be null or empty.");
        return encode(str.getBytes(UTF8));
    }
}

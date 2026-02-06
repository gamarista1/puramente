package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.InputStream;
import java.math.BigDecimal;

public abstract class GeneratorBase extends JsonGenerator {
    protected static final int DERIVED_FEATURES_MASK = ((JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask());
    protected static final int MAX_BIG_DECIMAL_SCALE = 9999;
    public static final int SURR1_FIRST = 55296;
    public static final int SURR1_LAST = 56319;
    public static final int SURR2_FIRST = 56320;
    public static final int SURR2_LAST = 57343;
    protected static final String WRITE_BINARY = "write a binary value";
    protected static final String WRITE_BOOLEAN = "write a boolean value";
    protected static final String WRITE_NULL = "write a null";
    protected static final String WRITE_NUMBER = "write a number";
    protected static final String WRITE_RAW = "write a raw (unencoded) value";
    protected static final String WRITE_STRING = "write a string";
    protected boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    protected JsonWriteContext _writeContext;

    protected GeneratorBase(int i10, ObjectCodec objectCodec) {
        this._features = i10;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i10) ? DupDetector.rootDetector((JsonGenerator) this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i10);
    }

    /* access modifiers changed from: protected */
    public String _asString(BigDecimal bigDecimal) {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > MAX_BIG_DECIMAL_SCALE) {
            _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), Integer.valueOf(MAX_BIG_DECIMAL_SCALE), Integer.valueOf(MAX_BIG_DECIMAL_SCALE)}));
        }
        return bigDecimal.toPlainString();
    }

    /* access modifiers changed from: protected */
    public void _checkStdFeatureChanges(int i10, int i11) {
        if ((DERIVED_FEATURES_MASK & i11) != 0) {
            this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i10);
            JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
            if (feature.enabledIn(i11)) {
                if (feature.enabledIn(i10)) {
                    setHighestNonEscapedChar(127);
                } else {
                    setHighestNonEscapedChar(0);
                }
            }
            JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            if (!feature2.enabledIn(i11)) {
                return;
            }
            if (!feature2.enabledIn(i10)) {
                this._writeContext = this._writeContext.withDupDetector((DupDetector) null);
            } else if (this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector((JsonGenerator) this));
            }
        }
    }

    /* access modifiers changed from: protected */
    public PrettyPrinter _constructDefaultPrettyPrinter() {
        return new DefaultPrettyPrinter();
    }

    /* access modifiers changed from: protected */
    public final int _decodeSurrogate(int i10, int i11) {
        if (i11 < 56320 || i11 > 57343) {
            _reportError("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11));
        }
        return ((i10 - SURR1_FIRST) << 10) + 65536 + (i11 - SURR2_FIRST);
    }

    /* access modifiers changed from: protected */
    public abstract void _releaseBuffers();

    /* access modifiers changed from: protected */
    public abstract void _verifyValueWrite(String str);

    public void close() {
        this._closed = true;
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= ~mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector((DupDetector) null);
            }
        }
        return this;
    }

    public JsonGenerator enable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features |= mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = true;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(127);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION && this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector((JsonGenerator) this));
            }
        }
        return this;
    }

    public abstract void flush();

    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    public Object getCurrentValue() {
        return this._writeContext.getCurrentValue();
    }

    public int getFeatureMask() {
        return this._features;
    }

    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    public boolean isClosed() {
        return this._closed;
    }

    public final boolean isEnabled(JsonGenerator.Feature feature) {
        if ((feature.getMask() & this._features) != 0) {
            return true;
        }
        return false;
    }

    public JsonGenerator overrideStdFeatures(int i10, int i11) {
        int i12 = this._features;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this._features = i13;
            _checkStdFeatureChanges(i13, i14);
        }
        return this;
    }

    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    public void setCurrentValue(Object obj) {
        this._writeContext.setCurrentValue(obj);
    }

    @Deprecated
    public JsonGenerator setFeatureMask(int i10) {
        int i11 = this._features ^ i10;
        this._features = i10;
        if (i11 != 0) {
            _checkStdFeatureChanges(i10, i11);
        }
        return this;
    }

    public JsonGenerator useDefaultPrettyPrinter() {
        if (getPrettyPrinter() != null) {
            return this;
        }
        return setPrettyPrinter(_constructDefaultPrettyPrinter());
    }

    public Version version() {
        return PackageVersion.VERSION;
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i10) {
        _reportUnsupportedOperation();
        return 0;
    }

    public void writeFieldName(SerializableString serializableString) {
        writeFieldName(serializableString.getValue());
    }

    public void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    public void writeRawValue(String str) {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    public void writeStartObject(Object obj) {
        writeStartObject();
        JsonWriteContext jsonWriteContext = this._writeContext;
        if (!(jsonWriteContext == null || obj == null)) {
            jsonWriteContext.setCurrentValue(obj);
        }
        setCurrentValue(obj);
    }

    public void writeString(SerializableString serializableString) {
        writeString(serializableString.getValue());
    }

    public void writeTree(TreeNode treeNode) {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, treeNode);
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined");
    }

    public void writeRawValue(String str, int i10, int i11) {
        _verifyValueWrite("write raw value");
        writeRaw(str, i10, i11);
    }

    public void writeRawValue(char[] cArr, int i10, int i11) {
        _verifyValueWrite("write raw value");
        writeRaw(cArr, i10, i11);
    }

    protected GeneratorBase(int i10, ObjectCodec objectCodec, JsonWriteContext jsonWriteContext) {
        this._features = i10;
        this._objectCodec = objectCodec;
        this._writeContext = jsonWriteContext;
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i10);
    }

    public void writeRawValue(SerializableString serializableString) {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }
}

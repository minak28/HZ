package im.tox.tox4j.core.options;

import im.tox.tox4j.core.enums.ToxSavedataType;

public class SaveDataOptions {
    /**
     * The low level [[ToxSavedataType]] enum to pass to [[ToxCore.load]].
     */
    public ToxSavedataType kind;

    /**
     * Serialised save data. The format depends on [[kind]].
     */
    public byte[] data;

    public SaveDataOptions(ToxSavedataType kind, byte[] data) {
        this.kind = kind;
        this.data = data;
    }

    public static SaveDataOptions None = new SaveDataOptions(ToxSavedataType.NONE, new byte[] {});

    public static SaveDataOptions ToxSave = new SaveDataOptions(ToxSavedataType.TOX_SAVE, null);

    public static SaveDataOptions SecretKey = new SaveDataOptions(ToxSavedataType.SECRET_KEY, null);
}
